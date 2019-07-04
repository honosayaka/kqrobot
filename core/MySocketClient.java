package core;

import cc.plural.jsonij.JSON;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class MySocketClient extends WebSocketClient {

   // public static int SG = 1009358004;
    public static int SG = 523175264;

    MySocketClient(URI uri, Draft draft){
            super(uri, draft);
    }

    public void  sendToGroup(int groupId, String msg){
        if(!isOnline){
            try{
                Thread.sleep(2000l);
            }catch (Exception e){
                System.out.println(e);
            }

        }
        Map<String,String> map = new HashMap<>();
        map.put("act","101");
        map.put("groupid",String.valueOf(groupId));
        map.put("msg", msg);
        String content = Utils.JSONBuilder(map);
        System.out.println("构造的\n"+content);
        send(content);
    }


    public void sendToPerson(int QQ, String msg){
        if(!isOnline){
            try{
                Thread.sleep(2000l);
            }catch (Exception e){
                System.out.println(e);
            }

        }
        Map<String,String> map = new HashMap<>();
        map.put("act","106");
        map.put("groupid",String.valueOf(QQ));
        map.put("msg", msg);
        String content = Utils.JSONBuilder(map);
        send(content);
    }
    @Override
    public void onMessage( String message ){
        JSON json = null;
        String msg = "";
        System.out.println(message);
        try{
            json = JSON.parse(message);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(String.format("%s", json.get("act")));
        if(String.format("%s", json.get("act")).trim().equals("21"))
        {
            msg = String.format("%s", json.get("fromQQ")) + "对你说： " + String.format("%s", json.get("msg"));
            System.out.println(msg);
        }
        else if(String.format("%s", json.get("act")).trim().equals("2"))
        {
            msg = String.format("%s", json.get("fromQQ")) + "在群" + String.format("%s", json.get("fromGroup")) + "里说: " + String.format("%s", json.get("msg"));
        }
        else if(String.format("%s", json.get("act")).trim().equals("4"))
        {
            msg = String.format("%s", json.get("fromQQ")) + "在讨论组" + String.format("%s", json.get("fromDiscuss")) + "里说: " + String.format("%s", json.get("msg"));
        }
        ContentChecker.check(String.format("%s", json.get("msg")));
        System.out.println(msg);

    }

    public static boolean isOnline = false;
    public void onOpen( ServerHandshake handshake ) {

        System.out.println("你已经连接到: " + getURI());
        isOnline = true;
    }

    @Override
    public void onClose( int code, String reason, boolean remote ) {
        System.out.println("你已经断开连接: " + getURI() + "; Code: " + code + " " + reason);
    }

    @Override
    public void onError( Exception ex ) {
        System.out.println(ex);
    }

    public static void main(String[] args) throws Exception {
        String LemocUrl = "ws://localhost:25303";
        MySocketClient client = new MySocketClient(new URI(LemocUrl), new  Draft_17());
        client.connect();
        client.sendToGroup(523175264,"测试");
        client.sendToGroup(523175264,"测试");client.sendToGroup(523175264,"测试");
        client.sendToGroup(523175264,"测试");client.sendToGroup(523175264,"测试");client.sendToGroup(523175264,"测试");
//        client.send("{\"act\":\"101\",\"groupid\":\"523175264\",\"msg\":\"测试\"}");
//        client.send("{\"act\":\"106\",\"QQID\":\"675916756\",\"msg\":\"测试\"}".trim());
        System.out.println("send!");
    }
    public  static MySocketClient client;
    public static MySocketClient startConnect(){
        String LemocUrl = "ws://localhost:25303";
        try{
            client = new MySocketClient(new URI(LemocUrl), new  Draft_17());
            client.connect();
            return client;
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
