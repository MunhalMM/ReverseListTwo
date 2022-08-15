package com.telran.project.iterator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 9));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
    }
}

