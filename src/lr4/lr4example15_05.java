package lr4;
import java.util.Random;
import java.util.Scanner;

public class lr4example15_05 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[6][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        for (int[] x : arr) {
            for (int j : x) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("New array: ");
        int[][] newArr = new int[arr[0].length][arr.length];
        for (int i = 0; i < newArr.length; i ++){
            for (int j = 0; j < newArr[0].length; j++) {
                newArr[i][j] = arr[j][i];
            }
        }
        for (int[] x : newArr) {
            for (int j : x) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
