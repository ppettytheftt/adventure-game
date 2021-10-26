package BattleMechanics;

public class Spell {
    private String name;
    private int numberOfPointsAffected;
    private String attributeAffected;
    private int numberOfTurnsAffected;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPointsAffected() {
        return numberOfPointsAffected;
    }

    public void setNumberOfPointsAffected(int numberOfPointsAffected) {
        this.numberOfPointsAffected = numberOfPointsAffected;
    }

    public String getAttributeAffected() {
        return attributeAffected;
    }

    public void setAttributeAffected(String attributeAffected) {
        this.attributeAffected = attributeAffected;
    }

    public int getNumberOfTurnsAffected() {
        return numberOfTurnsAffected;
    }

    public void setNumberOfTurnsAffected(int numberOfTurnsAffected) {
        this.numberOfTurnsAffected = numberOfTurnsAffected;
    }
}

