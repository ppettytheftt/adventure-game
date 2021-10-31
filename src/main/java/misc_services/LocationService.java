package misc_services;

import map.Area;
import map.LevelOneLoader;

import java.util.ArrayList;
import java.util.List;

public class LocationService {
    private LevelOneLoader levelOneLoader = new LevelOneLoader();

    //Level one has been extremely basic to lay the groundwork down for how the game works. After the gate pass is collected and
    //the player character makes it out of the castle gates, battle mechanics, items, finer movement and all will need
    //to be figured out but those issues will present themselves as they come so we will focus on core mechanics for now.

    // In the level two loader we can go through and brainstorm how the next area will work and we can apply better ways
    // to move around in game (using the nextPossibleAreas in the Area class) and find a way to get either random encounters or
    // have set encounters kind of like a game of dnd. Something we can figure out.

    public Area loadMovingChoice(int choiceForMove) {

        Area newCurrentArea = new Area();
        switch (choiceForMove) {
            case 1:
                newCurrentArea = levelOneLoader.loadMainRoad();
                break;

            case 2:
                newCurrentArea = levelOneLoader.loadBazaar();
                break;

            case 3:
                newCurrentArea = levelOneLoader.loadTavern();
                break;

            case 4:
                newCurrentArea = levelOneLoader.loadChurch();
                break;

            case 5:
                newCurrentArea = levelOneLoader.loadCastleGates();
                break;
        }
        return newCurrentArea;
    }

    public List<Area> getAllAreasLevelOne(){
        List<Area> areaList = new ArrayList<>();
        Area mainRoad = levelOneLoader.loadMainRoad();
        Area bazaar = levelOneLoader.loadBazaar();
        Area tavern = levelOneLoader.loadTavern();
        Area church = levelOneLoader.loadChurch();
        Area castleGates = levelOneLoader.loadCastleGates();
        areaList.add(mainRoad);
        areaList.add(bazaar);
        areaList.add(tavern);
        areaList.add(church);
        areaList.add(castleGates);

        return areaList;
    }
}
