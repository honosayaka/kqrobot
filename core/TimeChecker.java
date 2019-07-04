package core;


import java.text.SimpleDateFormat;

public class TimeChecker implements Runnable{
    SimpleDateFormat dateFormat = new  SimpleDateFormat("HH");
    @Override
    public void run() {
        if (!MySocketClient.isOnline){
            rest(10000);
        }
            System.out.println("TimeChecker Start to Run!!");


        while (true){
            String date =dateFormat.format(System.currentTimeMillis());//type1代表晚上
            if(date.equals("06")){
                Function.hello(2);
                rest(1000*60*120l);
            }else if(date.equals("20")){
                Function.hello(1);
                rest(1000*60*120l);
            }
            rest(600000l);
        }
    }
    public void rest(long mill){
        try {
            Thread.sleep(mill);
        }catch (Exception e){
            System.out.println(e);
            MySocketClient.client.sendToPerson(675916756,"有错误！");
        }
    }
}
