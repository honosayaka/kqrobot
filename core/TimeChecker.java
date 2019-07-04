package core;

import core.Function;

import java.text.SimpleDateFormat;

public class TimeChecker implements Runnable{
    SimpleDateFormat dateFormat = new  SimpleDateFormat("HH");
    boolean sended = false;
    @Override
    public void run() {
        while (true){
            String date =dateFormat.format(System.currentTimeMillis());
            if(date.equals("05") && ! sended){
                MySocketClient.client.sendToGroup(MySocketClient.SG,"早上好！\n"+ Function.getWeather("上海"));
                sended = true;
            }else if(date.equals("20") && ! sended){
                MySocketClient.client.sendToGroup(MySocketClient.SG,"晚上好！\n"+Function.getWeather("上海"));
                sended = true;
            }else if(date.equals("21")||date.equals("08")){
                sended = false;
            }
            try {
                Thread.sleep(1800000l);
            }catch (Exception e){
                System.out.println(e);
                MySocketClient.client.sendToPerson(675916756,"有错误！");
            }
        }
    }
}
