import java.util.Scanner;

public class TugasDrawXYZ {

    public static void main(String[] args) {

        Scanner nilai = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int inputBilangan1 = nilai.nextInt();
        int inputBilangan2 = inputBilangan1 * inputBilangan1;

        for (int i = 1; i <= inputBilangan2; i++) {

            if (i % inputBilangan1 == 0) {
                if (i % 3 == 0){
                    System.out.println("X");
                } else if (i % 2 == 0) {
                    System.out.println("Z");
                } else {
                    System.out.println("Y");
                }
            }
            else {
                if (i % 3 == 0){
                    System.out.print("X ");
                } else if (i % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
            }
        }
    }
}
