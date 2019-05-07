package com.franchiseapplication.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.bind.DatatypeConverter;

import org.springframework.stereotype.Component;

@Component
public class DateUtils {
	
	public static final TimeZone DEFAULT_TIMEZONE = TimeZone.getTimeZone("UTC");
	public static final String YYYY_MM_DD_T_HHMMSS_SSS_Z = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
	public static final String DD_MM_YYYY = "dd-MM-YYYY";

	
	public static Calendar getNow(){
		return Calendar.getInstance();
	}
	
	public static String calendarToXsDatetime(Calendar cal)
	{
		if(cal != null) {
			return DatatypeConverter.printDateTime(cal);
		}
		return null;
	}
	
	public static Calendar getDateFromNow(int offset, int timeUnit){
		Calendar currentTime = getNow();
		
		currentTime.add(timeUnit, offset);
		
		return currentTime;
	}
	
	public static String convertDateFormat(String dateString) {
		SimpleDateFormat oldFormat = new SimpleDateFormat(YYYY_MM_DD_T_HHMMSS_SSS_Z);
		SimpleDateFormat newFormat = new SimpleDateFormat(DD_MM_YYYY);
		Date oldDate;
		String newDateString = null;
		try {
			oldDate = oldFormat.parse(dateString);
			newDateString = newFormat.format(oldDate);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		return newDateString;
	}
}
