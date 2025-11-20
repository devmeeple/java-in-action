package ch04;

public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUserIt;

    public String getBrand() {
        return brand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public boolean isRockStarUserIt() {
        return rockStarUserIt;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumOfPickups(int numOfPickups) {
        this.numOfPickups = numOfPickups;
    }

    public void setRockStarUserIt(boolean rockStarUserIt) {
        this.rockStarUserIt = rockStarUserIt;
    }
}
