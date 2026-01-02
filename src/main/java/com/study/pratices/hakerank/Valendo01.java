package com.study.pratices.hakerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class Valendo01 {

    class Log{
        String user;
        Integer logAmount;
    }

    public static List<String> processLogs(List<String> logs, int threshold) {

        Map<String, Integer> logMap = new HashMap<>();

        List<String> result = new ArrayList<>();

        for (String log : logs) {

            String[] parameters = log.split(" ");

            String sender = parameters[0];
            String receiver = parameters[1];

            if (sender.equals(receiver)) {
                logMap.put(sender, logMap.containsKey(sender) ? logMap.get(sender) + 1 : 1);
            } else {
                logMap.put(sender, logMap.containsKey(sender) ? logMap.get(sender) + 1 : 1);
                logMap.put(receiver, logMap.containsKey(receiver) ? logMap.get(receiver) + 1 : 1);
            }
        }

        for(Map.Entry<String, Integer> log : logMap.entrySet()) {
            if(log.getValue() > threshold){
                result.add(log.getKey());
            }
        }

        return result;
    }

}
