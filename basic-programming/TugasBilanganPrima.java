import java.util.Scanner;

public class TugasBilanganPrima {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Check Prime Number");
        System.out.print("Input Number : ");
        int inputNumber = number.nextInt();

        System.out.println("_______________________________");

        boolean flag = false ;
        for (int i = 2; i <= inputNumber / 2; ++i ) {
            if (inputNumber % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("True" + " The Number is Prime Number ");
        else
            System.out.println("False" + " The Number is Not Prime Number");
    }
}
