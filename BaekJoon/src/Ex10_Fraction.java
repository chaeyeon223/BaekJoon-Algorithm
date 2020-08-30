import java.util.Scanner;

public class Ex10_Fraction {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("숫자를 입력하세요");
		int num=sc.nextInt(); //몇번째 숫자인지 입력받기
		int line=1; //대각선
		int sum=0;

		//입력받은 수가  14라면 ?? 1+2+3+4+5 5번째 줄에 있는 4번째 친구
		//line-(15-14)
		//8이라면 ? 1+2+3+4
		//line-(10-8)
		
		//총 입력한 값까지의 sum
		//line까지의 1+2+3+4
		
		while(true) {
			sum+=line;
			if(num<=sum) {
				int a=line-(sum-num); //line중 몇번째
				int b=line+1-a;
				if(line%2==0) {
					System.out.println(a+"/"+b);
				}else {
					System.out.println(b+"/"+a);
				}
				break;
			}
			line++;
		}
		

		
	}
}
