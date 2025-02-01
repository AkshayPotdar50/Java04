package com.java.practo.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HhashmapIterator {

	public static void main(String[] args) {
		HashMap<Integer, String> hmp= new HashMap<>();
		hmp.put(1, "apple");
		hmp.put(2, "Banana");
        hmp.put(3, "Cherry");
        System.out.println(hmp);
        System.out.println("******//////////******///////////******///////////*****");
        
        Iterator<Entry<Integer, String>> iterator= hmp.entrySet().iterator();
        while(iterator.hasNext()) {
        	Map.Entry<Integer, String> entry= iterator.next();
        	System.out.println("key"+entry.getKey()+" "+"value"+entry.getValue());
        	}
        
        System.out.println("using advanced for loop for iteration");
        
        //using for loop
        for(Map.Entry<Integer, String> entry :hmp.entrySet()) {
        	System.out.println("key"+entry.getKey()+"value"+entry.getValue());
        	
        }
        
        
        //using foreach
        System.out.println("using modern foreach");
        hmp.forEach((key,value)->System.out.println("key"+key+" "+"value"+value));

	}

}
