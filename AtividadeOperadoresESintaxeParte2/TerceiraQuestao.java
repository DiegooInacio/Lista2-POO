package AtividadeOperadoresESintaxeParte2;

public class TerceiraQuestao {
  public static void main(String[] args) {
    int x = 80; 

    int y = (x % 2 == 0) ? x / 2 : 3 * x + 1;

    System.out.println("Para x = " + x + ", y = " + y);
}
}
