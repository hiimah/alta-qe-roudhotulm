import java.util.Scanner;

public class TugasKonversiNilai {
    public static void main(String[] args) {
        // int StudentScore = 80;

        Scanner nilai = new Scanner(System.in);
        System.out.print("Input Score : ");
        int StudentScore = nilai.nextInt();

        if (StudentScore >= 80 && StudentScore <= 100) {
            System.out.print("A");
        } else if (StudentScore >= 65 && StudentScore <= 79) {
            System.out.print("B+");
        } else if (StudentScore >= 50 && StudentScore <= 64) {
            System.out.print("B");
        } else if (StudentScore >= 35 && StudentScore <= 49) {
            System.out.print("C");
        } else if (StudentScore >= 0 && StudentScore <= 34) {
            System.out.print("C");
        } else {
            System.out.print("Invalid");
        }
    }
}
