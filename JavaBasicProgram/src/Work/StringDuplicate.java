package Work;

import java.util.HashMap;

public class StringDuplicate {

	public static void main(String[] args) {
		HashMap<Character,Integer> maps=new HashMap<Character,Integer>();
		int count=0;
	String str="surajeeaas";
	char ch=' ';
		
		for(int i=0;i<str.length();i++) {
			
			 ch=str.charAt(i);
			
			str=str.replaceAll(" ", "");
			if(maps.containsKey(ch)) {
				count=maps.get(ch);
				count++;
				maps.replace(ch, count);
			}
			else {
				maps.put(ch, 1);
				
			}
		}
		
 
		for(Character ch1:maps.keySet()) {
			
			System.out.println(ch1+"="+maps.get(ch1));
		}
	}

}
