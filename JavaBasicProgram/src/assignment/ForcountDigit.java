package assignment;

public class ForcountDigit {
	public void digit(int numb) {
		int count=0,num=numb;
		for(count=0;num>0;num=num/10) {
			count=count+1;
		}
		System.out.println("The count of "+numb+" number is "+count);
		
	}

	public static void main(String[] args) {
		int count=0,num=1254;
		for(;num!=0;num/=10,++count); {
			System.out.println("Number of digits:"+count);
		}
		ForcountDigit d=new ForcountDigit();
		d.digit(8935);
        d.digit(123);
	}

}
