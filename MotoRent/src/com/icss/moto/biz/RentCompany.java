package com.icss.moto.biz;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
	private String name;	
	private List<Moto> motos;                  //���޹�˾����Щ��,���Ƕ�̬����
	
	
	public RentCompany(String name){		
	   this.name = name;
	   motos = new ArrayList<Moto>();         //���϶����ʼ��
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
	 * ��˾��������
	 * @param moto
	 */
	public void addMoto(Moto moto){
	  if(moto != null){
		  this.motos.add(moto);
		  System.out.println(this.name + "���г���" + this.motos.size() + "��");
	  }	
	
	}
	
	
	/**
	 * ��ĳ��ָ����������
	 * @param moto
	 */
	public void removeMoto(Moto moto){
		if(moto != null){
			this.motos.remove(moto);
			System.out.println(this.name + "���г���" + this.motos.size() + "��");
		}
		
	}

	
	

}
