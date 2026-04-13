package DSA.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoinChangeProblemMinimumCoins {

    public static void getCoins(int coins[], int amount) {
        Arrays.sort(coins);
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0 ; i--) {
            int div = amount / coins[i];
            amount = amount % coins[i];

            if(div != 0) list.add(coins[i]);
            count += div;
        }
        System.out.println(count);
        System.out.println(list);
    }

    public static void main(String[] args) {
        int arr [] = {1,5,10,30};
        int amount = 27;

        getCoins(arr, amount);
    }
}
