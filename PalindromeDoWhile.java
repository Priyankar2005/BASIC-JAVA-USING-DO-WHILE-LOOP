public class PalindromeDoWhile{
	public static void main(String[]args){
		int num = 1221,temp=num,rev=0;
		do{
			rev=rev*10+num%10;
			num/=10;
		}while(num>0);
		if(rev==temp)
			System.out.println("palindrome number");
		else
		System.out.println("not palindrome number");
	}
}
