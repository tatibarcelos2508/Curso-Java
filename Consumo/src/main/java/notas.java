import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite as Notas: " +"");
        double[] notaVetor = new double[4];
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        notaVetor[0] = scanner.nextDouble();
        notaVetor[1] = scanner.nextDouble();
        notaVetor[2] = scanner.nextDouble();
        notaVetor[3] = scanner.nextDouble();

       for(int i= 0; i< notaVetor.length; i++ ){

           System.out.println("As notas são "+ "");

           System.out.print(notaVetor[i]);
           System.out.println();

       }
       System.out.println("Segue a media " + "");
       double media = (notaVetor[0]+notaVetor[1]+notaVetor[2]+notaVetor[3])/4;
        NumberFormat doubleFormat = new DecimalFormat("#0.00");
       System.out.println(doubleFormat.format(media));
    }
}
