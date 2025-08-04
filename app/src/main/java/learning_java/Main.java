package learning_java;

import java.util.Scanner;

/*public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ola, qual seu nome");
        String name = scanner.next();
        System.out.println("informe sua idade");
        int age = scanner.nextInt();
        System.out.println("Ola " + name + " voce tem " + age + " anos");
        } 
}*/


/* Tipos primitivos
public class Main {

    public static void main(String[] args) {
        byte number = 1;
        short number2 = 1;
        int number3 = 1;
        long number4 = 1L;
        float number5 = 1.1f;
        double number6 = 1.1d;
        char character = 'a';  
        boolean status = true;      
    }
}*/


/*  Operadores de atribuição e Logicos
public class Main {
    
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2");
        var result = scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("Voce acertou? ", isRight);
        if(isRight) System.out.println("Parabens");

        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2");
        var result = scanner.nextInt();
        var isWrong = result != 4;
        System.out.printf("Voce errou? ", !isWrong);

        var scanner = new Scanner(System.in); 
        System.out.println("Quantos anos vc tem?");
        var age = scanner.nextInt();
        System.out.println("Voce é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || isEmancipated && age >= 16;
        System.out.printf("Voce pode dirigir? ", canDrive);
    }
}
    */