import java.util.Scanner;
import java.util.ArrayList;

public class Ex1 {
    private static Scanner sc = new Scanner(System.in);

    private static int matrixDimension = sc.nextInt();
    private static int mainDiagValue = sc.nextInt();
    private static int sndDiagValue = sc.nextInt();
    private static int centerValue = sc.nextInt();
    private static int leftValue = sc.nextInt();
    private static int upValue = sc.nextInt();
    private static int rightValue = sc.nextInt();
    private static int bottomValue = sc.nextInt();

//    public static void matrixArrays() {
//        int[][] matrix = new int[matrixDimension][matrixDimension];
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j) {
//                    matrix[i][j] = mainDiagValue;
//                }
//                if ((i + j) == matrix.length - 1) {
//                    matrix[i][j] = sndDiagValue;
//                }
//                if (matrixDimension % 2 != 0) {
//                    matrix[matrix.length / 2][matrix.length / 2] = centerValue;
//                }
//                if (i > j && i + j < matrix.length - 1) {
//                    matrix[i][j] = leftValue;
//                }
//                if (i < j && i + j < matrix.length - 1) {
//                    matrix[i][j] = upValue;
//                }
//                if (i < j && i + j > matrix.length - 1) {
//                    matrix[i][j] = rightValue;
//                }
//                if (i > j && i + j > matrix.length - 1) {
//                    matrix[i][j] = bottomValue;
//                }
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }

    public static void matrixArrayList() {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>(matrixDimension);
        for (int i = 0; i < matrixDimension; i++) {
            ArrayList<Integer> newRow = new ArrayList<>(matrixDimension);
            for (int j = 0; j < matrixDimension; j++) {
                newRow.add(0);

                if (matrixDimension % 2 != 0) {
                    newRow.set(j, centerValue);
                }

                if ((i + j) == matrixDimension - 1) {
                    newRow.set(j, sndDiagValue);
                }

                if (i == j) {
                    newRow.set(j, mainDiagValue);
                }

                if (i > j && i + j < matrixDimension - 1) {
                    newRow.set(j, leftValue);
                }
                if (i < j && i + j < matrixDimension - 1) {
                    newRow.set(j, upValue);
                }
                if (i < j && i + j > matrixDimension - 1) {
                    newRow.set(j, rightValue);
                }
                if (i > j && i + j > matrixDimension - 1) {
                    newRow.set(j, bottomValue);
                }
            }
            matrix.add(newRow);
        }


        if (matrixDimension % 2 != 0) {
            matrix.get(matrixDimension / 2).set(matrixDimension / 2, centerValue);
        }


        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

//    public static void operationArrays() {
//        int m = 5;
//        int n = 5;
//
//        int[][] matrix = new int[m][n];
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix[i].length; j++){
//                matrix [i] [j] = i + j;
//                matrix [i] [j] = matrix [i] [j] + 2;
//                matrix [i] [j] = matrix [i] [j] - 2;
//                matrix [i] [j] = matrix [i] [j] * 2;
//                System.out.print(matrix [i] [j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }

    public static void multiplicationArrays() {
        int numberElements = 3;

        int[][] firstMatrix = new int[numberElements][numberElements];
        int[][] secondMatrix = new int[numberElements][numberElements];
        int[][] resultMatrix = new int[numberElements][numberElements];

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                firstMatrix[i][j] = 1 + i;
                System.out.print(firstMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                secondMatrix[i][j] = 1 + j + i;

                System.out.print(secondMatrix[i][j] + "\t");
            }

            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < resultMatrix.length; k++) {
                    resultMatrix[i][j] += (firstMatrix[i][k] * secondMatrix[k][j]);
                }
            }
        }
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // matrixArrays();
        // matrixArrayList();
        //  operationArrays(); // opratii cu scalari
        multiplicationArrays(); // inmultire 2 matrici

    }
}