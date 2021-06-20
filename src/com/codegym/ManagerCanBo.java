package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerCanBo {
    static ArrayList<CanBo> canBo = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void addNhanVien() {
        System.out.println("Ten:");
        String name = scanner.nextLine();
        System.out.println("Nam sinh:");
        String namSinh = scanner.nextLine();
        System.out.println("Gioi tinh:");
        String gioiTinh = scanner.nextLine();
        System.out.println("Dia chi:");
        String diaChi = scanner.nextLine();

        CanBo canBos = new CanBo(name, namSinh, name, namSinh, gioiTinh);
        canBo.add(canBos);
    }

    public void addCongNhan() {
        System.out.println("Ten:");
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

        CanBo canBos1 = new CanBo(name, namSinh, gioiTinh, diaChi, bac);
        canBo.add(canBos1);

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
        CanBo canBos2 = new CanBo(name, namSinh, gioiTinh, diaChi, nganh);
        canBo.add(canBos2);
    }
    public void show(){
        for(CanBo c:canBo){
            System.out.println(c);
        }
    }

}
