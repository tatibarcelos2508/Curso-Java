import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class consumo{
    public static void main(String[] args) {
        int x;
        double y;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       x = scanner.nextInt();
       y = scanner.nextDouble();
        double consumo = x/y;
        NumberFormat doubleFormat = new DecimalFormat("#0.000");
        System.out.println(doubleFormat.format(consumo) + " km/l");

    }
}
