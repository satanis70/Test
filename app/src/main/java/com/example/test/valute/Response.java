package com.example.test.valute;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("PreviousURL")
	private String previousURL;

	@SerializedName("Timestamp")
	private String timestamp;

	@SerializedName("Date")
	private String date;

	@SerializedName("PreviousDate")
	private String previousDate;

	@SerializedName("Valute")
	private Valute valute;

	public String getPreviousURL(){
		return previousURL;
	}

	public String getTimestamp(){
		return timestamp;
	}

	public String getDate(){
		return date;
	}

	public String getPreviousDate(){
		return previousDate;
	}

	public Valute getValute(){
		return valute;
	}
}