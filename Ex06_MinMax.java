import java.util.Scanner;

public class Ex06_MinMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����");
		int num=sc.nextInt();
		System.out.println("���� �Է����ּ���");
		int[] value=new int[num];
		for(int i=0;i<value.length;i++) {
			value[i]=sc.nextInt();
		}
		
		int min=value[0];
		int max=value[0];
		
		for(int i=0;i<value.length;i++) {
			if(value[i]>max) {
				max=value[i];
			}
			if(value[i]<min){
				min=value[i];
			}
		}
		System.out.println(min+""+ max);
	}
}
