import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            int idade;
            String Nome;
            Scanner teclado = new Scanner(System.in);
            Scanner Nomes = new Scanner(System.in);
            idade = teclado.nextInt();
            Nome = Nomes.nextLine();
            String Idadeemstring = "" + idade;

        System.out.println("Seu nome e "+ Nome + " E sua idade e " + Idadeemstring + "Anos");

        System.out.println("///////////////////////////////");
        System.out.println("///////////////////////////////");
        System.out.println("///////////////////////////////");
        System.out.println("///////////////////////////////");

        int n1;
        int n2;

        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);

        n1 = number1.nextInt();
        n2 = number2.nextInt();


        int Mult, Div, Som, Min;

        Mult = (n1 * n2 );
        Div = (n1 / n2);
        Som = (n1 + n2);
        Min = (n1 - n2);

        System.out.println("Os numeros sao: " + n1 + " e " + n2 + " Juntos sao: " + Som);
        System.out.println("Sua divisao e " + Div);
        System.out.println("Sua multiplicaçao e " + Mult);
        System.out.println("Diminuidos sao " + Min);

        System.out.println("///////////////////////////////");
        System.out.println("///////////////////////////////");
        System.out.println("///////////////////////////////");
        System.out.println("///////////////////////////////");

        System.out.println("Insira o valor em segundos");

        int Segundos, Minutos, Horas;
        Scanner Segundosdscan = new Scanner(System.in);

        Segundos = Segundosdscan.nextInt();

        if (Segundos > 60 ){
            Minutos = (Segundos/60);

        }
        else {
            Minutos = 00;
        }
        if (Minutos > 60){
            Horas = (Minutos / 60);
        }
        else{
            Horas = 00;
        }

        System.out.println("Seu tempo e: " + Horas + " : " + Minutos + " : " + Segundos);

    }

}