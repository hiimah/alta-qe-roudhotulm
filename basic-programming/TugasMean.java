import java.util.Scanner;

public class TugasMean {
    public static void main(String args[]) {
        float mean;
        int sum, i;
        int n = 4;
        int a[] = {1, 2, 3, 4};
        sum = 0;

        for (i = 0; i < n; i++){
            sum = sum + a[i];
        }
        System.out.println("Mean : "+ sum/(float)n);
    }
}
