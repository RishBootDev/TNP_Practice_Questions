package DSA.greedy;

import java.util.PriorityQueue;

public class FractionalKnapsackProblem {

    public static double fracknapsack(int p[], int w[], int capacity) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (p1, p2) -> Double.compare(
                        (double)p2.profit / p2.weight,
                        (double)p1.profit / p1.weight
                )
        );

        for (int i = 0; i < p.length; i++) {
            pq.add(new Pair(p[i], w[i]));
        }

        double maxProfit = 0;

        while (!pq.isEmpty() && capacity > 0) {

            Pair pair = pq.poll();

            if (pair.weight <= capacity) {
                capacity -= pair.weight;
                maxProfit += pair.profit;
            } else {
                double ratio = (double) pair.profit / pair.weight;
                maxProfit += capacity * ratio;
                break;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

    }

    static class Pair {
        int profit;
        int weight;

        public Pair(int profit, int weight) {
            this.profit = profit;
            this.weight = weight;
        }
    }
}