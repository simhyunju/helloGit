package gitTest;

import java.time.LocalDate;
import java.time.Period;

//��¥ & �ð�
public class DateTime02_LocalDate {

	public static void main(String[] args) {
		// 3.LocalDate : �ð����� �����ϰ� ��¥ ������ ǥ���ϱ����� Ŭ����
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		// => LocalDate Ŭ������ toString() �޼��忡 ����� ����

		// ������ ũ�������� ���
		// of(...) �޼��� : ������ ��¥ ������ ���� LocalDate �ν��Ͻ� ����
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmas: " + xmas);

		// �׷��ٸ� ������ ũ�������� �̺�� ?
		LocalDate eve = xmas.minusDays(1);
		// LocalDate �ν��Ͻ��� ������ �Ұ�����(immutable) �ν��Ͻ��̱� ������
		// => ���� ���� ���� �ν��Ͻ��� �ʿ���.
		System.out.println("Xmas Eve: " + eve);

		// ũ������������ ������ ��ĥ?
		// 4. Period : ��¥�� ���̸� ǥ�� �ϱ����� Ŭ����
		Period left = Period.between(today, xmas);
		System.out.println("Xmas���� ������ " + left.getMonths() + "�� " + left.getDays() + "��");
	} // main
} // class
