package co.dev;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n : ");
        n = sc.nextInt();
        if(snt(n) == true) System.out.println( n + " la so nguyen to.");
        else System.out.println( n + " khong phai so nguyen to.");      
    }
    public static boolean snt(int n){
        if( n == 0 || n == 1) return false;
        for(int i = 2; i<= n -1; i ++){
            if ( n % i == 0) return false;
        }
        return true;
    }
    
}
