package furniturerental;

public class Furniture {
    String item_name;
    int deposit;
    protected int rate;

    public Furniture(String item_name, int deposit, int rate) {
        this.item_name = item_name;
        this.deposit = deposit;
        this.rate = rate;
    }

    public String getItemName() {
        return item_name;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getRate() {
        return rate;
    }
}

