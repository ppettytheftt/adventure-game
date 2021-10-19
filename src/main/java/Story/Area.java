package Story;

import Characters.EnemyCharacter;
import Characters.Npc;

import java.util.List;

public class Area {
    String areaName;
    String areaDescription;
    List<Npc> npcList;
    List<EnemyCharacter> enemyCharacterList;
    NextPaths nextPaths;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaDescription() {
        return areaDescription;
    }

    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
    }

    public List<Npc> getNpcList() {
        return npcList;
    }

    public void setNpcList(List<Npc> npcList) {
        this.npcList = npcList;
    }

    public List<EnemyCharacter> getEnemyCharacterList() {
        return enemyCharacterList;
    }

    public void setEnemyCharacterList(List<EnemyCharacter> enemyCharacterList) {
        this.enemyCharacterList = enemyCharacterList;
    }

    public NextPaths getNextPaths() {
        return nextPaths;
    }

    public void setNextPaths(NextPaths nextPaths) {
        this.nextPaths = nextPaths;
    }
}
