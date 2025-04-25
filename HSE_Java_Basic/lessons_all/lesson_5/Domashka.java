package HSE_Java_Basic.lessons_all.lesson_5;

import java.util.Scanner;

public class Domashka {
    public static void main(String[] args) {
        int m = input("m=");
        int n = input("n=");

        int[][] arr = new int[m][n];
        fill2DArray(arr);
        print2DArray(arr);
    }

    private static int[][] fill2DArray(int[][] m){
        for(int j=0;j<m.length;j++){
            for(int i =0;i<m[j].length;i++)
                    m[j][j % 2 ==0 ? i: m[j].length -i -1] = j*m[j].length+1+i;
        }
        return m;
    }

    private static void print2DArray(int[][] m){
        for(int j=0;j<m.length;j++){
            for(int i = 0;i<m[j].length;i++)
                System.out.printf("%4d",m[j][i]);
            System.out.println();
        }
    }
    
    private static int input(String promt){
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        return v;
    }
}
