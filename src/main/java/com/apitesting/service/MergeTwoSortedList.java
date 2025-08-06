package com.apitesting.service;




public class MergeTwoSortedList {
	
//	public static boolean isPalindrome(String str) {
//		return str.isBlank() ? false : str.toLowerCase().equals(new StringBuilder(str).reverse().toString());
//	}
	
	public static boolean isPalindrome(String str) {
		
		str = str.toLowerCase();
		
		for(int i = 0; i< str.length(); i ++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
		}
		
//		int firstIndex = 0;
//		int lastIndex = str.length()-1;
//		
//		while(firstIndex < lastIndex) {
//			if(str.charAt(firstIndex) != str.charAt(lastIndex)) return false;
//			firstIndex ++; lastIndex --;
//		}
		
		
		return true;
	}
	
	
	
	 public static int countCharIn(char ch, String s){
	        int count = 0;
	        for(int i = 0; i< s.length(); i++){
	            if(s.charAt(i) == ch) count++;
	        }
	        
	        return count;
	    }
	    static char nonRepeatingChar(String s) {
	        // code here
	        char ch[] =s.toCharArray();
	        
	        ch[1] = 9;
	        
	        for(int i = 0; i< ch.length; i++){
	            if(countCharIn(ch[i], s) == 1){
	                return ch[i];
	            }
	        }
	        
	        return '\0';
	    }
	
	public static void main(String[] args) {
		String str = new String("Madam");
		System.out.println("is "+ str +" palindrom? : "+ isPalindrome(str));
	}
	
	

}
