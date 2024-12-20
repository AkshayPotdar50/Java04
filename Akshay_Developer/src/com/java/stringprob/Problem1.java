package com.java.stringprob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class Problem1 {

    //differ ways of finding most repeated elements
    public static int findMostRepeatedElement(int[] array){
        HashMap<Integer,Integer> countMap= new HashMap<>();
        int maxCount=0;
        int mostRepeated=array[0];

        for(int num : array){
            countMap.put(num,countMap.getOrDefault(num,0)+1);

            //update most repeated element
            if(countMap.get(num) >maxCount){
                maxCount =countMap.get(num);
                mostRepeated=num;
            }
        }
        return mostRepeated;
    }
    public static void findMostRepetatedElement(int[]arr){

        Function<Map<Integer,Long>, Integer> maxValueKey=
                integerLongMap -> integerLongMap.entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .orElse(Integer.MAX_VALUE);
        Integer maxDuplicateValue= Arrays.stream(arr).boxed()
                .collect(collectingAndThen(groupingBy(Function.identity(),counting()),maxValueKey));

        System.out.println("max duplicate value in array is "+maxDuplicateValue);
    }

    public static int findMaximumElementInArraySoFindRange(int[] arr){
    	//so this method will find median of an array
        Integer minimum=Arrays.stream(arr).min().orElseThrow(IllegalArgumentException::new);
        Integer maximum=Arrays.stream(arr).max().orElseThrow(IllegalArgumentException::new);

        int range=maximum-minimum;
        return range;
    }


    public static void main(String[] args) {
        int[] array={1,2,2,3,4,5,2,3,3,3};

        //find and print
        int mostRepeated=findMostRepeatedElement(array);
        System.out.println("most repeated element: "+ mostRepeated);

        findMostRepetatedElement(array);

        System.out.println("range of array is "+findMaximumElementInArraySoFindRange(array));

    }
}
