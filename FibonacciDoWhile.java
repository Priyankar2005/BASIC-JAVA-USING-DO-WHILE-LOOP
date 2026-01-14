public class FibonacciDoWhile{
	public static void main(String[]args){
		int n =10,a=0,b=1,i=1;
		System.out.println("fibonacci series:");
		do{
			System.out.println(a+"");
			int next=a+b;
			a=b;
			b=next;
			i++;
		}while(i<=n);
	}
}
