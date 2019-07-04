package core;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Utils {
    public static String JSONBuilder(Map<String ,String> map){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        int times = map.size();
        int now = 1;
        for (Map.Entry<String,String>  entry : map.entrySet()) {
            sb.append(String.format("\"%s\":\"%s\"",entry.getKey(),entry.getValue()));
            if (now < times){
                sb.append(",");
            }
            now++;
        }
        sb.append("}");
        return sb.toString();
    }

    public static String read(InputStream in){
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder sb = new StringBuilder();
        String s = "";
        try{
            while((s = reader.readLine()) != null){
                sb.append(s);
            }
            reader.close();
        }catch (Exception e){
            System.out.println(e);
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("a","a");
        m.put("b","b");
        System.out.println(JSONBuilder(m));
    }
}
