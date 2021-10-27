package BattleMechanics;

import Map.Area;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DiceAndCoinService {

    public int rollDice(int numberOfDiceSides) {

        int numberReturned = 0;
        if (numberOfDiceSides == 20) {
            numberReturned = ThreadLocalRandom.current().nextInt(1, 21);
        } else if (numberOfDiceSides == 12) {
            numberReturned = ThreadLocalRandom.current().nextInt(1, 13);
        } else if (numberOfDiceSides == 10) {
            numberReturned = ThreadLocalRandom.current().nextInt(1, 11);
        } else if (numberOfDiceSides == 8) {
            numberReturned = ThreadLocalRandom.current().nextInt(1, 9);
        } else if (numberOfDiceSides == 6) {
            numberReturned = ThreadLocalRandom.current().nextInt(1, 7);
        } else if (numberOfDiceSides == 4) {
            numberReturned = ThreadLocalRandom.current().nextInt(1, 5);
        }
        return numberReturned;
    }

    public int flipACoin() {
        return ThreadLocalRandom.current().nextInt(1, 3);
    }

    public void rollForLook(Area currentArea) {
        DiceAndCoinService diceAndCoinService = new DiceAndCoinService();
        List<String> lookList = currentArea.getPossibleLookOutcomes();
        int diceRoll = diceAndCoinService.rollDice(currentArea.getDiceForRolls());

        System.out.println(lookList.get(diceRoll - 1));
    }
}
