package org.example;
import java.util.Scanner;
public class Test03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a[][] = new String[5][4];
        for (int i = 0; i < 5;i++){
            for (int j = 0; j < 4;j++){
                if (j == 0){
                    System.out.println("输入星期");
                }else{
                    System.out.println("输入课程");
                }
                a[i][j] = scanner.next();
            }
        }
        System.out.println("输入查找日期(1-5)");
        int day = scanner.nextInt();
        System.out.println("输入查找课次");
        int keci = scanner.nextInt();
        boolean c = true;
        while (c){
            System.out.println(a[keci][day-1]);
            c = false;
        }
    }
}
