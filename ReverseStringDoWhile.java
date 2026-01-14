public class ReverseStringDoWhile{
	public static void main(String[]args){
		String str="PRIYO";
		String rev="";
		int i=str.length()-1;
		do{
			rev+=str.charAt(i);
		i--;
		}while(i>=0);
		System.out.println("reversed string:"+rev);
	}
}
