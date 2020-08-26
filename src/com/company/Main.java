package com.company;

import edu.princeton.cs.algs4.StdOut;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 100;
        //StdOut.println(N);
        N = couponCollectorTest(N);
        //StdOut.println(N);
    }

    public static int couponCollectorTest(int N){
        //Býr til random tölur 0-N þangað til allar tölur hafa komið upp OG prentar út hversu margar tölur í heildina voru búnar til í ferlinu.
        return N;
    }

    public static int getRandomNumber(int N){
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
