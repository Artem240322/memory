package ru.skypro;

import java.util.Arrays;

import static ru.skypro.main.changeValue;

class Main {

    public static void main(String[] args) {
        int value = 33;
        changeVolue(value);
        System.out.println("Задание 5 = " + value);
    }
    private static void changeVolue(int value) {
        value = 22;
/// Ответ 33 - почему. а потому, что 33 - это значение (т.е. с лева это ссылка а с права это значение),
/// все передается по значению, приметивные типы по значению.

}
  public class main {
      public static void main(String[] args) {
          Integer value = 33;
          changeValue(value);
          System.out.println("Задание 6 ="+value);

    }
      private static void changeValue(Integer value) {
          value = 22;
          System.out.println(value);

    }
    /// Ответ так же 33. В данной задаче Передача ссфлочного типа через Integer. Класс обертки.
      /// Integer value - это ссылка на значение которое смотрит на  (33).
}
public class main {
    public static void main (String[] args) {
        Integer[] value = {3, 4};
        changeValue(value);
        System.out.println(Arrays.toString(value));
        }

        private static void (Integer[] value){
        value = Integer[] {1, 2};
        System.out.println("Задание 7 " + value);


    }
}


public class main {
    public static void main (String[] args) {
        Integer[] value = {3, 4};
        changeValue(value);
        System.out.println(Arrays.toString(value));
    }

    private static void (Integer[] value){
        value[0] = 99;
        System.out.println("Задание 5"+ value);


    }
}