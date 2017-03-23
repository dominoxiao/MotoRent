package com.icss.moto.biz;

public class Bus extends Moto{

	public Bus(String motoNo,String motoType,int seatNum) {
		super(motoNo,motoType);
		this.seatNum = seatNum;
		
		if(this.seatNum>16){
			this.dayMoney = 1500;			
		}else{
			this.dayMoney = 800;
			//ÕÅÈıĞŞ¸Ä----bus
			sssssssssssfffffffffffffff
				dddddddddddddddddddddddd
				//bugfix-aa addd
		}
	}

}
