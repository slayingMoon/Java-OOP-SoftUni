package WorkingWithAbstraction_Exercise.jediGalaxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static BufferedReader reader;
    private static int rows, cols;
    private static long sum;
    private static int matrix[][];

    static {
        reader = new BufferedReader(new InputStreamReader(System.in));
        sum = 0L;
    }

    public static void main(String[] args) throws IOException {

        fillMatrix();

        String input;
        while (!(input = reader.readLine()).equals("Let the Force be with you")) {
            int[] dimension = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int jediRow = dimension[0];
            int jediCol = dimension[1];

            dimension = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int evilRow = dimension[0];
            int evilCol = dimension[1];

            calculateEvilPath(evilRow, evilCol);
            calculateJediPath(jediRow, jediCol);

        }

        System.out.println(sum);
    }

    private static void calculateJediPath(int jediRow, int jediCol) {
        while (jediRow >= 0 && jediCol < cols) {
            if (inRange(jediRow, jediCol)) {
                sum += matrix[jediRow][jediCol];
            }
            jediCol++;
            jediRow--;
        }
    }

    private static void calculateEvilPath(int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (inRange(evilRow, evilCol)) {
                matrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static boolean inRange(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    private static void fillMatrix() throws IOException {
        int[] dimestions = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        rows = dimestions[0];
        cols = dimestions[1];

        matrix = new int[rows][cols];

        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
    }
}
