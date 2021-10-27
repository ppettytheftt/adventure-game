package MiscServices;

import Map.Area;
import Map.LevelLoader;

import java.util.ArrayList;
import java.util.List;

public class LocationService {
    private LevelLoader levelLoader = new LevelLoader();




    public Area loadMovingChoice(int choiceForMove) {

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

    public List<Area> getAllAreasLevelOne(){
        List<Area> areaList = new ArrayList<>();
        Area mainRoad = levelLoader.loadMainRoad();
        Area bazaar = levelLoader.loadBazaar();
        Area tavern = levelLoader.loadTavern();
        Area church = levelLoader.loadChurch();
        Area castleGates = levelLoader.loadCastleGates();
        areaList.add(mainRoad);
        areaList.add(bazaar);
        areaList.add(tavern);
        areaList.add(church);
        areaList.add(castleGates);

        return areaList;
    }
}
