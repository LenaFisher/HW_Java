import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 4, 6, 3, 7, 9, 12));
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println(numbers);
    }
}