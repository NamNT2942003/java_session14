package Gioi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gioi2 {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> validNumbers = new ArrayList<>();
        List<String> invalidNumbers = new ArrayList<>();

        System.out.println("--- CHƯƠNG TRÌNH KIỂM TRA SỐ ĐIỆN THOẠI ---");
        System.out.println("Nhập danh sách số điện thoại (ngăn cách bởi dấu phẩy):");
        System.out.println("Ví dụ: 0912345678, 0987abc, 12345");

        String input = scanner.nextLine();

        String[] phoneList = input.split(",");

        for (String phone : phoneList) {
            String cleanPhone = phone.trim();
            if (cleanPhone.isEmpty()) continue;
            try {
                InvalidPhoneNumberLengthException.validate(phone);
                validNumbers.add(cleanPhone);
            }catch (InvalidPhoneNumberLengthException e){
                invalidNumbers.add(cleanPhone);
            }
        }
        System.out.println("\n---------------- KẾT QUẢ ----------------");

        System.out.println("1. Danh sách số điện thoại HỢP LỆ:");
        if (validNumbers.isEmpty()) {
            System.out.println("   (Không có)");
        } else {
            for (String p : validNumbers) {
                System.out.println("   + " + p);
            }
        }
        System.out.println("\n2. Danh sách số điện thoại KHÔNG HỢP LỆ:");
        if (invalidNumbers.isEmpty()) {
            System.out.println("   (Không có)");
        } else {
            for (String p : invalidNumbers) {
                System.out.println("   - " + p);
            }
        }

    }
}
