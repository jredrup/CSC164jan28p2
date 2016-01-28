package com.company;

public class Main {

    public static void main(String[] args) {
	    int a = 7;
        int b = 4;
        int c = 8;
        System.out.println("The biggest number is " + biggest ((biggest (a,b)), c) + ".");

    }
    /*private static int biggest (int n1, int n2, int n3){
        return (n1 > n2) ? n1 : n2;
    }*/
    static int biggest (int n1, int n2){
        return (n1 > n2) ? n1 : n2;
        /*if (n1 > n2)
            return n1;
        else
            return n2;*/
    }
}
