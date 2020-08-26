package com.company;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 10000;
        int T = 3;
        unitTest(N, T);
    }

    public static void unitTest(int N, int T){
        int counter = 0;
        Stopwatch timer = new Stopwatch();
        counter = couponCollectorTest(N);
        StdOut.println(counter + " numbers were generated in the process.");
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
            //This method calls couponCollectorTest(int N) method T many times.
            double[] timeList = new double[T];
            int counter = 0;
            while (counter < T){
                Stopwatch timer = new Stopwatch();
                couponCollectorTest(N);
                double totalTime = timer.elapsedTime();
                timeList[counter] = totalTime;
                counter++;
            }
            double meanTime = mean(timeList);
            StdOut.println("Mean: " + meanTime);

            double deviationTime = stddev(timeList);
            StdOut.println("Standard deviation: " + deviationTime);

        }
        public static double mean(double[] timeList) {
            // Takes timeList in as a parameter and calculates average time
            double mean = StdStats.mean(timeList);
            return mean;
        }
        public static double stddev(double[] timeList) {
            // Takes timeList in as a parameter and calculates the standard deviations.
            double deviation = StdStats.stddev(timeList);
            return deviation;
        }

    }
}
