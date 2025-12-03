package exam1124;

public class Exam1 {
		public static void main(String[] args) {
			java.util.Scanner scanner = new java.util.Scanner(System.in);
			System.out.print("첫번째 정수 입력: ");
			String str1 = scanner.nextLine();
			System.out.print("두번째 정수 입력: ");
			String str2 = scanner.nextLine();
			try {
				int num1 = Integer.parseInt(str1);
				int num2 = Integer.parseInt(str2);
				int sum = num1 + num2;
				System.out.println("두 정수의 합: " + sum);
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닌 값이 입력되었습니다. 다시 시도해주세요.");
			} finally {
				scanner.close();
			}
	}
}