package loginpage;

public class Logical {
	
	public static void main(String arg []) {
		
//		int febonum=20;
//		int fn=0; int sn=1;
//		for(int i=1; i<=febonum; i++) {
//			System.out.print(fn + " ");
//			int febn= fn + sn;
//			fn=sn;
//			sn=febn;
//			
//		}
		
		int subcont= 0,a,temp;
		
		int number=153;
		 
		temp=number;
		while(number>0) {
			a=number%10; 
			System.out.println(a+" a");
			number=number/10;
			System.out.println(number+" number");
			subcont= subcont+(a*a*a);
			System.out.println(subcont+" subcont");
		
		} 
		if (subcont==temp) {
			System.out.println("is armstrong");
			
		}
		else {
			System.out.println("is not armstrong");
		}
	}

}
