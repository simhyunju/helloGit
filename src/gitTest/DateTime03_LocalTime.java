package gitTest;

import java.time.Duration;
import java.time.LocalTime;

//��¥ & �ð�
public class DateTime03_LocalTime {

	public static void main(String[] args) {
		// 5.LocalTime : �ð������� ǥ���ϱ����� Ŭ����
		// ** ���� �ð�
		LocalTime now = LocalTime.now();
		System.out.println("���� �ð�: " + now);
		// => LocalTime Ŭ������ toString() �޼��忡 ����� ����

		// ** 2�ð� 10�� �� ȭ�� ���� ����
		// => LocalTime �ν��Ͻ��� ������ �Ұ�����(immutable) �ν��Ͻ��̱� ������
		// => ���� ���� ���� �ν��Ͻ��� �ʿ���.
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(10);

		// ** ȭ�� ���� �ð� ���
		System.out.println("ȭ�� ���� �ð�: " + mt);

		// Duration Ŭ���� �̿��Ͽ� �ð� ǥ���ϱ�
		// PC�� �̿� �ð� ���, ����ϱ�
		// 1) PC���� PC �̿� ���� �ð�
		LocalTime start = LocalTime.of(14, 24, 35);
		System.out.println("PC �̿� ���� �ð�: " + start);

		// 2) PC���� PC �̿� ���� �ð�
		LocalTime end = LocalTime.of(17, 31, 19);
		System.out.println("PC �̿� ���� �ð�: " + end);

		// 3) PC �̿� �ð� ��� & ���
		Duration between = Duration.between(start, end);
		System.out.println("�� PC �̿� �ð�: " + between);

	} // main
} // class
