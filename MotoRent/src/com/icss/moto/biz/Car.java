package com.icss.moto.biz;

public class Car extends Moto{

	public Car(String motoNo,String motoType) {
		super(motoNo,motoType);
		if(motoType == MotoType.BAOMA_550)
			this.dayMoney = 500;
		else if(motoType == MotoType.BIEKE_GL8)
			this.dayMoney = 600;
		else if(motoType == MotoType.BIEKE_STREET)
			this.dayMoney = 300;
		else{
			
		}
			
	}

}
