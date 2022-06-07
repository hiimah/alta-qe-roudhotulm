import java.util.Scanner;

public class TugasFaktorBilangan {
    public static void main(String[] args) {
        //int bilangan;

        Scanner bilangan = new Scanner(System.in);
        System.out.print("Masukkan Bilanga: ");
        int inputBilangan = bilangan.nextInt();

        int pembagian = 0;
        for (int x = 0; x <= inputBilangan; x++){
            pembagian++;
            if (inputBilangan % pembagian == 0) {
                System.out.print(pembagian + "\n");
            }
        }
    }
    }
