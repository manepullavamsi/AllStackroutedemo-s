package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class ModifyMaps {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,String> map=new HashMap<String, String>();
        map.put("val2","C++");
        map.put("val1","Java");//Here we are adding values into map

        System.out.println(map);
        map.replace("val2",map.get("val1"));//Here we are replacing values of map by using replace method with respective that key.
        map.replace("val1"," ");
        System.out.println(map);
    }

}
