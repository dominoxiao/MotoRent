package com.icss.moto.biz;

public class Truck extends Moto{
	
	private double dayDunMoney;            //每天每吨的租金	

	public double getDayDunMoney() {
		return dayDunMoney;
	}

	public void setDayDunMoney(double dayDunMoney) {
		this.dayDunMoney = dayDunMoney;
	}


	public Truck(String motoNo, String motoType,int dunWeight) {
		super(motoNo, motoType);
		this.dunWeight = dunWeight;
		this.dayDunMoney = 50;         //默认每天每吨的租金是50元
	}

	/**
	 * override
	 */
	public double getDayMoney() {
		return dayDunMoney*this.dunWeight;  //卡车的日租金=每天每吨的租金*吨位
	}
}
