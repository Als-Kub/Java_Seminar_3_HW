/*
Задание 2:
Создать список целых чисел (заполнить случайными числами).
Найти минимальное, максимальное и среднее из этого списка.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Assignment_2 {

    static Integer min(ArrayList<Integer> list) {
        int minNum = Collections.min(list);
        return minNum;
    }

    static Integer max(ArrayList<Integer> list) {
        int maxNum = Collections.max(list);
        return maxNum;
    }

    static Double mean(ArrayList<Integer> list) {
        double meanNum = 0;
        double sum = 0;
        for (Integer i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        meanNum = sum / list.size();
        return meanNum;
    }

    public static void main(String[] args) {
        System.out.printf("Please, enter an integer:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        ArrayList<Integer> list = new ArrayList<Integer>(number);
        Random random = new Random();
        for (Integer i = 0; i < number; i++) {
            list.add(random.nextInt(1, 10));
        }
        System.out.println(list);


        System.out.println("Minimum = " + min(list));
        System.out.println("Maximum = " + max(list));
        System.out.println("Average = " + mean(list));

    }
}
