import java.util.Scanner;


public class EX07 {
    public static void main(String[] args){

        int i, j, maismenos;

        Scanner o = new Scanner(System.in);
        Scanner p = new Scanner(System.in);

        i = o.nextInt();
        j = p.nextInt();

        maismenos = i < j ? i : j ;

        System.out.println("Omenor numero e  " + maismenos);

    }

}
