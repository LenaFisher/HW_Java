import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. 

public class task3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 4, 6, 3, 7, 9, 12));
        int sum = 0;
        int count = 0;
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("максимальное: " + max);
        System.out.println("минимальное: " + min);
            for (int i = 0; i<numbers.size(); i++){ 
                sum=sum+numbers.get(i); 
                count++;           
            }
            System.out.println("среднее: " + sum/count);
    }
}
