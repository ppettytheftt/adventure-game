package battle_mechanics;

public class Spell {
    private String name;
    private int numberOfPointsAffected;
    private String attributeAffected;
    private int numberOfTurnsAffected;

    //I'm debating taking out Spell as an object, and just creating methods that will do everything the spell is supposed to.
    //for example, for fireBall(PlayerCharacter, Enemy) it would decide which is the target, and then apply damage
    // accordingly. Maybe in battle we can set a boolean for when it's the player character's turn to make sure
    //that mechanic works as intended.

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

