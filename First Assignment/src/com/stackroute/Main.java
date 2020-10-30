package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String getConditionsPartQuery(String queryString) {

        String s[]= queryString.split("where");
        String S[]=(s[1].split(" order by "));
        S[0] = S[0].replace("B","b");
//        String k[]=S[0].split(" or || and || AND || OR ");
        System.out.println(S[1].trim());

        return  S[0];
    }
/*
    public static  String[] getLogicalOperators(String queryString) {

        Pattern pattern=Pattern.compile("(or)");
        Matcher matcher=pattern.matcher(queryString);
        System.out.println(matcher.group());
        return null;
    }
*/

    public static void main(String[] args) {
        System.out.println();
        getConditionsPartQuery("select city,winner,player_match from ipl.csv where season > 2014");
	// write your code here
    }
}
