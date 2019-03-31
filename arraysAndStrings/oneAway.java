package arraysAndStrings;

public class oneAway {
	public static void main(String[] args) {
		String str1="ple";
		String str2="pale";
		if(str1.length()!=str2.length()) {
			boolean result=unequalStrings(str1,str2);
			System.out.println(result);
		}
		else {
			boolean result=equalStrings(str1,str2);
			System.out.println(result);
		}
	}

	private static boolean equalStrings(String str1, String str2) {
        int i=0, equals=0,edit=0;
        while(i<str1.length()) {
        	if(str1.charAt(i)==str2.charAt(i)) {
        		equals++;
        	}
        	else {
        		edit++;
        	}
        	i++;
        }
        if(edit==1 && equals==str1.length()-1)
        	return true;
		return false;
	}

	private static boolean unequalStrings(String str1, String str2) {
		String bigString="", smallString="";
		if(str1.length()>str2.length()) {
			bigString=str1;
			smallString=str2;
		}
		else if(str1.length()<str2.length()) {
			bigString=str2;
			smallString=str1;
		}
		int i=0,j=0, edit=0, equals=0;
		while(i<bigString.length() && j<smallString.length()) {
			if(bigString.charAt(i)==smallString.charAt(j)) {
				i++;
				j++;
				equals++;
			}
			else if(bigString.charAt(i)!=smallString.charAt(j)){
				i++;
				edit++;
			}
		}
		if(bigString.charAt(bigString.length()-1)!=smallString.charAt((smallString.length()-1)))
				edit++;
		if(edit==1 && equals==smallString.length())
			return true;
		return false;
	}

}
