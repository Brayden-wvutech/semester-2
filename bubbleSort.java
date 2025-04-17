/*Brayden Hanshew
 * Apr 15, 2025
 * BubbleSort
 */
import java.util.Random;

public class bubbleSort {
    public static void main(String[] args) {
        int[] rand = new int[7];
        Random random = new Random();

        for (int i = 0; i < rand.length; i++) {
            rand[i] = random.nextInt(100);
        }

        System.out.print("The starting array looks like: ");
        for (int i = 0; i < rand.length; i++) {
            System.out.print(rand[i]);
            if (i < rand.length - 1) System.out.print(" : ");
        }
        System.out.println();

        int n = rand.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (rand[j] > rand[j + 1]) {
                    int temp = rand[j];
                    rand[j] = rand[j + 1];
                    rand[j + 1] = temp;
                }
            }
        }

        System.out.print("The sorted array looks like: ");
        for (int i = 0; i < rand.length; i++) {
            System.out.print(rand[i]);
            if (i < rand.length - 1) System.out.print(" : ");
        }
        System.out.println();
    }
}






    






 