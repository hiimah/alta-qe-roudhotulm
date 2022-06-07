import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class TugasLuasKeliling {

    public static void main(String[] args) {
        // Pilihan untuk Hitung Luas
        Scanner input = new Scanner(System.in);
        float panjang;
        float luaspersegi;
        float luaspersegipanjang;
        float luassegitiga;
        float sisi;
        double sisimiring;
        int Pilih;
        float lebar;
        float alas;
        float cobalagi;
        float tinggi;
        float kelilingpersegi;
        float kelilingpersegipanjang;
        double kelilingsegitiga;
        do {

        System.out.println("** Penghitung Luas dan Keliling **");
        System.out.println("Berikut Nama Bangun Datar yang Tersedia : ");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi Panjang");
        System.out.println();
        System.out.print("Masukkan Pilihan Anda : ");
        Pilih = input.nextInt();
        int Pilihan = Pilih;
        switch (Pilihan) {

            case 1:
                System.out.println("Luas & Keliling Persegi");
                System.out.print("sisi = ");
                sisi = input.nextInt();
                luaspersegi = sisi*sisi;
                kelilingpersegi = 4*sisi;
                System.out.println("Luas Persegi = "+luaspersegi);
                System.out.println("Keliling Persegi = "+kelilingpersegi);
                break;

            case 2:
                System.out.println("Luas & Keliling Segitiga");
                System.out.print("Alas = ");
                alas = input.nextInt();
                System.out.print("Tinggi = ");
                tinggi = input.nextInt();
                luassegitiga = (alas*tinggi)/2;
                sisimiring = Math.sqrt((alas*alas)+(tinggi*tinggi));
                kelilingsegitiga = alas+tinggi+sisimiring;
                System.out.println("Luas Segitiga = "+luassegitiga);
                System.out.println("Keliling Segitiga = "+kelilingsegitiga);
                break;

            case 3:
                System.out.println("Luas & Keliling Persegi Panjang");
                System.out.print("Panjang = ");
                panjang = input.nextInt();
                System.out.print("Lebar = ");
                lebar = input.nextInt();
                luaspersegipanjang = panjang*lebar;
                kelilingpersegipanjang = (2*panjang)+(2*lebar);
                System.out.println("Luas Persegi Panjang = "+luaspersegipanjang);
                System.out.println("Keliling Persegi Panjang = "+kelilingpersegipanjang);
        }
            System.out.print("Coba Lagi ? (Ya(1)/(2)  ");
                cobalagi = input.nextInt();
         } while (cobalagi<2);
    }
}
