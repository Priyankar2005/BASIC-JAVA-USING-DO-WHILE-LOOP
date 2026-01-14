public class ArmstrongDoWhile{
	public static void main(String[]args){
		int num =153,temp=num,sum=0;
		do{
			int digit=num%10;
			sum+=digit*digit*digit;
			num/=10;
		}while(num>0);
		if(sum==temp)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");
	}
}
