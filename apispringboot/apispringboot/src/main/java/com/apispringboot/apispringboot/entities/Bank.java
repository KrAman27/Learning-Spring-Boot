package com.apispringboot.apispringboot.entities;

public class Bank {
    private long id;
    private String name;
    private String headOffice;

    public Bank(long id, String name, String headOffice) {
        super();
        this.id = id;
        this.name = name;
        this.headOffice = headOffice;
    }

    public Bank()   {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOffice() {
        return headOffice;
    }

    public void setHeadOffice(String headOffice) {
        this.headOffice = headOffice;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", headOffice='" + headOffice + '\'' +
                '}';
    }
}
