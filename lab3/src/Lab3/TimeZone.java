package Lab3;

import java.time.ZonedDateTime;
import java.util.Scanner;
import java.time.ZoneId;

public class TimeZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter zone");
		String st=sc.next();
		ZonedDateTime time=ZonedDateTime.now(ZoneId.of(st));
		System.out.println(time);

	}

}
