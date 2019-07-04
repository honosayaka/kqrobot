package core;

import org.java_websocket.drafts.Draft_17;

import java.net.URI;

public class Logic {
    public static void main(String[] args) throws Exception {
        MySocketClient.startConnect();
        System.out.println("already");
        new Thread(new TimeChecker()).start();
     //   new Thread(new TimeChecker()).start();
    }
}
