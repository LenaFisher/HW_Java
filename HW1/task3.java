// Реализовать простой калькулятор
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        System.out.println("Введите операцию: ");
        String operation = scan.next();
        
        float res = 0;
        switch(operation){
            case "+":
            res = num1 + num2;
            break;
            case "-":
            res = num1 - num2;
            break;
            case "*":
            res = num1 * num2;
            break;
            case "/":
            res = num1 / num2;
            break;

        }
        System.out.println(res);
        scan.close();

    }
    
}
