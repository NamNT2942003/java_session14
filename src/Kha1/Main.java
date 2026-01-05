package Kha1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào 1 số nguyên ");
            try {
                int number = Integer.parseInt(sc.nextLine());
                if(number > 0) {
                   if (PrimeCheck(number)) {
                       System.out.println("Đây là số nguyên tố ");
                   }else {
                       System.out.println("Không phải số nguyên tố");
                   }

                }else {
                    System.out.println("Số nguyên phải là số lớn hơn 0");
                }
            }catch (Exception e){
                System.out.println("Số không hợp lệ. Vui lòng nhập lại ");
            }
        }while (true);
    }
   public static boolean PrimeCheck(int number) {
        if( number <= 1 ){
            return false;
        }
        for(int i = 2; i < number; i++ ){
            if( number % i == 0 ){
                return false;
            }
        }
        return true;
   }
}
