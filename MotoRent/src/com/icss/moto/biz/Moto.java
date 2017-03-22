package com.icss.moto.biz;

import java.util.Date;

public abstract class Moto {
	
	protected String motoType;       //���ͣ��籦����ˡ��𱭡�����
	protected double dayMoney;       //ÿ�ֳ��Ͷ��в�ͬ�������
	protected String motoNo;         //���ƺ�
	protected int seatNum;           //��λ��
	protected boolean isCanRent;     //��ʾ��ǰ�������ܷ񱻳���	
	protected Date beginRentDate;    //��������
	protected Date rentBackDate;    //��������
	protected int dunWeight;        //����������	
	

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
		this.isCanRent = true;      //Ĭ��Ϊ���Գ���
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
