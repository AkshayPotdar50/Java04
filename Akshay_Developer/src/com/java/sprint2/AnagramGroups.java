package com.java.sprint2;

import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        String input = "listen silent enlist inlets stone notes tones apple";
        System.out.println("Group with the highest number of anagram words: " + Arrays.toString(findLargestAnagramGroup(input)));
    }

    public static String[] findLargestAnagramGroup(String input) {
        if (input == null || input.isEmpty()) {
            return new String[0];
        }

        String[] words = input.split("\\s+");
        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Group words by their sorted character representation
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagramGroups
                .computeIfAbsent(sortedWord, k -> new ArrayList<>())
                .add(word);
        }

        // Find the group with the highest number of anagrams
        List<String> largestGroup = new ArrayList<>();
        for (List<String> group : anagramGroups.values()) {
            if (group.size() > largestGroup.size()) {
                largestGroup = group;
            }
        }

        // Convert the list to an array and return
        return largestGroup.toArray(new String[0]);
    }
}

