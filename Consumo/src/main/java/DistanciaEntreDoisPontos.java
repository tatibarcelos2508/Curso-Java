import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        double p1 = x2-x1;
        double p2 = p1*p1;
        double p3 = y2 - y1;
        double p4 = p3*p3;
        double soma = p2+p4;
        double sqrt = Math.sqrt(soma);

        NumberFormat doubleFormat = new DecimalFormat("#0.0000");
        System.out.println(doubleFormat.format(sqrt));
    }
}
