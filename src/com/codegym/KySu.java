package com.codegym;

public class KySu extends CanBo{
    String nganh;

    public KySu() {
    }

    public KySu(String nganh) {
        this.nganh = nganh;
    }

    public KySu(String name, String namSinh, String gioiTinh, String diaChi, String nganh) {
        super(name, namSinh, gioiTinh, diaChi);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "name='" + name + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", nganh='" + nganh + '\'' +
                '}';
    }
}
