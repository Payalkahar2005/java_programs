
public class SwitchEx6 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter 1st no. : ");
		 int num1=sc.nextInt();
		 
		 System.out.println("Enter 2nd no. : ");
		 int num2=sc.nextInt();
		 
		 System.out.println("Char op(+,-,*,/,%): ");
		 char op = sc.next().charAt(0);
		 
		 switch(op){
			 

		 case'+':
			 System.out.println("Result : " +(num1+num2));
			 break;
			 
		 case'-':
			 System.out.println("Result : " +(num1-num2));
			 break;
			 
		 case'*':
			 System.out.println("Result : " +(num1*num2));
			 break;
			 
		 case'/':
			 if(num2!=0) {
			 System.out.println("Result : " +(num1/num2));
			 }else {
				 System.out.println("Division is not allowed");
			 }
			 break;
			 
		 case'%':
			 if(num2!=0) {
			 System.out.println("Result : " +(num1%num2));
			 }else {
				 System.out.println("Modulo is not allowed");
			 }
			 break;
			 
		default:
			System.out.println("Invalid condition");
			 
		 }
		 sc.close();
	}
}
