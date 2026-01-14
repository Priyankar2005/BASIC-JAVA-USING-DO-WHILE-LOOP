import java.util.Scanner;
public class GuessNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int secret=7,guess;
		do{
			System.out.println("guess the number(1-10):");
			guess=sc.nextInt();
			if(guess<secret)
				System.out.println("low");
			else if(guess>secret)
				System.out.println("high");
			else
				System.out.println("correct");
		}
		while(guess!=secret);
		sc.close();
	}
}
