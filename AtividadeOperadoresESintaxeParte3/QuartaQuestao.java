package AtividadeOperadoresESintaxeParte3;

import java.util.Scanner;

public class QuartaQuestao {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int limite = scanner.nextInt();
        
        int a = 0;
        int b = 1;
        int c;
        
        System.out.println("Série de Fibonacci até " + limite + ":");
        System.out.print(a + ", " + b);
        
        c = a + b;
        while (c < limite) {
            System.out.print(", " + c);
            a = b;
            b = c;
            c = a + b;
        }
        
        scanner.close();
    }
}
