package home3;
import java.util.Scanner;
public class HomeStrTwoD {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите текст:");
        String stroc = sc.nextLine();
        String result = new StringBuilder(stroc).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = result.replace(" ","");
        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);

    }
}
