package StringAssignment;

public class StringLongSubstringWRept {

	public static String lcp(String s,String t) {
		int n=Math.min(s.length(),t.length());
		for(int i=0;i<n;i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				return s.substring(0, i);
			}
		}
			return s.substring(0, n);
	}
	public static void main(String[] args) {
		
		String str="acbdfgh";
		//System.out.println("The longest and without repeating chars:"+lrs);

	}

}
