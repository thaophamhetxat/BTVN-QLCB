package com.codegym;

public class CongNhan extends CanBo {
    String bac;
    String nganh;

    public CongNhan() {
    }

    public CongNhan(String bac, String nganh) {
        this.bac = bac;
        this.nganh = nganh;
    }

    public CongNhan(String name, String namSinh, String gioiTinh, String diaChi, String bac, String nganh) {
        super(name, namSinh, name, namSinh, gioiTinh);
        this.bac = bac;
        this.nganh = nganh;
    }


    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "name='" + name + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", bac='" + bac + '\'' +
                ", nganh='" + nganh + '\'' +
                '}';
    }
}
