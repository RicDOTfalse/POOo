import java.util.Scanner;


public class EX04 {
    public static void main(String[] args) {
        int Salario, Aumento, Valordoaumento, novoSal;

        Scanner Money = new Scanner(System.in);
        Scanner Raise = new Scanner(System.in);

        Salario = Money.nextInt();
        Aumento = Raise.nextInt();

        Valordoaumento = (Salario * Aumento) * 100;
        novoSal = (Salario + Valordoaumento);

        System.out.println("R$" + novoSal);

    }
}
