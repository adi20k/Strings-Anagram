package stringsanagram;

import java.util.Arrays;
import java.util.Scanner;

public class StringsAnagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
	    String str2=sc.next();
	    
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();

	    
	    if(str1.length() == str2.length()) {
	      char[] arr1 = str1.toCharArray();
	      char[] arr2 = str2.toCharArray();	      
	      Arrays.sort(arr1);
	      Arrays.sort(arr2);
	      boolean result = Arrays.equals(arr1, arr2);
	      if(result){
	        System.out.println(str1 + " and " + str2 + " are anagram");
	      }
	      else{
	        System.out.println(str1 + " and " + str2 + " are not anagram");
	      }
	    }
	    else{
	      System.out.println(str1 + " and " + str2 + " are not anagram.");
	    }
	}
}
