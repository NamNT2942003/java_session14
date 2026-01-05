package Kha2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> validNumbers = new ArrayList<>();
        int invalidCount = 0;
        System.out.println("--- CHƯƠNG TRÌNH CHUYỂN ĐỔI CHUỐI SANG SỐ NGUYÊN -- ");
        System.out.println("Nhập các chuỗi (nhập 'exit' để kết thúc): ");

        do {
            System.out.println("Nhập giá trị: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try{
                int number = Integer.parseInt(input);
                validNumbers.add(number);

            }catch(Exception e){
                System.out.println(e.getMessage());
                invalidCount++;
            }
        }while (true);

        System.out.println("\n---------------- KẾT QUẢ THỐNG KÊ ----------------");
        System.out.println("Tổng số chuỗi hợp lệ (Số nguyên): " + validNumbers.size());
        System.out.println("Tổng số chuỗi không hợp lệ      : " + invalidCount);

        System.out.println("Danh sách các số nguyên đã chuyển đổi thành công: ");
        if (validNumbers.isEmpty()) {
            System.out.println("(Trống)");
        }else {
            System.out.println(validNumbers);
        }



    }
}
