package com.codegym;

public class NhanVien extends CanBo{
    public NhanVien() {
    }

    public NhanVien(String name, String namSinh, String gioiTinh, String diaChi) {
        super(name, namSinh, name, namSinh, gioiTinh);
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
