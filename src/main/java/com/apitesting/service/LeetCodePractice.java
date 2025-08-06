package com.apitesting.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCodePractice {

	public static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()) return 0;

        // if(s.isBlank() || s.length() == 1) return 1;

		List<String> list = new ArrayList<String>();
		String storage = "";
		list.add(storage);
		for (int i = 0; i < s.length(); i++) {
			
			if(!storage.contains(""+s.charAt(i))) {
				String string = list.get(list.size()-1);
				string = string+s.charAt(i);
				list.set(list.size()-1, string);
			}else {
				list.add(""+s.charAt(i));
			}
		}
		
		System.out.println("list: "+ list);
		
		
		String longest = list.stream()
			    .max(Comparator.comparingInt(String::length))
			    .orElse(null);
		
		System.out.println("longest: "+ longest);
		
		return longest!=null ? longest.length() : 1;
	}
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

}
