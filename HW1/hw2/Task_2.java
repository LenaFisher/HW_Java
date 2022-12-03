package hw2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task_2 {

    public static void main(String[] args) {

        // Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

        int[] arr = {15, 13, 1, 9, 7, 11};

        boolean isSorted = false;
        int tmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
                writeToLog(arr);
            }
        }
    }

    private static void writeToLog(int[] arr) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(Arrays.toString(arr));
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибочка вышла");
        }
    }

}
