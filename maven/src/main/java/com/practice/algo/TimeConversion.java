package com.practice.algo;

public class TimeConversion {

    /**
     * Given a 12-Hour timestamp, (e.g. 08:00:00AM), turns it into 24-Hour format.
     * @param timestamp indicating the time in 12-Hour format
     * @return 24-Hour format version of the timestamp
     */
    public static String convertToTwentyFourHourFormat(String timestamp){
        if(timestamp.contains("AM")){
            return handleAM(timestamp);
        }
        return handlePM(timestamp);
    }

    private static String handleAM(String timestamp){
        int intHour = getHour(timestamp);
        if(intHour == 12){
            return "00" + timestamp.substring(2, timestamp.length()-2);
        }
        return timestamp.substring(0, timestamp.length()-2);
    }

    private static String handlePM(String timestamp){
        int intHour = getHour(timestamp);
        if(intHour == 12){
            return timestamp.substring(0, timestamp.length()-2);
        }

        int pmHour = intHour + 12;
        return ""+pmHour+timestamp.substring(2, timestamp.length()-2);
    }

    private static int getHour(String timestamp) {
        String hour = timestamp.substring(0, 2);
        return Integer.parseInt(hour);
    }
}
