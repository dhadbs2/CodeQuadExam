import java.util.Scanner;

public class Cubic {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word; // �Է��� �ܾ�
		int num; // �Է��� ����
		char direction; // �Է� ���� ���� L, l, R, r
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��ϼ���: "); // �ܾ�, �̵��� ���� , �̵��� ���� �Է¹ޱ�
		word = sc.next();
		num = sc.nextInt();
		while(num < -100 || num > 100){
			num = sc.nextInt();
		}
		direction = sc.next().charAt(0);
		
		String[] array_word = word.split(""); // word�� �� �ܾ �迭�� ��ƾ���
		
		
		if (num > 0) { //���ڰ� �ܾ� ���̺��� Ŭ�� ����
			if (num > array_word.length) {
				num = num % array_word.length;
			} else {
				num = num;
			}
		} else if (num < 0) {
			num = -num;
			if (num > array_word.length) {
				num = num % array_word.length;
			} else {
				num = num;
			}
			num = -num;
		}
		if (direction == 'l' || direction == 'L') {
			if (num > 0)
				word = word.substring(num) + word.substring(0, num); // L �϶� ��������
			else if (num == 0)
				word = word;
			else {
				word = word.substring(array_word.length - Math.abs(num)) + word.substring(0, array_word.length - Math.abs(num));
			}
		}
		if (direction == 'r' || direction == 'R') {
			if (num > 0)
				word = word.substring(array_word.length - num) + word.substring(0, (array_word.length) - num); // R, r�϶� ����������
			else if (num == 0)
				word = word;
			else {
				word = word.substring(num) + word.substring(0, num);
			}
		}

		System.out.println(word);

	}

	
}
