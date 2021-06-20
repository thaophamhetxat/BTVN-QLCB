package com.codegym;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ManagerCanBo managerCanBo = new ManagerCanBo();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("1. Them can bo");
            System.out.println("2. show");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1: {
                    System.out.println("1. Them nhan vien");
                    System.out.println("2. Them cong nhan");
                    System.out.println("3. Them ky su");
                    int select = Integer.parseInt(scanner.nextLine());
                    switch (select) {
                        case 1:
                            managerCanBo.addNhanVien();
                            break;
                        case 2:
                            managerCanBo.addCongNhan();
                            break;
                        case 3:
                            managerCanBo.addKySu();
                            break;
                    }
                }
                case 2: managerCanBo.show();break;1
            }

        }
    }
}
