import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        int tempoGasto;
        int velocidadeMedia;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        tempoGasto= scanner.nextInt();
        velocidadeMedia= scanner.nextInt();
        double gasto = (tempoGasto*velocidadeMedia)/12.0;
        NumberFormat doubleFormat = new DecimalFormat("#0.000");
        System.out.println(doubleFormat.format(gasto));

    }
}
