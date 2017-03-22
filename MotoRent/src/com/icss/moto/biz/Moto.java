package com.icss.moto.biz;

import java.util.Date;

public abstract class Moto {
	
	protected String motoType;       //车型，如宝马、别克、金杯、金龙
	protected double dayMoney;       //每种车型都有不同的日租金
	protected String motoNo;         //车牌号
	protected int seatNum;           //座位数
	protected boolean isCanRent;     //标示当前车辆，能否被出租	
	protected Date beginRentDate;    //出租日期
	protected Date rentBackDate;    //还车日期
	protected int dunWeight;        //汽车的重量	
	

	public int getDunWeight() {
		return dunWeight;
	}

	public void setDunWeight(int dunWeight) {
		this.dunWeight = dunWeight;
	}

	public Date getBeginRentDate() {
		return beginRentDate;
	}

	public void setBeginRentDate(Date beginRentDate) {
		this.beginRentDate = beginRentDate;
	}

	public Date getRentBackDate() {
		return rentBackDate;
	}

	public void setRentBackDate(Date rentBackDate) {
		this.rentBackDate = rentBackDate;
	}

	public Moto(String motoNo,String motoType){
		this.motoNo = motoNo;
		this.motoType = motoType;
		this.isCanRent = true;      //默认为可以出租
	}
	
	public boolean isCanRent() {
		return isCanRent;
	}

	public void setCanRent(boolean isCanRent) {
		this.isCanRent = isCanRent;
	}
	
	public String getMotoType() {
		return motoType;
	}
	public void setMotoType(String motoType) {
		this.motoType = motoType;
	}
	public double getDayMoney() {
		return dayMoney;
	}
	public void setDayMoney(double dayMoney) {
		this.dayMoney = dayMoney;
	}
	public String getMotoNo() {
		return motoNo;
	}
	public void setMotoNo(String motoNo) {
		this.motoNo = motoNo;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
		//by lisi ---------------------modify
	}
	
	

}
