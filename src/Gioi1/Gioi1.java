package Gioi1;

import java.util.Scanner;

public class Gioi1 {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rawAmount = 1000000;

        do {
            try {
                System.out.println("Nhập vào số tiền cần rút: ");
                int amount = Integer.parseInt(scanner.nextLine());
                if (amount > rawAmount) {
                    System.out.println("Lỗi : Số tiền rút vượt quá số dư! ");

                }else if(amount <= 0){
                    System.out.println("Vui lòng nhập vào 1 số hợp lệ");
                }
                else if (rawAmount - amount <= 50000) {
                    System.out.println("Lỗi: Tài khoản phải duy trì số dư tối thiểu 50.000 đồng!");
                }
                else {
                    rawAmount = rawAmount - amount;
                    System.out.println("Số tiền đã rút: " + amount);
                    System.out.println("Số tiền còn lại: "+ rawAmount);
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập vào 1 số hợp lệ");
            }
        }while(true);
    }
}
