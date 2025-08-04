package learning_java;

import java.util.Scanner;

public class operadoresAritméticos {
    
    public static void Soma(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        var number1 = scanner.nextInt();
        System.out.println("Informe o segundo numero");
        var number2 = scanner.nextInt();
        System.out.printf("%s + %s = %s", number1, number2, number1 + number2);
    }

    public static void subtração(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        var number1 = scanner.nextInt();
        System.out.println("Informe o segundo numero");
        var number2 = scanner.nextInt();
        System.out.printf("%s - %s = %s", number1, number2, number1 - number2);
    }

    
    public static void divisão(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        var number1 = scanner.nextFloat();
        System.out.println("Informe o segundo numero");
        var number2 = scanner.nextFloat();
        System.out.printf("%s / %s = %s", number1, number2, number1 / number2);
    }

     public static void restoPorcentagem(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        var number1 = scanner.nextInt();
        System.out.println("Informe o segundo numero");
        var number2 = scanner.nextInt();
        System.out.printf("%s %% %s = %s", number1, number2, number1 % number2);
    }
     
    
     public static void Multiplicação(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        var number1 = scanner.nextInt();
        System.out.println("Informe o segundo numero");
        var number2 = scanner.nextInt();
        System.out.printf("%s * %s = %s", number1, number2, number1 * number2);
    }
}
