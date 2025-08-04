package learning_java;

import java.util.Scanner;

public class Operadores_atribuiçãoe_Logicos {
    
    public static void quizSoma(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2");
        var result = scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("Voce acertou? ", isRight);
        if(isRight) System.out.println("Parabens");
    }

    public static void quizErro(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2");
        var result = scanner.nextInt();
        var isWrong = result != 4;
        System.out.printf("Voce errou? ", !isWrong);
    }

      public static void testDrive(String[] args) {
        
        var scanner = new Scanner(System.in); 
        System.out.println("Quantos anos vc tem?");
        var age = scanner.nextInt();
        System.out.println("Voce é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || isEmancipated && age >= 16;
        System.out.printf("Voce pode dirigir? ", canDrive);
    }
}
