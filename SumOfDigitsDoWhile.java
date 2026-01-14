public class SumOfDigitsDoWhile{
	public static void main(String[]args){
		int num=03072005,sum=0;
		do{
			sum+=num%10;
			num/=10;
		}while(num>0);
		System.out.println("sum of digits:"+sum);
	}
}
