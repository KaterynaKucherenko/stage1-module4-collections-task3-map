package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String str = sentence.toLowerCase();
        str = str.replaceAll("\\W", " ");

        int value =1;
        String [] words = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i< words.length; i++){
            if(!map.containsKey(words[i]) && words[i].length()>0){
                map.put(words[i], 1);
            value=1;}
            else if (map.containsKey(words[i])){
                map.put(words[i], 2);}


            }
        return map;}

    }

