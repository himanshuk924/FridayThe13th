package com.cg.friday13;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Friday13 {

	public static void main(String[] args) throws ParseException {
		LocalDate start = LocalDate.of(1900,1,1);
		LocalDate end = LocalDate.of(2000,12,31);

		SimpleDateFormat dateformat1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-MMMMM-yyyy");

		System.out.println("The list of Friday the 13th in the 20th Century are :- ");
		//Date loop
		for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
			//printing dates on Fridays 13
			if (date.getDayOfMonth() == 13 && (date.getDayOfWeek().toString().equalsIgnoreCase("Friday")))
				System.out.println(dateformat2.format(dateformat1.parse(date.toString())));
																			
		}
	}

}
