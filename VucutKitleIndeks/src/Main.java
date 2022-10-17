import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Degişkenler.
        double boy, kilo, indeks;

        // Kullanıcıdan istenenen
        System.out.print(" Boyunuzu giriniz :");
        boy = scanner.nextDouble();
        System.out.print(" Kilonuzu giriniz : ");
        kilo = scanner.nextDouble();
        indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz : " + indeks);
    }
}