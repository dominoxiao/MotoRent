package com.icss.moto.biz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class User {
	private String name;   
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public User(String name){
		this.name = name;
	}
	
	
	/**
	 * �û�һ�������˶�����
	 * @param motos
	 */
	public void rentMotos(List<Moto> motos){
		
		if(motos != null){
			for(Moto moto : motos){
				rentMoto(moto);      
				//zhangsan-------------------xxxxxxxxxxxxxxxxxxxxx
             	//lisi-----------------------------modified
				ccccccccccccccccc
			}
			
		}
		
	}
	
	/**
	 * ��������ͬʱ�黹�����������
	 * @param motos
	 * @return
	 */
	public double rentBackMoto(List<Moto> motos){
		double allMoney = 0;
		for(Moto moto : motos){
			double oneMoney = rentBackMoto(moto);
			allMoney += oneMoney;
		}
		
		return allMoney;
	}
	
	
	/**
	 * ����ĳ����
	 * @param moto
	 */
	public Moto rentMoto(Moto moto){
		
		if(moto != null){
			if(moto.isCanRent){
				System.out.println(this.name + "������" + moto.getMotoType() + "--" + moto.getMotoNo());
				moto.setCanRent(false);                            //��ʾ�������Ѿ���������
				//moto.setBeginRentDate(new Date());
				//��������
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date beginRentDate = sd.parse("2016-3-1");      
					moto.setBeginRentDate(beginRentDate);           //����⳵ʱ��
					
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}else{
				System.out.println(moto.getMotoNo() + "�Ѿ��������ˣ����ܱ��ٴγ���");
			}
			
			
		}
		
		return moto;
		
	}
	
	
	
	
	/**
	 * �û�����ʱ���������޼۸�  �����㷽����������ʱ��-���޿�ʼʱ�䣩 * ����� = �����޼۸� ��
	 * @param moto
	 * @return
	 */
	public double rentBackMoto(Moto moto){
		Date rentBackDate = new Date();         //��ǰʱ��Ϊ��������
		//����һ�£���һ�����˶�����
		Date beginRentDate = moto.getBeginRentDate();
		int days = (int)(rentBackDate.getTime()-beginRentDate.getTime())/(3600*1000*24);
		
		System.out.println("һ����������Ϊ��" + days);
		double allRentMoney =  moto.getDayMoney()*days;    //�����㷨�ǣ������*��������
		
	   return allRentMoney;	
	}
		
	
	

}
