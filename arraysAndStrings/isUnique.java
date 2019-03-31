package arraysAndStrings;

public class isUnique {
 public static void main(String[] args) {
	 String input="abcc";
	 boolean result=isUnique(input);
	 System.out.println(result);
 }
 static boolean isUnique(String str) {
	 boolean[] char_value=new boolean[128];
	 if(str.length()>256) return false;
	 for(int i =0; i<str.length(); i++) {
		//int value=str.charAt(i);
		if(char_value[str.charAt(i)]) {
			return false;
		}
		else
			char_value[str.charAt(i)]=true;
	 }
	 return true;
 }
}
