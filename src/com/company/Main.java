package com.company;

import edu.princeton.cs.algs4.StdOut;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int N = 100000;
        N = couponCollectorTest(N);
        StdOut.println(N + " numbers were generated in the process.");
        long stopTime = System.nanoTime();
        StdOut.println(stopTime - startTime + " Nano Seconds.");
    }

    public static int couponCollectorTest(int N){
        // Get random integer until we get all of N and than print out total times of random integers.
        int counter = 0;
        int index = 0;
        int[] myNum = new int[N];

        while (index <= N){
            int x = getRandomNumber(N);
            counter++;
            if (myNum[x] == 0) {    // Check if we have already collected the number.
                myNum[x] = x;
                index++;
            }
        }
        return counter;
    }

    public static int getRandomNumber(int N){
        // Get Random number and return it.
        Random rand = new Random();
        return rand.nextInt(N);
    }


    void CouponCollectorStats(int N, int T){
        //Smiðurinn kallar í couponCollectorTest(int N) og gerir T-tilraunir - hver tilraun inniheldur N-cards
    }

    void mean(){
        //Tekur saman tímana sem hver tilraun tók og prentar meðaltal.
    }

    void stddev(){
        //Tekur saman tímana sem hver tilraun tók og prentar standard deviations.

    }
}
