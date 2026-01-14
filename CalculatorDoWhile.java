import java.util.Scanner;
public class CalculatorDoWhile{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int choice;
		double num1,num2,result=0;
		do{
			System.out.println("\n menu");
			System.out.println("1.Add 2.Substract 3.Multiply 4.Divide 5.Exit");
			System.out.println("choice:");
			choice=sc.nextInt();
			if(choice>=1&& choice<=4){
				System.out.println("enter a afirst number:");
				num1=sc.nextDouble();
				System.out.println("enter 2nd number:");
				num2=sc.nextDouble();
				switch(choice){
					case 1-> result =num1+num2;
					case 2-> result =num1-num2;
					case 3-> result =num1*num2;
					case 4-> result=num2!=0?num1/num2:
					Double.NaN;
				}
				System.out.println("result="+result);
			}
		}while(choice !=5);
		System.out.println("existing calculator");
		sc.close();
	}
}
