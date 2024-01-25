package dev.ram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class KidsWithGreatestNumberOfCandies {

    public static void main(String[] args) {
        int[] arr1 = {2,3,5,1,3};
        int[] arr2 = {4,2,1,1,2};
        int[] arr3 = {12,1,12};
        System.out.println(getCandies(arr1, 3));
        System.out.println(getCandies(arr2, 1));
        System.out.println(getCandies(arr3, 10));
    }

    private static List<Boolean> getCandies(int[] candies, int extraCandies) {
        List<Boolean> resList = new ArrayList<Boolean>();
        int high = 0, temp = 0;
        for(int i: candies) {
            if(i > high) {
                high = i;
            }
        }
        for(int i: candies) {
            temp = i + extraCandies;
            if(temp >= high) {
                resList.add(true);
            } else {
                resList.add(false);
            }
        }
        return resList;
     }
}
