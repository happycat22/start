package day06_Ex;

/*
���� 14 ]
	���� ������ �����ϴ� ���ڸ� ã�� ���α׷��� �ۼ��ϼ���.
	
	1. 4�ڸ� ���� abcd�� 0�� ������� �ʰ�, ��� �ٸ� �����̴�.
	2. ù��° ����(a)�� ������ ����(d)���� 2 ŭ
	a : 3 <= 9
	    9 >=
	    
	d : 1 <= 
	    7 >=
	3. �ι�° ����(b)�� ����° ����(c)���� ũ��.
	b>c ==> c+1���� ����
	4. 4�ڸ� ���ڸ� �������� �ϰ� �� ���� 4�ڸ����� ���ϸ� 16456�� �ȴ�.
	
	 a	b	c	d
	 d	c	b	a
	 ===> 16456
	
*/

public class Ex14 {

	public static void main(String[] args) {
		int a, b, c, d;
		int result = 0;
		for(a = 3; a<=9;a++) {
			d = a -2;
			for(b=2; b<10;b++) {
				if(b==a || b==d) {
					continue;
					// �� ���� ���� ���ڰ� �߻��ϴ� ���Ƿ� ���ǿ� ���� �����Ƿ� ���� ��ȣ�� �����ؼ�
					// �ٸ� ������ ���ؾ��Ѵ�. 
					
				}
				
				// �̶����� �����ϴ� ����
				// b�� a,d�� ���� ����.
			}
		}

	}

}