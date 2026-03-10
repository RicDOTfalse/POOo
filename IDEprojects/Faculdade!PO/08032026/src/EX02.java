import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {

        int N1, N2;

        Scanner Numero1 = new Scanner(System.in);
        Scanner Numero2 = new Scanner(System.in);

        N1 = Numero1.nextInt();
        N2 = Numero2.nextInt();

        System.out.println("Multiplicaçao//Divisao//Soma//Subtraçao Sao: ");
        System.out.println((N1 * N2) + " " + (N1/N2) + " " + (N1+N2) + " " + (N1 - N2));
    }
}
