package Algorithm;

import java.util.Scanner;

/**
 * @author xupeng
 * @date 2020/12/22 10:54
 * @description  Q:实现一个函数，使得传入一个正整数N, 打印出1到N之前的所有整数
 *
 * 总结：针对算法一，算法二，当N的值足够大的时候，算法二会报  java.lang.StackOverflowError
 *       原因是递归程序对空间的占用量大，空间不足时，程序就会奔溃；
 *       当然，递归会让程序足够简洁
 *
 */

public class PrintN {

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        int N = 100;
        printN(N);
//          printNDG(N);
    }

    /**
     * 算法一,普通循环
     */
    public static void printN(int N){
        int i = 1;
        while(i<=N){
            System.out.println(i++);
        }
        return;
    }

    /**
     * 算法二，递归实现
     */
    public static void printNDG(int N){
        if(N != 0){
            printNDG(N-1);
            System.out.println(N);
        }
        return;
    }
}

