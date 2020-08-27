import java.util.Scanner;
public class Ex09_Sangsoo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String A=Integer.toString(sc.nextInt());
		String B=Integer.toString(sc.nextInt());
		String reverse1="";
		String reverse2="";
		


		String[] num1=A.split("");
		String[] num2=B.split("");

		for(int i=num1.length-1;i>=0;i--) {
			reverse1+=num1[i];
		}
		for(int i=num2.length-1;i>=0;i--) {
			reverse2+=num2[i];
		}
		System.out.println((Integer.parseInt(reverse1)>Integer.parseInt(reverse2))?reverse1:reverse2);
	}
}
