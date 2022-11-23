import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
//        Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

        Scanner scan = new Scanner(System.in);
        int intNumber = scan.nextInt();
        scan.close();
        float v = 0.5f * intNumber * (intNumber + 1);

        System.out.println((int) v);


    }
}
