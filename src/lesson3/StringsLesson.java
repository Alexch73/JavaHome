package lesson3;

import java.util.Arrays;

public class StringsLesson {

    public static void main(String[] args){

       String string=" строка";
        char charVar = 'a';
        //строки хранятся как массив byte после 9 версии, будет указание кодировки latin 1 либо UTF-16
        String string2=" строка"; // данное обхявление идет в пул строк
        String string3= new String(" строка"); // данное обхявление не идет в пул строк
        //string3 = string3.intern()
        System.out.println(string==string2);
        System.out.println(string==string3);

        System.out.println(string.equals(string2));


        String string4= new String(" строка");
        //сравнение
        System.out.println(string.equals(string4));
        //сравнение без учета регистра
        System.out.println(string.equalsIgnoreCase(string4));

        System.out.println(string.startsWith("ст"));
        System.out.println(string.endsWith("от"));

        //сортировка строк
         //посмотреть по какому принципу идет сортировка

        String[] strArr= {string,string4,string2};
        Arrays.sort(strArr);

        // конкатенация строк (склеивание строк)
        String string5 = "Str 1";
        String string6 = "Str 2";
        String string7 = string5+string6;

        String string8=" Начало";
        for (int i=0; i<3; i++);
        string8+= "итерация цикла"; // не рекамендуется использовать +
        System.out.println(string8);

        StringBuilder stringBuilder; // быстрее, потоко небезовасен сложение строк
        StringBuffer stringBuffer; // медленне потокобезопасен    сложение строк

        string8=" Начало";
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(string8);
        for (int i=0; i<3; i++) {
            stringBuilder1.append(" итерация цикла")
        .append(i)
            .append(" "); }
        string8=stringBuilder1.toString();
        System.out.println(string8);

 // методы работы со строками
          string8.substring(2); //взятие подстроки
        string8.substring(2,7); // подстрока со 2го по 6 элемент

        System.out.println(string8.substring(2,7));

        System.out.println(string.split(" ")); // разбивает строку на массив строк по регулярному выражению
        System.out.println(string.trim()); // етод удаляет пробелы вначале и вконце строк
        string8.replaceAll("","new str"); //метод заменяет один символ на другой вроде




    }


    }
