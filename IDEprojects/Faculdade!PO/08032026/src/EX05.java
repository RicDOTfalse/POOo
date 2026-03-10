import java.util.Scanner;


public class EX05 {
    public static void main(String[] args) {
        int Altura, Massa,IMC;

        Scanner height = new Scanner(System.in);
        Scanner mass = new Scanner(System.in);

        Altura = height.nextInt();
        Massa = mass.nextInt();

        IMC = Massa/(Altura*Altura);

        System.out.println(IMC);

    }
}
