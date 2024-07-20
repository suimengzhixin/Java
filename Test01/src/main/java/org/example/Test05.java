package org.example;
import java.util.Random;
public class Test05 {
    public static void main(String[] aaaargs){
        int score[][] = new int[10][10];
        Random random = new Random();
        for (int i = 0 ; i < 10 ;i++){
            for (int j = 0 ;j < 9 ;j++){
                if (i == 0){
                    score[i][j] = 1;
                    score[i][j+1] = score[i][j] + 1;
                }else {
                    int r = random.nextInt(10)+1;
                    score[i][j] = r;
                }
            }
        }
        for (int i = 0 ;i < 10 ;i++){
            for (int j = 0 ;j < 10 ;j++){
                System.out.print(score[i][j]);
            }
            System.out.println(" ");
        }
    }
}
