package com.example.test.valute;

import com.google.gson.annotations.SerializedName;

public class BGN{

	@SerializedName("CharCode")
	private String charCode;

	@SerializedName("Value")
	private double value;

	@SerializedName("Previous")
	private double previous;

	@SerializedName("ID")
	private String iD;

	@SerializedName("Nominal")
	private int nominal;

	@SerializedName("NumCode")
	private String numCode;

	@SerializedName("Name")
	private String name;

	public String getCharCode(){
		return charCode;
	}

	public double getValue(){
		return value;
	}

	public double getPrevious(){
		return previous;
	}

	public String getID(){
		return iD;
	}

	public int getNominal(){
		return nominal;
	}

	public String getNumCode(){
		return numCode;
	}

	public String getName(){
		return name;
	}
}