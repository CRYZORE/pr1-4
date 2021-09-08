import java.util.Scanner;

public class pr4{

    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите число, факториал которого будет взят: ");
        int result = scanner.nextInt();
        System.out.println(calculateFactorial(result));
    }
}