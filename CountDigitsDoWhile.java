public class CountDigitsDoWhile{
	public static void main(String[]args){
		int num = 123456789;
		int count =0;
		do{
			count++;
			num/=10;
		}while(num>0);
		System.out.println("total digits:"+count);
	}
}
