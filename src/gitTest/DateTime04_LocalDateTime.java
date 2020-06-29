package gitTest;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

//��¥ & �ð�
public class DateTime04_LocalDateTime {

	public static void main(String[] args) {
		// 6.LocalDateTime : ��¥�� �ð������� ��� ǥ���ϱ����� Ŭ����
		// ** ���� ��¥�� �ð�
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		// ** �ð� ����
		// ���� ���̾�� 22�ð� 35�� �� ȭ�� ���� ����
		LocalDateTime mt = dt.plusHours(22);
		mt = mt.plusMinutes(35);
		// ȭ�� ���� ��¥�� �ð� ���
		System.out.println(mt);

		// ** ���ϴ� �ð��� �ν��Ͻ� �����
		// of �޼��� => �Ű������� ������ (��,��,��,��,��) (��,��,��,��,��,��) �� �پ��ϰ� �����ε��Ǿ� ����
		// 1) ����ð�
		LocalDateTime today = LocalDateTime.of(2020, 4, 25, 11, 20);
		// 2) �װ���1�� ��� �ð�
		LocalDateTime flight1 = LocalDateTime.of(2020, 5, 14, 11, 15);
		// 3) �װ���2�� ��� �ð�
		LocalDateTime flight2 = LocalDateTime.of(2020, 5, 13, 15, 30);

		// 4) ���� �װ��� �����ϱ�
		LocalDateTime myFlight;
		// 1 isBefore 2 �� ���̸� true -> ��, 1�� 2 ���� �����̸� true
		if (flight1.isBefore(flight2))
			myFlight = flight1;
		else
			myFlight = flight2;

		// ���� �װ����� ���� ž�±��� ���� ��¥ ���
		Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate());
		// ���� �װ����� ���� ž�±��� ���� �ð� ���
		Duration time = Duration.between(today.toLocalTime(), myFlight.toLocalTime());

		// ���� ž�±��� ���� ��¥�� �ð� ���
		System.out.println(day);
		System.out.println(time);

	} // main
} // class
