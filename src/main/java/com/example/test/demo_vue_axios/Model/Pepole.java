package com.example.test.demo_vue_axios.Model;

public class Pepole {
    private Integer id;
    private String pname;
    private String pgender;
    private Integer page;
    private String paddress;

    public Pepole(Integer id, String pname, String pgender, Integer page, String paddress) {
        this.id = id;
        this.pname = pname;
        this.pgender = pgender;
        this.page = page;
        this.paddress = paddress;
    }

    public Pepole() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }
}
