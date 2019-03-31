package arraysAndStrings;

public class URLIfy {
	public static void main(String[] args) {
		String input="Mr John Smith ";
		int length=13;
		char[] arr=input.toCharArray();
	    StringBuilder sb =new StringBuilder();
		int i=0;
		while(i<length) {
			System.out.println(arr[i]);
			if(arr[i]!=' ') {
				sb.append(arr[i]);
			}
			else {
				sb.append("%20");
			}
			i++;
		}
		System.out.println(sb.toString());
	}

}
