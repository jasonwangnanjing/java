package com.bsh.cic.hello;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
 
/**
 * 2015-10-24 
 * First Java try
 */
public class App {
    public static void main(String[] args) {
        try {            
            BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"));
            String s;
            StringBuffer sb = new StringBuffer();
        	Map<String,Integer> map = new HashMap<String, Integer>();
        	
            while ((s = br.readLine()) != null) {
            
                StringTokenizer st = new StringTokenizer(s.toString(),",.! \n");
                while (st.hasMoreTokens()) {
                    String letter = st.nextToken();
                    int count;
                    if (map.get(letter) == null) {
                        count = 1;
                    } else {
                        count = map.get(letter).intValue() + 1;
                    }
                    map.put(letter,count);
                }
            	            
        }
                       
            for (String key : map.keySet()) {
               System.out.println( "Word" + "  " +  key + "  " + "Frequecy" + "  " + map.get(key));
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到~！");
        } catch (IOException e) {
            System.out.println("文件读异常~！");
        }
    }
}
