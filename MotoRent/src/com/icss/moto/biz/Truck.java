package com.icss.moto.biz;

public class Truck extends Moto{
	
	private double dayDunMoney;            //ÿ��ÿ�ֵ����	

	public double getDayDunMoney() {
		return dayDunMoney;
	}

	public void setDayDunMoney(double dayDunMoney) {
		this.dayDunMoney = dayDunMoney;
	}


	public Truck(String motoNo, String motoType,int dunWeight) {
		super(motoNo, motoType);
		this.dunWeight = dunWeight;
		this.dayDunMoney = 50;         //Ĭ��ÿ��ÿ�ֵ������50Ԫ
	}

	/**
	 * override
	 */
	public double getDayMoney() {
		return dayDunMoney*this.dunWeight;  //�����������=ÿ��ÿ�ֵ����*��λ
	}
}
