package arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
	public static void main(String[] args) {
		String input="stuti";
		input=input.toLowerCase();
		int count=0,even=0,odd=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!=' ') {
				count++;
			}
		}
		if(count%2==0)
			System.out.println("false");
		Map<Character,Integer>hmap=new HashMap<Character,Integer>();
		for(int i=0; i<input.length(); i++) {
			char c=input.charAt(i);
			if(c!=' ') {
				if(hmap.containsKey(c)) {
					System.out.println("c::::"+c);
					hmap.put(c,hmap.get(c)+1);
				}
				else {
					System.out.println("oops::::"+c);
					hmap.put(c, 1);
				}
			}
		}
		for (Integer value : hmap.values()) {
			if(value%2!=0) {
				System.out.println("value::::"+value);
				odd++;
			}
		}
		if(odd==1)
			System.out.println("true");
		else
			System.out.println("false");


	}

}
