package models;

import java.util.Calendar;

public class date {

	public static void main(String[] args) {
		
		Calendar Actual = Calendar.getInstance();
		Actual.get(Calendar.SECOND);

		System.out.println(Actual.get(Calendar.HOUR_OF_DAY)+":"+Actual.get(Calendar.MINUTE)+":"+Actual.get(Calendar.SECOND));
		

	}

}
