package Story;

import java.util.List;

public class NextPaths {
    List<Area> nextPossibleAreas;
    boolean isBlocked;
    Area areaBlocked;

    public List<Area> getNextPossibleAreas() {
        return nextPossibleAreas;
    }

    public void setNextPossibleAreas(List<Area> nextPossibleAreas) {
        this.nextPossibleAreas = nextPossibleAreas;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public Area getAreaBlocked() {
        return areaBlocked;
    }

    public void setAreaBlocked(Area areaBlocked) {
        this.areaBlocked = areaBlocked;
    }
}
