package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class JavaStringPractise {
    public static void main(String[] args) {

        String st= "nahoM";
        String s= "avaJ egaugnaL";

        // Reverse the string -
        String reversed = new StringBuilder(st).reverse().toString();
        System.out.println(reversed);

        // Reverse the string without using inbuilt method -
        StringBuilder reversedS = new StringBuilder();
        for(int i=st.length()-1; i>=0 ; i--){
            char[] c = st.toCharArray();
            reversedS.append(c[i]);
        }
        System.out.println(reversedS);

        // Reverse the string by maintaining the word order -
        String[] wordBreak = s.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for(String word:wordBreak){
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }
        System.out.println(reversedString);

        // check if two strings are anagrams of each other.
        String st1 = "listen";
        String st2 = "silent";
        char[] ch1 = st1.toCharArray();
        char[] ch2 = st2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean isAnagrams = Arrays.equals(ch1, ch2);
        System.out.println(isAnagrams);

        //count the occurrence of each character in a string.
        String myString = "sampleghdgjjkhkstri";
        Map<Character,Integer> count = new TreeMap<>();
            for(char ch:myString.toCharArray()){
                if(count.containsKey(ch)){
                    count.put(ch,count.get(ch)+1);
                }else{
                    count.put(ch,1);
                }
            }

        for(Map.Entry<Character,Integer> entry: count.entrySet()){
            if((entry.getValue()).equals(1)) {
                System.out.println(entry.getKey());
            }
            break;
        }

    }
}
