package core;

import cc.plural.jsonij.JSON;
import org.json.JSONArray;



import java.net.HttpURLConnection;
import java.net.URL;

public class Function {
    public static String getWeather(String city){
        try{
            URL url = new URL("https://www.tianqiapi.com/api/?version=v1&city="+city);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            String result = Utils.read(connection.getInputStream());
         //   System.out.println(result);
            JSON json = JSON.parse(result);
            String data = json.get("data").getString();
            JSONArray jsObj = new JSONArray(data);
            WeatherBean w = new WeatherBean(jsObj.getJSONObject(0));
            return w.toString();
        }catch (Exception e){
            System.out.println(e);
        }
        return "天气获取失败";
    }



    public  static void hello(int type){
        String content = getWeather("上海");
        if(type == 1){
            MySocketClient.client.sendToGroup(MySocketClient.SG,"晚上好！\\n"+content);
            return;
        }else {
            MySocketClient.client.sendToGroup(MySocketClient.SG,"早上好！\\n"+content);
        }
    }

    public static void main(String[] args) {

        System.out.println(getWeather("上海"));
    }
}
