package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 6, 1, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
 /*TreeMap<String,Student> tm=new TreeMap<>();
        tm.put("Petrov", new Student("Petrov Petr Petrovich","physics",2,9.8));
        tm.put("Sidorov", new Student("Sidorov Sidr Sidorovich","physics",1,10.0));
        tm.put("Ivanov", new Student("Ivanov Ivan Ivanovich","geogragy",5,7.0));
        Set<Map.Entry<String, Student>> set=tm.entrySet();
        for(Map.Entry<String, Student> s:set){
            System.out.println(s.getKey()+" : "+s.getValue());
        }
        System.out.println("Search student");
        Map.Entry<String, Student> s1=tm.ceilingEntry("Si");
        System.out.println(s1.getKey()+" : "+s1.getValue());*/
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (count > 1) {
                System.out.println(key + " повторюється " + count + " разів");
            }
        }

    }
}




