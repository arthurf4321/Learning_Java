package learning_java;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ola, qual seu nome");
        String name = scanner.next();
        System.out.println("informe sua idade");
        int age = scanner.nextInt();
        System.out.println("Ola " + name + " voce tem " + age + " anos");
        } 
}