package org.example;
import java.util.Scanner;
public class Test04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数n");
        int n = scanner.nextInt();
        int a[][] = new int[n][n];
        int count = 0;
        int count1 =0;
        int sum = 0;
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                int num = scanner.nextInt();
                a[i][j] = num;
            }
        }
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                if (i == 0||i == n-1){
                    count += a[i][j];
                }else {
                    count1 = a[i][0] + a[i][n-1];
                }
            }
        }
        for (int c = 0;c < n;c++){
            for (int b = 0; b <n;b++){
                System.out.print(a[c][b]);
            }
            System.out.println(" ");
        }
        sum = count + count1;
        System.out.println(sum);
    }
}
