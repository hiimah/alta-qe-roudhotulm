import java.util.Scanner;

public class TugasPalindrome {
    static boolean kataPalindrome(String pal) {
        int left = 0;
        int right = pal.length()-1;

        while (left<right) {
            if (pal.charAt(left) != pal.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check Palindrome");
        System.out.print("Masukkan Kalimat : ");
        String pal2 = input.nextLine();
        if (kataPalindrome(pal2))
            System.out.println("True " + pal2 + " is Palindrome");
        else
            System.out.println("False " + pal2 + " is not Palindrome");

    }
}