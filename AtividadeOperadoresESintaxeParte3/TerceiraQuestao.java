package AtividadeOperadoresESintaxeParte3;

public class TerceiraQuestao {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
        System.out.println("Fatorial de " + i + " é: " + calcularFatorial(i));
    }
}

public static int calcularFatorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    int fatorial = 1;
    for (int i = 2; i <= n; i++) {
        fatorial *= i;
    }
    return fatorial;
}
}
