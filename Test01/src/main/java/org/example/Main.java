package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("输入数字");
        for (int i = 0;i < 10;i++){
            a[i] = scanner.nextInt();
        }
        //开始交换
        int start = 0;
        int end = a.length-1;
        int temp = 0;
        while (start < end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        //打印交换过得数组a
        for (int c = 0; c < a.length;c++){
            System.out.print(a[c]);
        }
    }
}