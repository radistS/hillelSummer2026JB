package lec_11.ex.t2;

public class Zoo {
    public int calculateTotalweigth(ZooAnimal[] animals){
        int total = 0;
        for (ZooAnimal animal : animals){
            if (animal == null)
                continue;
            total += animal.getDailyFood();
        }
        return total;
    }

    public int calculateTotalPrice(ZooAnimal[] animals){
        int total = 0;
        for (ZooAnimal animal : animals){
            if (animal == null)
                continue;
            total += animal.getDailyFood() * animal.getPrice();
        }
        return total;
    }
}
