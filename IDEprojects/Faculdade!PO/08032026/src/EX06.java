import java.lang.management.MemoryManagerMXBean;
import java.util.Scanner;


public class EX06 {
    private static String system;

    public static void main(String[] args) {
        int AP1, AP2, Media, Nota;
        String Passou, Reprovou;

        Scanner notap1 = new Scanner(System.in);
        Scanner notap2 = new Scanner(System.in);

        AP1 = notap1.nextInt();
        AP2 = notap2.nextInt();

        Media = (AP1 + AP2)/2;

        Passou = "Passou";
        Reprovou = "Reprovado!";

        Nota = Media > 7 ? Media:AP1;

        System.out.println(Nota);
    }
}
