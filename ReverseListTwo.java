package com.telran.project.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseListTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 8, 4, 5, 6, 17, 7, 9,13));
        ReverseListTwo reverseListTwo = new ReverseListTwo();
        reverseListTwo.printList(list);
        reverseListTwo.reverse(list);
        reverseListTwo.printList(list);

    }

    private void reverse(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int leftInt = list.get(left);
            int rightInt = list.get(right);
            list.set(left, rightInt);
            list.set(right, leftInt);
            left++;
            right--;
        }
        System.out.println();
    }

    private void printList(List<Integer> list) {
        for (int element : list) {
            System.out.print(" " + element);

        }
    }
}
