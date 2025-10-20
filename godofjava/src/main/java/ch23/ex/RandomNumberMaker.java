package ch23.ex;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    Random random = new Random();

    public static void main(String[] args) {
        RandomNumberMaker maker = new RandomNumberMaker();
        maker.makeRandomNumbers(10);
    }

    public void makeRandomNumbers(int count) {
        for (int loop = 0; loop < count; loop++) {
            HashSet<Integer> results = getSixNumber();
            System.out.println(results);
        }
    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> results = new HashSet<>();
        while (true) {
            if (results.size() == 6) {
                break;
            }

            int tempNumber = random.nextInt(45);
            results.add(tempNumber);
        }
        return results;
    }
}
