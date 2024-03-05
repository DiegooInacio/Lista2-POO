package AtividadeOperadoresESintaxeParte3;

public class PrimeiraQuestao {
  public static void main(String[] args) {
    int x = 80;
    int y = 0;

    System.out.print("Para x = " + x + " a saída será: ");

    while (y != 1) {
      if (x % 2 == 0) {
        y = x / 2;
      } else {
        y = 3 * x + 1;
      }

      if (y != 1) {
        System.out.print(y + " -> ");
      } else {
        System.out.print(y + ".");
      }

      x = y;
      
    }

  }
}
