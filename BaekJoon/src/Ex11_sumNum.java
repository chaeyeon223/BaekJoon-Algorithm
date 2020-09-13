import java.util.Scanner;

public class Ex11_sumNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("입력할 숫자의 개수를 입력하세요");
		int count=sc.nextInt(); //개수 입력 (int)
		System.out.println("개수만큼 숫자를 입력하세요");
		String num=sc.next(); //56789 (String)
		
		
		
		int sum=0;
		for(int i=0;i<count;i++) {
			sum+= num.charAt(i)-48; //charAt >> 아스키코드로 반환 
		}
		System.out.println(sum);
		
		
	
		
		
	}

}
