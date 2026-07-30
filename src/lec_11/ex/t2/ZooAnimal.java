package lec_11.ex.t2;

public abstract class ZooAnimal {
    private int dailyFood;
    private int price;

    public ZooAnimal(int dailyFood, int price) {
        this.dailyFood = dailyFood;
        this.price = price;
    }

    public int getDailyFood() {
        return dailyFood;
    }

    public int getPrice() {
        return price;
    }
}
