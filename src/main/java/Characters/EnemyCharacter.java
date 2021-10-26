package Characters;

import BattleMechanics.DiceAndCoinService;

public class EnemyCharacter{

    int maxHp;
    int currentHp;
    int attackDice;
    int defenseDice;
    int attackModifier;
    int defense;
    String currentStatusEffect;


    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(int attackModifier) {
        this.attackModifier = attackModifier;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttackDice() {
        return attackDice;
    }

    public void setAttackDice(int attackDice) {
        this.attackDice = attackDice;
    }

    public int getDefenseDice() {
        return defenseDice;
    }

    public void setDefenseDice(int defenseDice) {
        this.defenseDice = defenseDice;
    }

    public String getCurrentStatusEffect() {
        return currentStatusEffect;
    }

    public void setCurrentStatusEffect(String currentStatusEffect) {
        this.currentStatusEffect = currentStatusEffect;
    }
}
