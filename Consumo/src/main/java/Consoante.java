import java.util.Scanner;

public class Consoante {
    public static void main(String[] args) {
        String[] vetorConsoante = new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite: " + "");
        String x1;
        String x2;
        String x3;
        String x4;
        String x5;
        String x6;
        String x7;
        String x8;
        String x9;
        String x10;

        vetorConsoante[0] = scanner.nextLine();
        vetorConsoante[1] = scanner.nextLine();
        vetorConsoante[2] = scanner.nextLine();
        vetorConsoante[3] = scanner.nextLine();
        vetorConsoante[4] = scanner.nextLine();
        vetorConsoante[5] = scanner.nextLine();
        vetorConsoante[6] = scanner.nextLine();
        vetorConsoante[7] = scanner.nextLine();
        vetorConsoante[8] = scanner.nextLine();
        vetorConsoante[9] = scanner.nextLine();

        int contador = 0;
        for (int i = 0; i < vetorConsoante.length; i++) {
            if (!vetorConsoante[i].equals("a")&& !vetorConsoante[i].equals("e") && !vetorConsoante[i].equals("i") && !vetorConsoante[i].equals("o") && !vetorConsoante[i].equals("u")){
                System.out.println(vetorConsoante[i]);
                contador++;

            }

        }
        System.out.println("A quantidade de consoantes é : " + contador);
    }
}