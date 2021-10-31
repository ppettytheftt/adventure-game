package characters;

import inventory.Item;
import inventory.Money;

import java.util.List;

public class PlayerCharacter {
    int maxHp;
    int currentHp;
    int currentXp;
    int xpUntilNextLevel;
    int strength;
    int dexterity;
    int intelligence;
    int endurance;
    int wisdom;
    int luck;
    int defense;
    int attackDice;
    int defenseDice;
    String name;
    CharacterClass characterClass;
    String currentStatusEffect;
    Money money;
    List<Item> inventory;


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

    public int getCurrentXp() {
        return currentXp;
    }

    public void setCurrentXp(int currentXp) {
        this.currentXp = currentXp;
    }

    public int getXpUntilNextLevel() {
        return xpUntilNextLevel;
    }

    public void setXpUntilNextLevel(int xpUntilNextLevel) {
        this.xpUntilNextLevel = xpUntilNextLevel;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentStatusEffect() {
        return currentStatusEffect;
    }

    public void setCurrentStatusEffect(String currentStatusEffect) {
        this.currentStatusEffect = currentStatusEffect;
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

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
}
