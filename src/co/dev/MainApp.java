package co.dev;

import java.util.Scanner;

public class MainApp {
	 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập  n");
		int n = sc.nextInt();
    	int Tong = 0;
        for (int i = 1; i <= n; i++) {
            Tong = Tong + i;
        } 
        System.out.println("Tổng là = " + Tong);
    }
 }
