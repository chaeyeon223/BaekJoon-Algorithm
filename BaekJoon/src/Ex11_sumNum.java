import java.util.Scanner;

public class Ex11_sumNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է��� ������ ������ �Է��ϼ���");
		int count=sc.nextInt(); //���� �Է� (int)
		System.out.println("������ŭ ���ڸ� �Է��ϼ���");
		String num=sc.next(); //56789 (String)
		
		
		
		int sum=0;
		for(int i=0;i<count;i++) {
			sum+= num.charAt(i)-48; //charAt >> �ƽ�Ű�ڵ�� ��ȯ 
		}
		System.out.println(sum);
		
		
	
		
		
	}

}
