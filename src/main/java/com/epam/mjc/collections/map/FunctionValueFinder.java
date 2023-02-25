package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        boolean result = false;
        for (Integer key: functionMap.keySet()){
            int key1 = (requiredValue-2)/5;
            int key2 = key1 * (-1);
            if (functionMap.containsKey(key1) || functionMap.containsKey(key2)){
                result = true;}

    }return result;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();
        for(int i=0; i<sourceList.size(); i++){
            int key = sourceList.get(i);
            functionMap.put(key, key*5+2);}
        return functionMap;
        }
}
