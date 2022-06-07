import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Scanner;

public class TugasOngkosKirim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float berat, hasil1, hasil2;
        int cobalagi, panjang, lebar, tinggi;
        do {

            System.out.println("** Menghitung Ongkos Kirim **");
            System.out.print("Masukkan Panjang   =    ");
            panjang = input.nextInt();
            System.out.print("Masukkan Lebar     =    ");
            lebar = input.nextInt();
            System.out.print("Masukkan Tinggi    =    ");
            tinggi = input.nextInt();
            System.out.print("Masukkan Berat     =    ");
            berat = input.nextInt();
            System.out.println("============================");

            {
                hasil1 = (panjang * lebar * tinggi) / 5000;
                hasil2 = berat * 5000;
                System.out.println("Berat Volume \t Kg =  " + Math.round(hasil1));
                System.out.println("Ongkos Kirim \t Rp =  " + Math.round(hasil2));
            }
            System.out.print("Coba Lagi ? (Ya(1)/(2)");
            cobalagi = input.nextInt();
        }   while (cobalagi<2);

    }
}
