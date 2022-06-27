package com.pramod.leetcode.easy;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class DateTimeUtils {
	public static void main(String[] args) {
		Date date = new Date(Calendar.getInstance().getTimeInMillis());

		LocalDate localDate = date.toLocalDate();
		System.out.println("localdate:" + localDate);

		Instant instant = (Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.of("Asia/Kolkata"))).toInstant();
		System.out.println("instant" + instant);

		LocalDate ofLocalDate = LocalDate.ofInstant(instant, ZoneId.of("Asia/Kolkata"));
		System.out.println("changedlocaldate:" + ofLocalDate);
		ZonedDateTime zdt = ofLocalDate.atStartOfDay(ZoneId.of("Asia/Kolkata"));

		Instant from = zdt.toInstant();
		
		System.out.println("from"+from);


	}

}
