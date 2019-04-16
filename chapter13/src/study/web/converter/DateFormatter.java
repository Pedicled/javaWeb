package study.web.converter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 使用Formatter自定义日期转换器
 */
public class DateFormatter implements Formatter<Date> {
    String datepattern = "yyyy-MM-dd HH:mm:ss";
    private SimpleDateFormat simpleDateFormat;

    @Override
    public String print(Date date,Locale locale){
        return new SimpleDateFormat().format(date);
    }
    @Override
    public Date parse(String source,Locale locale) throws ParseException {
        simpleDateFormat = new SimpleDateFormat(datepattern);
        return simpleDateFormat.parse(source);
    }
}
