import java.util.Scanner;


public class EX01 {
    public static void main(String[] args) {

        String Pessoa;
        int Idade;

        Scanner pessoa = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);

        Idade = idade.nextInt();
        Pessoa = pessoa.nextLine();

        String IdadeasString = " " + Idade;

        System.out.println("seu nome e  " + Pessoa + " e sua idade e " + IdadeasString);


        }
    }
