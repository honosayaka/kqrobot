package game;

import java.util.HashMap;
import java.util.Map;

public class Game {
    static Map<String,String> gameList = new HashMap<>();

    static{
        gameList.put("jGame1","世末之城");
    }

    public static String getGameList(){
        StringBuilder sb = new StringBuilder();
        sb.append("游戏代码\\t游戏名称\\n");
        for (Map.Entry<String,String>  entry : gameList.entrySet()) {
            sb.append(entry.getKey()+"\\t"+entry.getValue()+"\\n");
        }


        return sb.toString();
    }
}
