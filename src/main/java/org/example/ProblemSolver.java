package org.example;

import java.util.HashMap;
import java.util.List;

public class ProblemSolver {

    private static final Direction up = new Direction(1, 0);
    private static final Direction down = new Direction(-1, 0);
    private static final Direction right = new Direction(0, 1);
    private static final Direction left = new Direction(-1, 0);

    private static final HashMap<Character, Direction[]> mapTiles = new HashMap<>();

    static {
        mapTiles.put('|', new Direction[]{up, down});
        mapTiles.put('-', new Direction[]{right, left});
        mapTiles.put('L', new Direction[]{up, right});
        mapTiles.put('J', new Direction[]{up, left});
        mapTiles.put('7', new Direction[]{down, left});
        mapTiles.put('F', new Direction[]{down, right});
    }

    public static Integer[] findStartingPosition(List<String> map){
        for(int i = 0; i < map.size(); i++) {
            for(int j = 0; j < map.get(i).length(); j++) {
                if(map.get(i).charAt(j) == 'S') {
                    return new Integer[]{i, j};
                }
            }
        }
        System.out.println("The input file doesn't contains starting position(S) !!!");
        return new Integer[]{-1,-1};
    }


}
