package Story;

import java.util.List;

public class StoryAct {
    int actNumber;
    List<Area> areasInThisAct;

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public List<Area> getAreasInThisAct() {
        return areasInThisAct;
    }

    public void setAreasInThisAct(List<Area> areasInThisAct) {
        this.areasInThisAct = areasInThisAct;
    }
}
