package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static int n;
    public static void main(String[] args) {

    }
    public static int[][] in(){
        try {
            Scanner scanner = new Scanner(new File("be.txt"));
            n=scanner.nextInt();
            int[][] V = new int[n][n];
            int m = scanner.nextInt();
            int x,y,z;
            for(int i=0; i<m;i++){
                x = scanner.nextInt();
                y = scanner.nextInt();
                z = scanner.nextInt();
                V[x][y]=z;
                V[y][x]=z;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
