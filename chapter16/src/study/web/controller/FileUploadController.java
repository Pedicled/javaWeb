package study.web.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.propertyeditors.InputSourceEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

@Controller
public class FileUploadController {

    @RequestMapping("/fileUpload")
    public String handleFormUpload(@RequestParam("name") String name, @RequestParam("uploadfile") List<MultipartFile> uploadfile,
                                   HttpServletRequest httpServletRequest){
        if(!uploadfile.isEmpty() && uploadfile.size()>0){
            for(MultipartFile file:uploadfile){
                String originalFilename = file.getOriginalFilename();
                String dirPath = httpServletRequest.getServletContext().getRealPath("/upload/");
                File filePath = new File(dirPath);
                if(!filePath.exists()){
                    filePath.mkdirs();
                }
                String newFilename = name+"_"+ UUID.randomUUID()+"_"+originalFilename;
                try{
                    file.transferTo(new File(dirPath+newFilename));
                }
                catch(Exception e){
                    e.printStackTrace();
                    return "error";
                }
            }
            return "success";
        }
        else
            return "error";
    }

    @RequestMapping("/download")
    public ResponseEntity<byte[]> fileDownload(HttpServletRequest httpServletRequest,String filename) throws Exception{
        String path = httpServletRequest.getServletContext().getRealPath("/upload/");
        File file = new File(path+File.separator+filename);
        filename = this.getFilename(httpServletRequest,filename);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentDispositionFormData("attachment",filename);
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),httpHeaders,HttpStatus.OK);
    }

    public String getFilename(HttpServletRequest httpServletRequest,String filename) throws Exception{
        String[] IEBrowserKeyWords = {"MSIE","Trident","Edge"};
        String userAgent = httpServletRequest.getHeader("User-Agent");
        for(String keyWord: IEBrowserKeyWords) {
            if (userAgent.contains(keyWord)) {
                return URLEncoder.encode(filename, "UTF-8");
            }
        }
        return new String(filename.getBytes("UTF-8"),"ISO-8859-1");
    }
}
