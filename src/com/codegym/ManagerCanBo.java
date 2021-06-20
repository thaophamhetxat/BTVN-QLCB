package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagerCanBo {
    static ArrayList<CanBo> canBo = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static SortCanBo sortCanBo = new SortCanBo();

    public void addNhanVien() {
        System.out.println("Ten:");
        String name = scanner.nextLine();
        System.out.println("Nam sinh:");
        String namSinh = scanner.nextLine();
        System.out.println("Gioi tinh:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Dia chi:");
        String diaChi = scanner.nextLine();

        NhanVien nhanVien = new NhanVien(name, namSinh, gioiTinh, diaChi);
        canBo.add(nhanVien);
    }

    public void addCongNhan() {
        System.out.println("Ten: ");
        String name = scanner.nextLine();
        System.out.println("Nam sinh:");
        String namSinh = scanner.nextLine();
        System.out.println("Gioi tinh:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Dia chi:");
        String diaChi = scanner.nextLine();
        System.out.println("Bac:");
        String bac = scanner.nextLine();
        System.out.println("Nganh:");
        String nganh = scanner.nextLine();

        CongNhan congNhan = new CongNhan(name, namSinh, gioiTinh, diaChi, bac, nganh);
        canBo.add(congNhan);

    }

    public void addKySu() {

        System.out.println("Ten:");
        String name = scanner.nextLine();
        System.out.println("Nam sinh:");
        String namSinh = scanner.nextLine();
        System.out.println("Gioi tinh:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Dia chi:");
        String diaChi = scanner.nextLine();
        System.out.println("Nganh:");
        String nganh = scanner.nextLine();
        KySu kySu = new KySu(name, namSinh, gioiTinh, diaChi, nganh);
        canBo.add(kySu);
    }

    public void show() {
        for (CanBo c : canBo) {
            System.out.println(c);
        }
    }

    public void search() {
        String index = scanner.nextLine();
        for (CanBo c : canBo) {
            if (c.getName().equals(index)) {
                System.out.println(c);
            }
        }
    }

    public void delete() {
        String indexdel = scanner.nextLine();
        canBo.removeIf(x -> x.getName().equals(indexdel));
    }

    public void edit() {
        CanBo count = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String index4 = scanner.nextLine();

        System.out.println("Ten:");
        String name = scanner.nextLine();
        System.out.println("Nam sinh:");
        String namSinh = scanner.nextLine();
        System.out.println("Gioi tinh:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Dia chi:");
        String diaChi = scanner.nextLine();


        for (CanBo s : canBo) {
            if (s.getName().equals(index4)) {
                s.setName(name);
                s.setNamSinh(namSinh);
                s.setGioiTinh(gioiTinh);
                s.setDiaChi(diaChi);
            }
        }

    }
    public void sort(){
        Collections.sort(canBo,sortCanBo);
    }
    public void searchInName(String index02){
        for (CanBo c: canBo){
            if(c instanceof CongNhan){
                if(((CongNhan) c).getNganh().equals(index02)){
                    System.out.println(c);
                }
            }if(c instanceof KySu){
                if(((KySu) c).getNganh().equals(index02)){
                    System.out.println(c);
                }
            }
        }
    }



}
