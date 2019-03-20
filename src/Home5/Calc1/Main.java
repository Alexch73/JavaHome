package Home5.Calc1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
       int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        System.out.println("Введите математическоую операцию");
        switch (in.next()) {

            case "+":
                Plus pl = new Plus();
                pl.execute(a,b);
                break;

            case "-":
                Minus min = new Minus();
                min.execute(a,b);
                break;

            case "*":
               Umnoz um = new Umnoz();
               um.execute(a,b);
                break;

            case "/":
                Delenie del = new Delenie();
                del.execute(a,b);
                break;

            default:
                System.out.println("неверное значение");
                break;


        }

    }



}
