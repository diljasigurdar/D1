package com.company;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 1000000;
        int T = 10;
        unitTest(N, T);
    }

    public static void unitTest(int N, int T){
        Stopwatch timer = new Stopwatch();
        N = couponCollectorTest(N);
        StdOut.println(N + " numbers were generated in the process.");
        double stopTime = timer.elapsedTime();
        StdOut.println(stopTime + " Seconds.");
        CouponCollectorStats stats = new CouponCollectorStats(N, T);
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

    public static class CouponCollectorStats  {
        public CouponCollectorStats(int N, int T) {
            //Smiðurinn kallar í couponCollectorTest(int N) og gerir T-tilraunir - hver tilraun inniheldur N-cards
            double[] timeList = new double[T];
            int counter = 0;
            while (counter < T){
                Stopwatch timer = new Stopwatch();
                couponCollectorTest(N);
                double totalTime = timer.elapsedTime();
                timeList[counter] = totalTime;
                counter++;
            }
            mean(timeList);
            stddev(timeList);
        }
        public static double mean(double[] timeList) {
            //Tekur saman tímana sem hver tilraun tók og prentar meðaltal.
            // Takes timeList in as a parameter and calculates average time
            double mean = StdStats.mean(timeList);
            StdOut.println("Mean: " + mean);
            return 0;
        }
        public static double stddev(double[] timeList) {
            //Tekur saman tímana sem hver tilraun tók og prentar standard deviations.
            // Takes timeList in as a parameter and calculates the standar deviations.
            double derivation = StdStats.stddev(timeList);
            StdOut.println("Stddev: " + derivation);
            return 0;
        }
    }
}
