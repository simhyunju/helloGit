package gitTest;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//��¥ & �ð�
public class DateTime06_ZonedDateTime {

	public static void main(String[] args) {
		// 7.ZoneId : Ư�� �ð��� ������ ����ִ� Ŭ����
		ZoneId seoul = ZoneId.of("Asia/Seoul");
		System.out.println(seoul);
		// => �ð��뺰 ���ڿ� Ȯ���ϱ�
		// ZoneId.getAvailableZoneIds().stream()
		// .filter(s -> s.startsWith("Asia")) // �ʹ� �����Ƿ� filter ���
		// .sorted().forEach(s -> System.out.println(s));

		// 8. ZonedDateTime : �ν��Ͻ����� �ð��� ������ ���� ����
		// �̰��� ���� ��¥�� �ð�
		ZonedDateTime here = ZonedDateTime.now();
		System.out.println(here);
		// ������ ��¥�� �ð��� �ĸ�
		ZonedDateTime paris = ZonedDateTime.of(here.toLocalDateTime(), ZoneId.of("Europe/Paris"));
		// => here.toLocalDateTime() : here ���� ��¥�� �ð� ������ ����
		// => ZoneId.of("Europe/Paris") : ������ �ð���� �����Ͽ� paris �ν��Ͻ� ������.
		System.out.println(paris);
		// �̰��� �ĸ��� ����
		Duration diff = Duration.between(here, paris);
		System.out.println(diff);

	} // main
} // class
