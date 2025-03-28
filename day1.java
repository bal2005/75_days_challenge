//package algotutor_dsa;

import java.util.*;

public class day1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 1, 3, 4, 5, 6, 6, 7 };
        int arr2[] = new int[arr.length * 2];
        int n = arr2.length;
        int ind = 0;
        int ct = 0;
        for (int i = 0; i < n; i++) {
            if (ind < arr.length) {
                arr2[i] = arr[ind];
                ind++;

            } else if (ind == arr.length) {
                ct = 1;
                ind = 0;
                i--;
            } else if (ct == 1) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
