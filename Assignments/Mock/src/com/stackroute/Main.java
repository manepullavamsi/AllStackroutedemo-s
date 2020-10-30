package com.stackroute;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args)
    {
        getColumnType();

            /*System.out.println("Hello World");
            String string = "2008-04-18";
            LocalDate date = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
            String text = string.format(String.valueOf(formatter));
            LocalDate parsedDate = LocalDate.parse(text, formatter);
            System.out.println(date); // 2010-01-02
    */
    }
        public static  void getColumnType()
        {
            //throws IOException, FileNotFoundException {
       // FileReader fileReader=new FileReader("data/ipl.csv");
        //BufferedReader br=new BufferedReader(fileReader);
        String line1= "1, 18-03-2008, Bangalore, 2008-04-18, Kolkata Knight Riders, Royal Challengers Bangalore, Royal Challengers Bangalore, field, normal, 0, Kolkata Knight Riders, 140, 0, BB McCullum, M Chinnaswamy Stadium, Asad Rauf, RE Koertzen,";
        String line2= "1.2, 18-03-2008, Bangalore, 2008-04-18, Kolkata Knight Riders, Royal Challengers Bangalore, Royal Challengers Bangalore, field, normal, 0, Kolkata Knight Riders, 140, 0, BB McCullum, M Chinnaswamy Stadium, Asad Rauf, RE Koertzen,";
        String line[]=line2.split(",",line1.length());
        String []DataTypes=new String[line.length];
        int i=0;
        for(i=0;i<line.length;i++)
        {
            try
            {
                Integer value=Integer.parseInt(line[i]);
                DataTypes[i]=value.getClass().getName();
            }
            catch (NumberFormatException e)
            {
                try {
                    Float value=Float.parseFloat(line[i]);
                    DataTypes[i]=value.getClass().getName();
                }
                catch (NumberFormatException ae)
                {
                    Pattern pattern= Pattern.compile("(^ \\d{4}-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])$) | (^ (0?[1-9]|[12][0-9]|3[01])$-(0?[1-9]|1[012])-\\d{4})");
                    Matcher matcher= pattern.matcher(line[i]);

                    if(line[i].isEmpty())
                        DataTypes[i]="java.lang.Object";
                    else if(matcher.matches())
                    {
                        DataTypes[i]="java.util.Date";
                    }

                    else
                        DataTypes[i]=line[i].getClass().getName();
                }
            }
        }
        //DataTypeDefinitions dataTypeDefinitions=new DataTypeDefinitions();
        //dataTypeDefinitions.setDataTypes(DataTypes);
        System.out.println(DataTypes[3]+" Values ");
        //return null;
    }

    }
