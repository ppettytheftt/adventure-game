package BattleMechanics;

import Characters.EnemyCharacter;

import java.util.List;

public class Battle {
    List<EnemyCharacter> EnemyList;
    int currentTurn;

    public List<EnemyCharacter> getEnemyList() {
        return EnemyList;
    }

    public void setEnemyList(List<EnemyCharacter> enemyList) {
        EnemyList = enemyList;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

}
