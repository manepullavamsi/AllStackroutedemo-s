package com.stackroute;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
/*
This is an functional interface where it has only one method to callaulate the tax of each product
 */
public class CartCheckout {
    interface Calculator {
        BigDecimal tax(BigDecimal b, double tax);
    }

    public static void main(String[] args) {
        /*
        Here we are using maps to store product with respective to its price where Map is an interface it contains classes hashmap and treemap we are using hashmap here.
         the key type is String and value type is BigDecimal where BigDecimal is an Datatype which extends Numerator class it perform calculations less accuracy whwn compared to Double Dtatype
         in order to perform operations on values we need to use BigDecimal Class has Methods like add,division,mulitply which return BigDecimal type all these methods are Static so we can acess them with the class name.
         */
        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
        map.put("Apple", BigDecimal.valueOf(54));
        map.put("Grapes", BigDecimal.valueOf(36.78));
        map.put("papaya", BigDecimal.valueOf(27.89));
        map.put("Orange", BigDecimal.valueOf(23.6));
        map.put("Banana", BigDecimal.valueOf(10.2));
        System.out.println("Input : " + map + "Tax: 10.5");
        System.out.println(billGenerator(map, 10.5)); //Calling billgenerator method by passing map and tax value with  proper input.
        System.out.println("Input : " + map + "Tax: null");
        System.out.println(billGenerator(map, null));//Calling billgenerator method by passing map and tax value with null it returns error message.
        System.out.println("Input : " + map + "Tax: -2.4");
        System.out.println(billGenerator(map, -2.4));//Calling billgenerator by passing tax value as negative then it returns error message.
        Map<String, BigDecimal> mapEmpty = new HashMap<String, BigDecimal>();//Creating empty map to test our method.
        System.out.println("Input : " + mapEmpty + "Tax: 10.2");
        System.out.println(billGenerator(mapEmpty, 10.2));//Calling billGenerate method by passing emptyMap which return a error message.
    }
/*
        - Should take a Map and Double as input and return a String as result

         - Should validate the input Map by checking it is empty and return error String if it is empty

         - Should return error String when Map contains null or empty or blank space as a value

         - Should return error String when the Double is negative or null
    !By considering above constraints we are implementing billGenerator() method.

 */
    static String billGenerator(Map<String, BigDecimal> map, Double tax) {
       //It is an anonymous function new feature from java* version where this method is declared inside an functional interface and reference of this method is taxcal where this method is used to calculate tax of each product and return tax.
        Calculator taxcal = (v, t) ->
        {
            BigDecimal taxs = BigDecimal.valueOf(t);
            BigDecimal eachTax = v.multiply(taxs.divide(BigDecimal.valueOf(100)));
            return eachTax;
        };
        if (map.size() == 0)    //Here we are checking size of map is map size is zero then it return error message.
            return "The Cart Map is Empty.";
        if (tax == null) //Here we are checking the value of tax is null or not if null then return error message.
            return "The taxPercent cannot be null.";
        if (tax < 0) //Here we are checking there is some possible cases where tax can be can be give -ve if -ve then return error message.
            return "The taxPercent Cannot be negative.";
        BigDecimal totalPrice = BigDecimal.valueOf(0); //Here we are intailizing 0 to totalprice
        for (String key : map.keySet()) {       //Here we using map.keyset() method which is going to return a all keys of map
            BigDecimal eachTax = taxcal.tax(map.get(key), tax);  //we are calling anonymous function which return tax of product
            totalPrice = totalPrice.add((map.get(key)).add(eachTax));//here we are adding product Price with its  tax to totalPrice here add method add values and return BigDecimal and map.get() method accept key and return particular value from key.
        }

        return totalPrice.toString();//converting BigDecimal to string and returning to calling Area.
    }
}
