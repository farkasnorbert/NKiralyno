package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int N;
    private static int[][] T;
    private static int[] q;
    private static int[] md;
    private static int[] sd;
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        N = scanner.nextInt();
        q = new int[N];
        T = new int[N][N];
        Random random = new Random();
        md = new int[N*2];
        sd = new int[N*2];
        for(int i=0; i<N;i++){
            q[i]=random.nextInt(N + 1);
            T[i][q[i]]=1;
        }
        out();
        calcms();
        /*for(int i=0;i<N*2-1;i++){
            System.out.print(md[i]+" ");
        }
        System.out.println();
        for(int i=0;i<N*2-1;i++){
            System.out.print(sd[i]+" ");
        }*/
        for(int quen=0; quen<N; quen++){
            while (colls()!=0) {
                q[quen]=;
                for(int i=0; i<N;i++){
                    T[i][q[i]]=1;
                }
                out();
                calcms();
                int s;
                do {
                    s=0;
                    for (int i=0;i<N;i++) {
                        for (int j = i + 1; j < N; j++) {
                            if()
                        }
                    }
                }while (s!=0);
            }
        }
        out();
    }
    private static int colls(){
        int o = 0;
        for (int i=0;i<N*2;i++){
            if(sd[i]>1) {
                o += sd[i] - 1;
            }
            if(md[i]>1){
                o+=md[i]-1;
            }
        }
    }
    static boolean  is_attacked(int i,int j){
        if(i!=0 && j!=0){
            return T[i-1][j-1]==1;
        }
        if (i!=N-1 && j!=N-1){
            return T[i+1][j+1]==1;
        }
        if(i!=N-1 && j!=0){
            return T[i+1][j-1]==1;
        }
        if(i!=0 && j!=N-1){
            return T[i][j] == 1;
        }
        return false;
    }
    private static void out(){
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                System.out.print(T[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void calcms(){
        Arrays.fill(md,0);
        Arrays.fill(sd,0);
        for(int k=0; k<N*2-1;k++){
            int im,jm,is,js;
            if(k<N){
                im=0;
                jm=N-k-1;
                is=0;
                js=k;
            }else{
                im=k-N+1;
                jm=0;
                is=k-N+1;
                js=N-1;
            }
            while (im<=N-1 && jm<=N-1){
                if(T[im][jm]==1){
                    System.out.println(im+" "+jm+" "+(N*2-1-k-1));
                    md[N*2-1-k-1]++;
                }
                im++;
                jm++;
            }
            while (is<=N-1 && js>=0){
                if(T[is][js]==1){
                    sd[k]++;
                }
                is++;
                js--;
            }
        }
    }
}
