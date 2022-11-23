//        Вывести все простые числа от 1 до 1000
//        простое делится на себя и на единицу
//        int startNum = 1;


public class Task2 {
    public static void main(String[] args) {
        int endNum = 10;
        for (int i = 2; i <= endNum; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }  
            }
        if(isPrime){
            System.out.println(i);
        }
        }
    }
}