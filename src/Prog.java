import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prog {
    public static void main (String[] args){
        calculate();
    }
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите знак операции(+,-,*,/):");
        String input = scanner.nextLine();
        System.out.println("введите первое число:");
        int a = scanner.nextInt();
        System.out.println("введите втрое число:");
        int b = scanner.nextInt();
        if(input.equals("/")) {
            int res = a / b;
            System.out.println("результатом деления является число:" + res);
        }else if(input.equals("+")){
            int res = a+b;
            System.out.println("результатом сложения является число:" + res);
        }else if(input.equals("-")){
            int res = a-b;
            System.out.println("результатом вычитания является число:" + res);
        }else if(input.equals("*")){
            int res = a*b;
            System.out.println("результатом умножения является число:" + res);
        }else {
            System.out.println("такой операции не существует");
        }
    }
}

