package Inventory;

public class Item {
    String itemName;
    String itemDescription;
    String itemType;
    String targetUse;


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getTargetUse() {
        return targetUse;
    }

    public void setTargetUse(String targetUse) {
        this.targetUse = targetUse;
    }
}
