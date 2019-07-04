package core;

public class ContentChecker {
    public static boolean inGame = false;
    public static void check(String content){
        if(inGame && (content.equals("A")||content.equals("B"))){
            game.AliveRat.check(content);
        }else if(inGame && (!content.equals("A")||!content.equals("B"))){
            MySocketClient.client.sendToGroup(MySocketClient.SG,"指令错误，是否退出游戏？");
        }else if(inGame && content.equals("yes")){
            inGame = false;
            MySocketClient.client.sendToGroup(MySocketClient.SG,"已退出");
        }
        if(content.equals("jt")){
            inGame = !inGame;
            game.AliveRat.check(content);
        }
    }
}
