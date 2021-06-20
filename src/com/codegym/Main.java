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
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Tìm kiếm và xóa");
            System.out.println("4. Edit nhân vien theo tên");
            System.out.println("5. Hiển thị danh sách nhân viên");
            System.out.println("6. Xắp xếp theo tên");
            System.out.println("7. Tìm kiếm cán bộ theo ngành");
            System.out.println("8. Exit");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1: {
                    System.out.println("   1. Them nhan vien");
                    System.out.println("   2. Them cong nhan");
                    System.out.println("   3. Them ky su");
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
                }break;
                case 5: managerCanBo.show();break;
                case 2: {
                    System.out.println("Nhập tên cần tim: ");
                    managerCanBo.search();
                }break;
                case 3:{
                    System.out.println("Nhập tên cần xóa: ");
                    managerCanBo.delete();
                }break;
                case 4:managerCanBo.edit();break;
                case 8: System.exit(0);
                case 6: managerCanBo.sort();break;
                case 7:{
                    System.out.println("Tìm kiếm nhân viên:");
                    String index02 = scanner.nextLine();
                    managerCanBo.searchInName(index02);
                }break;

            }

        }
    }
}
