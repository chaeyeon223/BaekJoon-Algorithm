
public class Lotto01 {

	public static void main(String[] args) {
		/*
		 *1. 1~45������ ������ �߻����� 6���� �迭�� ��������
		      (int)(Math.random()*45 + 1)
		      lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
		 *2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (�ߺ��� ���� :����� ���)
		 *3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����  (���� : �ڸ��ٲ�)
		 *4. �� ����� ��� �ִ� �迭�� ����ϼ��� (ȭ�� ���)
		 ���Ŀ��� ������ Ŭ���� �и��ؼ� Lotto.java ..... 
		 ���� main �Լ� �ȿ��� ��� ....����..
		���� 1�� �Դϴ�
		 */
		
		int [] lotto =new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45 + 1);
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					//������ for�� �ٽ� ���Ƽ� ������ �ٽ� �̾ƾ���
					i--;
					//System.out.println("�ߺ�Ȯ��");
					break;
				}
			}
			System.out.printf("lotto[%d]: %d\n",i,lotto[i]);
		}
		
	}

}
