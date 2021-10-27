package MiscServices;

import Map.Area;
import Map.LevelLoader;

public class LocationService {
    public Area loadMovingChoice(int choiceForMove) {
        LevelLoader levelLoader = new LevelLoader();

        Area newCurrentArea = new Area();
        switch (choiceForMove) {
            case 1:
                newCurrentArea = levelLoader.loadMainRoad();
                break;

            case 2:
                newCurrentArea = levelLoader.loadBazaar();
                break;

            case 3:
                newCurrentArea = levelLoader.loadTavern();
                break;

            case 4:
                newCurrentArea = levelLoader.loadChurch();
                break;

            case 5:
                newCurrentArea = levelLoader.loadCastleGates();
                break;
        }
        return newCurrentArea;
    }
}
