package classwork;

import javax.naming.PartialResultException;

public class lesson6 {

    public static void main(String[] args) {
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 10);

        System.out.println("for each");
        for (int elem : arr) {
            System.out.println(elem);
        }
//        System.out.println("for");
//
//            for (int i = arr.length - 1; i >= 0; i--) {
//                System.out.println(arr[i]);
//            }
            /*
            Bubble Sort
             */
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }

                }
            }
            System.out.println("After filtering");
            for (int elem : arr) {
                System.out.println(elem);
            }

            int matrix[][] = new int[3][3];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 10);
                }
            }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Row number : " + i);
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Row number : " + i);
            int a = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                a += matrix[i][j];
            }
            System.out.println("Sum is : " + a);
        }
        
    }
}
