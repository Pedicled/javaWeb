package study.web.pojo;

import java.util.List;

public class OrderPro {
    private Integer id;

    private Integer ordersid;

    private Integer proid;
    
    private List<Products> productList;
   
    
    public List<Products> getProductList() {
        return productList;
    }

    public void setProductList(List<Products> productList) {
        this.productList = productList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(Integer ordersid) {
        this.ordersid = ordersid;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }
    
    public String toString(){
    	return "OrderPro [id="+id+",ordersid="+ordersid+",proid="+proid+",productList="+productList+"]";
    }
}