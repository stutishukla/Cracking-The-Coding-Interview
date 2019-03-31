package arraysAndStrings;

import java.util.Arrays;

public class stringCompression {
	public static void main(String[] args) {
		String result=compressString("aabcccccaaa");
		System.out.println(result);
	}

	private static String compressString(String str) {
		// TODO Auto-generated method stub
		int[] count=new int[str.length()];
		Arrays.fill(count, 1);
		int j=0;
		for(int i=1; i<str.length();i++) {

			if(str.charAt(i)==str.charAt(i-1)) {
				count[j]++;
			}
			else if(str.charAt(i)!=str.charAt(i-1)) {
				j++;
			}
		}
		StringBuilder sb=new StringBuilder();
		j=0;
		for(int k=0; k<str.length();) {
			sb.append(str.charAt(k));
			sb.append(count[j]);
			k=k+count[j];
			j++;
		}
		if(sb.toString().length()>=str.length()) {
			return str;
		}
		else {
			return sb.toString();
		}

	}

}
