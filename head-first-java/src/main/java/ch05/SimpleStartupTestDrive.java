package ch05;

public class SimpleStartupTestDrive {

    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();

        int[] locations = {2, 3, 4};
        dot.setLocationSells(locations);

        int userGuess = 2;
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}

class SimpleStartup {

    private int[] locationSells;
    private int numOfHits = 0;

    public String checkYourself(int guess) {
        String result = "miss";
        for (int cell : locationSells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationSells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

    public void setLocationSells(int[] locs) {
        this.locationSells = locs;
    }
}

