package Abstract.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int matrixR = dimensions[0];
        int matrixC = dimensions[1];

        int[][] matrix = new int[matrixR][matrixC];

        fillMatrix(matrixR, matrixC, matrix);

        String command = scanner.nextLine();
        int jediPower = 0;
        while (!command.equals("Let the Force be with you"))
        {
            int[] jediPosition = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilPosition = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            evilMovement(matrix, evilPosition);
            jediPower = jediMovement(matrix, jediPower, jediPosition);

            command = scanner.nextLine();
        }

        System.out.println(jediPower);
    }

    private static int jediMovement(int[][] matrix, int jediPower, int[] jediPosition) {
        int jediRow = jediPosition[0];
        int jediCol = jediPosition[1];

        while (jediRow >= 0 && jediCol < matrix[1].length)
        {
            if (jediRow < matrix.length && jediCol >= 0 && jediCol < matrix[0].length)
            {
                jediPower += matrix[jediRow][jediCol];
            }

            jediCol++;
            jediRow--;
        }
        return jediPower;
    }

    private static void evilMovement(int[][] matrix, int[] evilPosition) {
        int evilRow = evilPosition[0];
        int evilCol = evilPosition[1];

        while (evilRow >= 0 && evilCol >= 0)
        {
            if ( evilRow < matrix.length && evilCol < matrix[0].length)
            {
                matrix[evilRow] [evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static void fillMatrix(int matrixR, int matrixC, int[][] matrix) {
        int value = 0;
        for (int r = 0; r < matrixR; r++)
        {
            for (int c = 0; c < matrixC; c++)
            {
                matrix[r][c] = value++;
            }
        }
    }
}
