package com.company.Task10;

public class Weather {
    public static String[] weathers = new String[]{"SUNNY", "COLD", "WARM", "RAINY", "STORMY", "CLOUDY", "FOGGY", "HOT"};

    public static String getWather(){
        final double a = Math.random()*7;
        return weathers[(int) a];
    }

    public static String getRandTemp(){
        final double a = 10 + Math.random() * 30;
        final String result = String.format("%.1f",a) + " C";
        return result;
    }

    public static String getRandWind(){
        final double a = Math.random() * 25;
        final String result = String.format("%.1f",a) + " km/h";
        return result;
    }
}
