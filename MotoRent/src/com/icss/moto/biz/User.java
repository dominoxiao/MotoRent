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
	 * 用户一次租赁了多辆车
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
	 * 多辆车，同时归还，计算总租金
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
	 * 租赁某辆车
	 * @param moto
	 */
	public Moto rentMoto(Moto moto){
		
		if(moto != null){
			if(moto.isCanRent){
				System.out.println(this.name + "租赁了" + moto.getMotoType() + "--" + moto.getMotoNo());
				moto.setCanRent(false);                            //标示这辆车已经被出租了
				//moto.setBeginRentDate(new Date());
				//测试数据
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
				try {
					Date beginRentDate = sd.parse("2016-3-1");      
					moto.setBeginRentDate(beginRentDate);           //标记租车时间
					
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}else{
				System.out.println(moto.getMotoNo() + "已经被出租了，不能被再次出租");
			}
			
			
		}
		
		return moto;
		
	}
	
	
	
	
	/**
	 * 用户还车时，计算租赁价格  （计算方法：（还车时间-租赁开始时间） * 日租金 = 总租赁价格 ）
	 * @param moto
	 * @return
	 */
	public double rentBackMoto(Moto moto){
		Date rentBackDate = new Date();         //当前时间为还车日期
		//计算一下，你一共租了多少天
		Date beginRentDate = moto.getBeginRentDate();
		int days = (int)(rentBackDate.getTime()-beginRentDate.getTime())/(3600*1000*24);
		
		System.out.println("一共租赁天数为：" + days);
		double allRentMoney =  moto.getDayMoney()*days;    //租金的算法是：日租金*租赁天数
		
	   return allRentMoney;	
	}
		
	
	

}
