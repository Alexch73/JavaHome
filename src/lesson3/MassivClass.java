package lesson3;

import java.util.Arrays;

public class MassivClass {
    public static void main(String[] args){
       // java.util.Arrays
     int[] arr; //более предпочтительный
        int arr2[];
        // создание массива


      arr =new int[5];
      System.out.println(Arrays.toString(arr));

        char[] chars  =new char[3];
        System.out.println(Arrays.toString(chars));
        //null
        //размер массива ищменить нельзя
        int arrLenght = arr.length;
        System.out.println("Размер массива"+ arrLenght);
int [] arr3  = {2,4,6,1,89};
//arr3 = {2, 4, 6, 1, 89};
arr3 = new int[]{2,6};
System.out.println(arr3[1]);

int[] arr4= new int[4];
for (int i = 0; i<arr4.length; i++) {
    arr4[i] += 4;

}
System.out.println(Arrays.toString(arr4));

// копирование массива
        int[] arr5 = {2,7,1,90};
        //int[] arr6 = arr5; //не скопирует массив!!! Получится 2 переменные ведущие к ОДНОМУ массиву
        // копирование массива
         //int [] arr5 = arr5.clone();
         int [] arr7= new int[10];
         System.arraycopy(arr5, 1, arr7,2,2);
         System.out.println(Arrays.toString(arr7));

         int[] arr8= {2,7,1,90};
         int[] copyArr=Arrays.copyOf(arr8,12);
         System.out.println(Arrays.toString(copyArr));

         //перебор массива
        for (int i=0;i<arr8.length; i++) {
            System.out.println(arr8[i]);
            arr8[i] = +3;
            System.out.println(Arrays.toString(arr8));
        }
// элементы массива нельзя изменить
        for (int num: arr8){
            System.out.println(num);
            num+=3; //
System.out.println(Arrays.toString(arr8));
        }
        // сравнение массивов

        int [] arr9 = new int[5];
        int [] arr10 = new int[5];
        System.out.println(arr9==arr10);// нельзя так сравнивать
        System.out.println(arr9.equals(arr10)); // нельзя так сравнивать
        System.out.println(Arrays.equals(arr9,arr10));

        System.out.println(Arrays.equals(arr9,arr10));


        Arrays.fill(arr9,23);
        //поиск в массиве
        int[] arr11= {2,7,1,4,90};
        System.out.println(Arrays.binarySearch(arr11,4)); // вначале передаем массив и значение которое нужно найти
//посмотреть алгоритм бинарного поиска
// просмотреть алгоритм быстрой сортировки

        //Содержит ли массив указанный элемент
    String[] srtArr={"dfg","werw", "sdfs", "errw"};
        System.out.println(Arrays.asList(srtArr).contains("dfg"));

        //сортировка массивов
        Arrays.sort(arr11);
        System.out.println (Arrays.toString(arr11));


    }
}
