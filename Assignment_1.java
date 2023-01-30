/*
 Задание 1.
Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Assignment_1 {
    public static void main(String[] args) {

        System.out.printf("Please, enter an integer:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        ArrayList<Integer> list = new ArrayList<Integer>(number);
        Random random = new Random();
        for (Integer i = 0; i < number; i++) {
            list.add(random.nextInt(10, 50));

        }
        System.out.println(list);

        for (Integer i = 0; i < list.size(); i++) {

            if (list.get(i) % 2 == 0) {
                // System.out.println(list.get(i) % 2);
                list.remove(list.get(i));
                i = i - 1;

            }
        }
        System.out.println(list);
    }
}
