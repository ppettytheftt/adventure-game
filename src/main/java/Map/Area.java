package Map;

import Characters.Npc;

import java.util.List;

public class Area {
    private String areaName;
    private String openingText;
    private List<String> nextAreas;
    private int diceForRolls;
    private List<String> possibleLookOutcomes;
    private List<Npc> npcList;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getOpeningText() {
        return openingText;
    }

    public void setOpeningText(String openingText) {
        this.openingText = openingText;
    }

    public List<String> getNextAreas() {
        return nextAreas;
    }

    public void setNextAreas(List<String> nextAreas) {
        this.nextAreas = nextAreas;
    }

    public int getDiceForRolls() {
        return diceForRolls;
    }

    public void setDiceForRolls(int diceForRolls) {
        this.diceForRolls = diceForRolls;
    }

    public List<String> getPossibleLookOutcomes() {
        return possibleLookOutcomes;
    }

    public void setPossibleLookOutcomes(List<String> possibleLookOutcomes) {
        this.possibleLookOutcomes = possibleLookOutcomes;
    }

    public List<Npc> getNpcList() {
        return npcList;
    }

    public void setNpcList(List<Npc> npcList) {
        this.npcList = npcList;
    }
}
