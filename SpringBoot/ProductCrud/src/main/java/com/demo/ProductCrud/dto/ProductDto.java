package com.demo.ProductCrud.dto;

import java.time.LocalDate;

public class ProductDto {

    private int pid;
    private String pname;
    private double price;   // changed datatype to double
    private String mgfdate;

    public ProductDto() {
        super();
    }

    public ProductDto(int pid, String pname, double price, String mgfdate) {
        super();
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.mgfdate = mgfdate;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {   // updated getter
        return price;
    }

    public void setPrice(double price) {   // updated setter
        this.price = price;
    }

    public String getMgfdate() {
        return mgfdate;
    }

    public void setMgfdate(String mgfdate) {
        this.mgfdate = mgfdate;
    }

    @Override
    public String toString() {
        return "ProductDto [pid=" + pid + ", pname=" + pname + ", price=" + price + ", mgfdate=" + mgfdate + "]";
    }
}
