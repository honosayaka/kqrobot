package core;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class WeatherBean{
        String date;
        String air;
        String timeLine;
        WeatherBean(JSONObject obj) {
            try {
                System.out.println(obj.toString());
                this.date = obj.getString("date");
                this.air = obj.getString("air_level");
                this.timeLine = getTimeLine(obj.getJSONArray("hours"));
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        @Override
        public String toString() {
            return date+" "+ "空气质量 "+air+"\n"+ timeLine;
        }

        String getTimeLine(JSONArray array){
            int len = array.length();
            List<TimeBean> list = new ArrayList();
            try{
                for (int i = 0;i < len;i++){
                    list.add(new TimeBean(array.getJSONObject(i)));
                }
            }catch (Exception e){
                System.out.println(e);
            }
            StringBuilder sb = new StringBuilder();
            for(TimeBean each : list){
                sb.append(each.toString()+"\n");
            }
            return sb.toString();

        }
        class TimeBean{
            String weather;
            String time;
            String wind;
            String tem;
            TimeBean(JSONObject obj){
                try {
                    this.weather = obj.getString("wea");
                    this.time = obj.getString("day");
                    this.tem = obj.getString("tem");
                    this.wind = obj.getString("win_speed")+obj.getString("win");
                }catch (Exception e){
                    System.out.println(e);
                }
            }
            @Override
            public String toString(){
                return this.time+" "+this.weather+" "+this.tem+"\n"+this.wind;
            }
        }
    }
