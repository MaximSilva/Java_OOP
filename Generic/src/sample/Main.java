package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // №1
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(numbers.size() - 1);

        System.out.println(numbers);

        // №2

        // Створюємо масив для частотності кожної літери
        int[] frequencies = new int[26];
        Arrays.fill(frequencies, 0);

        // Зчитуємо текст з файлу і перетворюємо його до масиву символів
        Scanner scanner = new Scanner(new File("29.txt"));
        char[] chars = scanner.nextLine().toCharArray();

        // Знаходимо частотність кожної літери
        for (char c : chars) {
            int index = (int) c - (int) 'a';
            if (index >= 0 && index < 26) {
                frequencies[index]++;
            }
        }

        // Знаходимо літеру з максимальною частотою
        int maxFrequency = 0;
        char maxChar = 'a';
        for (int i = 0; i < 26; i++) {
            if (frequencies[i] > maxFrequency) {
                maxFrequency = frequencies[i];
                maxChar = (char) (i + (int) 'a');
            }
        }

        // Виводимо результати
        System.out.println("Max frequency letter: " + maxChar + " (" + maxFrequency + " times)");
        Arrays.sort(frequencies);
        System.out.println("Sorted frequencies: " + Arrays.toString(frequencies));
    }

       /* ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(34);
        a.add(123);
        a.add(45);
        System.out.println(Arrays.toString(a.toArray()));
        System.out.println(a.indexOf(123));
        Iterator<Integer> itr = a.iterator();
        System.out.println("Iterators ");
        for (; itr.hasNext(); ) {
            System.out.println(itr.next());
            {
                AllGroup<BigInteger> gr = new AllGroup<>();
                gr.add(new BigInteger("125"));
                gr.add(new BigInteger("330"));
                System.out.println(gr.sum(100, new BigInteger("120")));
                AllGroup<String> gr2 = new AllGroup<>();
                gr2.add("Hello");
                System.out.println(gr.check(gr2));
            }
        }*/
}
