import java.util.Scanner;

public class Cubic {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word; // 입력한 단어
		int num; // 입력한 숫자
		char direction; // 입력 받은 방향 L, l, R, r
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요: "); // 단어, 이동할 숫자 , 이동할 방향 입력받기
		word = sc.next();
		num = sc.nextInt();
		while(num < -100 || num > 100){
			num = sc.nextInt();
		}
		direction = sc.next().charAt(0);
		
		String[] array_word = word.split(""); // word를 한 단어씩 배열에 담아야함
		
		
		if (num > 0) { //숫자가 단어 길이보다 클때 정제
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
				word = word.substring(num) + word.substring(0, num); // L 일때 왼쪽으로
			else if (num == 0)
				word = word;
			else {
				word = word.substring(array_word.length - Math.abs(num)) + word.substring(0, array_word.length - Math.abs(num));
			}
		}
		if (direction == 'r' || direction == 'R') {
			if (num > 0)
				word = word.substring(array_word.length - num) + word.substring(0, (array_word.length) - num); // R, r일때 오른쪽으로
			else if (num == 0)
				word = word;
			else {
				word = word.substring(num) + word.substring(0, num);
			}
		}

		System.out.println(word);

	}

	
}
