package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class FruitsListService {

    public static void main(String[] args) {
        // write your code here
        addFruitsToList("Apple,Guva,Pineapple,apple");
    }
    static List<String> addFruitsToList(String string)
    {
        String []fruits=string.split(",");
        List<String> fruitsList=new ArrayList<String>();


        for(int i=0;i<fruits.length;i++)
        {
            int f=0;
            for(String S:fruitsList)
            {
                if(S.equals())
                    f=1;
            }
            if(f==0)
                fruitsList.add(fruits[i]);
        }
        System.out.println(fruitsList);
        return fruitsList;
    }
    static int searchFruitList(List<String> fruitList,String fruit)
    {
        if(fruitList.contains(fruit)) {
            System.out.println("index:"+fruitList.indexOf(fruit));
            return fruitList.indexOf(fruit);
        }
        else{
            System.out.println("not Found");
            return -1;
        }
    }
}