package Attributes;

public class ArmorClassRating {
    int totalArmorClassRating;
    int bonusToRating;
    int baseRating;

    public int getTotalArmorClassRating() {
        return totalArmorClassRating;
    }

    public void setTotalArmorClassRating(int totalArmorClassRating) {
        this.totalArmorClassRating = getBonusToRating() + getBaseRating();
    }

    public int getBonusToRating() {
        return bonusToRating;
    }

    public void setBonusToRating(int bonusToRating) {
        this.bonusToRating = bonusToRating;
    }

    public int getBaseRating() {
        return baseRating;
    }

    public void setBaseRating(int baseRating) {
        this.baseRating = baseRating;
    }

}
