package homework_chapter_3_part_1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Homework_Chapter_3_Part_1 {

    public static void main(String[] args) {
        Random r = new Random();
        int number, sum = 0;
        float avg;
        LinkedList<Integer> list = new LinkedList<>();

        for (int counter = 0; counter < 30; counter++) {
            number = r.nextInt(100);
            list.add(number);
            sum += number;
        }

        Collections.sort(list);

        System.out.println("The Sum Of The Elements = " + sum);
        System.out.println("The Floating Point Average Of The Elements = " + sum / list.size());

    }

}
