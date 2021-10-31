package inventory;

public class Item {
    private String name;
    private String description;
    private Money value;
    boolean canBeSold;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Money getValue() {
        return value;
    }

    public void setValue(Money value) {
        this.value = value;
    }

    public boolean canItBeSold() {
        return canBeSold;
    }

    public void setCanBeSold(boolean canBeSold) {
        this.canBeSold = canBeSold;
    }
}
