package StringAssignment;

import java.util.Formatter;
import java.text.DecimalFormat;

public class StringTotalUpLwDg {
	public static void charPer(String input) {
		int total=input.length();
		int upperLet=0;
		int lowerLet=0;
		int digit=0;
		int other=0;
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperLet++;
			}
			else if(Character.isLowerCase(ch)){
				lowerLet++;
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				other++;
			}
		}
		double upPer=(upperLet*100.0)/total;
		double lowerPer=(lowerLet*100.0)/total;
		double digitPer=(digit*100.0)/total;
		double otherPer=(other*100.0)/total;
		
		DecimalFormat format=new DecimalFormat("##.##");
		System.out.println("In "+input+" :");
		System.out.println("UpperCase Letter Percentage: "+format.format(upPer)+"%");
		System.out.println("LowerCase Letter Percentage: "+format.format(lowerPer)+"%");
		System.out.println("Digit Percentage: "+format.format(digitPer)+"%");
		System.out.println("Other  Percentage: "+format.format(otherPer)+"%");
		System.out.println();
	}

	public static void main(String[] args) {

		StringTotalUpLwDg.charPer("India Is My Country 100%");
		StringTotalUpLwDg.charPer("abhi.abc @123.com");
	}

}
