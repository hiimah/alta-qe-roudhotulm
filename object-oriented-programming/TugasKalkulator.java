import java.util.Scanner;

public class TugasKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, choice, result = 0;
        float cobalagi;
        do {

        System.out.println("Kalkulator");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("============================");

        // Input Data
        System.out.print("Input Angka Pertama = ");
        number1 = input.nextInt();
        System.out.print("Input Angka Kedua = ");
        number2 = input.nextInt();

        // Pilihan Operasi
        System.out.print("Masukan Operasi : ");
        choice = input.nextInt();

        switch (choice)
        {
            case 1 : result = number1 + number2;
                break;
            case 2 : result = number1 - number2;
                break;
            case 3 : result = number1 * number2;
                break;
            case 4 : result = number1 / number2;
                break;
            default: System.out.println("Salah Memasukkan Pilihan !");
        }
        System.out.println("Hasil = "+result);
        System.out.print("Coba Lagi ? (Ya(1)/(2)");
        cobalagi = input.nextInt();
        } while (cobalagi<2);
    }
}
