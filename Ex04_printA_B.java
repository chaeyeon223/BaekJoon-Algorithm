import java.util.Scanner;

public class Ex04_printA_B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int casenum=sc.nextInt(); //case ��ȣ
		int sum=0;
		for(int i=1;i<=casenum;i++) {
			int num1=sc.nextInt(); //�Է°� 1
			int num2=sc.nextInt(); //�Է°� 2
			sum=num1+num2;  //A+B
			System.out.printf("Case #%d: %d + %d = %d",i,num1,num2,sum);
			System.out.println();
		}
		
		
		
	}

}
