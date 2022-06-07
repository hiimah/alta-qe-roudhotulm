import java.util.Scanner;

public class TugasMenghitungVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Pilih;
        float panjang;
        float lebar;
        float sisi;
        float jari2;
        float cobalagi;
        float tinggi;
        double vol,phi = 3.14;
        do {

        System.out.println("** Penghitung Volume Bangun Ruang **");
        System.out.println("Berikut Nama Bangun Ruang yang Tersedia : ");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println();
        System.out.print("Masukkan Pilihan Anda : ");
        Pilih = input.nextInt();
        int Pilihan = Pilih;
        switch (Pilihan) {

            case 1:
                System.out.println(" Volume Kubus ");
                System.out.print("Panjang Sisi = ");
                sisi = input.nextInt();
                vol = sisi*sisi*sisi;
                System.out.println("Volume Kubus = "+vol);
                break;

            case 2:
                System.out.println("Volume Balok");
                System.out.print("Panjang = ");
                panjang = input.nextInt();
                System.out.print("Lebar = ");
                lebar = input.nextInt();
                System.out.print("Tinggi = ");
                tinggi = input.nextInt();
                vol = panjang*lebar*tinggi;
                System.out.println("Volume Balok = "+ vol);
                break;

            case 3:
                System.out.println("Volume Tabung");
                System.out.print("Tinggi = ");
                tinggi = input.nextInt();
                System.out.print("Jari-Jari = ");
                jari2 = input.nextInt();
                vol = (phi*(jari2*jari2))*tinggi;
                System.out.println(phi +" " + jari2 +" " +tinggi);
                System.out.println("Volume Tabung = "+ Math.round(vol));
        }
        System.out.print("Coba Lagi ? (Ya(1)/(2)");
        cobalagi = input.nextInt();
        } while (cobalagi<2);
    }
}
