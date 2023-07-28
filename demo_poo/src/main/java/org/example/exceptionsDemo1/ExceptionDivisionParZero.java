package org.example.exceptionsDemo1;
import java.util.Scanner;
public class ExceptionDivisionParZero {
    public static int calcul(int a,int b){
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.print("Donner a:");int a=clavier.nextInt();
        System.out.print("Donner b:");int b=clavier.nextInt();
        int resultat=calcul(a, b);
        System.out.println("Resultat="+resultat);
    }}

// Si b=0 ==> EXCEPTION
// Message affiché :
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at org.example.exceptions.ExceptionDemo.calcul(ExceptionDemo.java:5)
//	at org.example.exceptions.ExceptionDemo.main(ExceptionDemo.java:12)