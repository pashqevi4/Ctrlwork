package Ctrlwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task {
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("privet");
        list.add("odna");
        list.add("tut");
        list.add("otdihaesh");
        list.add("?");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() <= 3) {
                list2.add(list.get(i));
            }
        }

        System.out.println(list);
        System.out.println(list2);

    }

}
