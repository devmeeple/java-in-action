package ch24.ex;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumbersStatistics {
    private final int DATA_BOUNDARY = 50;
    private Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    private Random random = new Random();

    public static void main(String[] args) {
        RandomNumbersStatistics statistics = new RandomNumbersStatistics();

        statistics.getRandoNumberStatistics();
    }

    public void getRandoNumberStatistics() {
        int runCount = DATA_BOUNDARY * 100;
        for (int loop = 0; loop < runCount; loop++) {
            int result = random.nextInt(DATA_BOUNDARY) + 1;
            putCurrentNumber(result);
        }
        printStatistics();
    }

    public void putCurrentNumber(int tempNumber) {
        if (hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
        } else {
            hashtable.put(tempNumber, 1);
        }
    }

    public void printStatistics() {
        Set<Integer> keySet = hashtable.keySet();
        for (int key : keySet) {
            int count = hashtable.get(key);
            System.out.print(key + "=" + count + "\t");
            if ((key % 10) - 1 == 0) {
                System.out.println();
            }
        }
    }
}
