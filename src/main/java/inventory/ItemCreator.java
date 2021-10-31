package inventory;

public class ItemCreator {
    //This class essentially puts together items to add to the inventory. While currently this is very basic, in battle the idea
    // is that if the player character wants to use an item and they access their inventory in battle, it will call on a
    // method to check if an item is in the inventory and remove one of said item and apply whatever effects or
    // healing that is going to be done.

    public Item createMinorPotion() {
        Money value = new Money();
        value.setCopper(5);
        Item minorPotion = new Item();
        minorPotion.setName("Minor Potion");
        minorPotion.setDescription("A small potion that can cure up to 5hp");
        minorPotion.setCanBeSold(true);
        minorPotion.setValue(value);

        return minorPotion;
    }
}
