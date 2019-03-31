package arraysAndStrings;

import java.util.Arrays;

public class stringPermutation {
	public static void main(String[] args) {
		String str1="abc";
		String str2="def";
		boolean result=isPermutation(str1, str2);
		//System.out.println(result);
		boolean result2=isPermutationII(str1,str2);
		System.out.println(result2);

	}
	//Method 1:Sorting
	public static boolean isPermutation(String str1, String str2) {
		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i =0; i<s1.length; i++) {
			if(s1[i]!=s2[i]) {
				return false;
			}
		}
		return true;
	}
	//Method 2: Maintaining the character count of both the strings
	public static boolean isPermutationII(String str1, String str2) {
		int[] charSet= new int[256];
		for(int i =0; i<str1.length(); i++) {
				charSet[str1.charAt(i)]++;
 		}
		for(int j=0; j<str2.length(); j++) {
			charSet[str2.charAt(j)]--;
			if(charSet[str2.charAt(j)]<0) return false;
		}
		return true;
		
	}
	

}
