package com.icss.moto.biz;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
	private String name;	
	private List<Moto> motos;                  //租赁公司有哪些车,这是动态数组
	
	
	public RentCompany(String name){		
	   this.name = name;
	   motos = new ArrayList<Moto>();         //集合对象初始化
	}
	
	public String getName() {
		return name;
	}


	public List<Moto> getMotos() {
		return motos;
	}


	public void setMotos(List<Moto> motos) {
		this.motos = motos;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 公司新增车辆
	 * @param moto
	 */
	public void addMoto(Moto moto){
	  if(moto != null){
		  this.motos.add(moto);
		  System.out.println(this.name + "共有车辆" + this.motos.size() + "量");
	  }	
	
	}
	
	
	/**
	 * 把某个指定车辆报废
	 * @param moto
	 */
	public void removeMoto(Moto moto){
		if(moto != null){
			this.motos.remove(moto);
			System.out.println(this.name + "共有车辆" + this.motos.size() + "量");
		}
		
	}

	
	

}
