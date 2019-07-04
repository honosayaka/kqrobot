package core;

import game.Game;
import game.ZombCity;

public class ContentChecker {
    public static boolean inGame = false;
    public static boolean readyExit = false;
    public static void check(String content){


        if(inGame){
            gameCheck(content);
        }else if(content.equals("jGame1")){
            inGame = true;
            ZombCity.check(content);
        }else if(content.equals("jGamelist")){
            send(Game.getGameList()+"\\n\\n回复游戏代码开始游戏，任意回复后可退出");
        }else if (content.equals("机器人帮助")){
            send("现在我可以告诉你天气点歌和一个游戏\\n回复jGamelist查看游戏列表\\n回复 点歌 歌名 可以点歌(大小写不要错哦)");
        }



    }



    public static void gameCheck(String content){
        if(inGame && (content.equals("A")||content.equals("B")||content.equals("C")||content.equals("D"))){
            ZombCity.check(content);
        }else if(inGame && (!content.equals("A")||!content.equals("B")||!content.equals("C")||!content.equals("D")) &&!readyExit){
            MySocketClient.client.sendToGroup(MySocketClient.SG,"指令错误，是否退出游戏？yes|on");
            readyExit = true;
        }else if(inGame && content.equals("yes")&& readyExit){
            inGame = false;
            readyExit = false;
            MySocketClient.client.sendToGroup(MySocketClient.SG,"已退出");
        }
    }
    public static void send(String msg){
        MySocketClient.client.sendToGroup(MySocketClient.SG,msg);
    }
}
