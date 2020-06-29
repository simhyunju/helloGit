package gitTest;

import java.time.Duration;
import java.time.Instant;

//��¥ & �ð�
public class DateTime01_Instant {

	public static void main(String[] args) {
		// 1.Instant : �帣�� �ð� �ӿ��� Ư�� ���� ����
		// => ���� �� ���� ����
		Instant start = Instant.now();
		// now() : ����ð�����
		// epoch : (�߿��� ��ǡ���ȭ���� �Ͼ) �ô�, ����
		// ǥ�� �ڹ� epoch : 1700-01-01 00:00:00 ��¥.�ð��� ����ϴ� ���ذ�
		// => �� ���� �������� ������ �ð��� �ʴ����� ����Ͽ� ���ڰ����� ������ ����.
		System.out.println("����: " + start.getEpochSecond());
		System.out.println("Time flies like an arrow.");
		Instant end = Instant.now();
		System.out.println("��: " + end.getEpochSecond());
		// 2.Duration : �νð��� ���� , �� �ð��� ǥ��
		// => �����ġ��� ����
		Duration between = Duration.between(start, end);
		System.out.println("�и� �� ���� ��: " + between.toMillis());
		// �и��� : õ���� 1 ��
	} // main
} // class
