package com.icss.moto.ui;

import java.util.ArrayList;
import java.util.List;

import com.icss.moto.biz.Bus;
import com.icss.moto.biz.Car;
import com.icss.moto.biz.Moto;
import com.icss.moto.biz.MotoType;
import com.icss.moto.biz.RentCompany;
import com.icss.moto.biz.Truck;
import com.icss.moto.biz.User;

public class Test {
	
	public RentCompany comp;
	
	public void initRentCompany(){
		
		comp = new RentCompany("神州租车");
		Moto m1 = new Car("京A-0001",MotoType.BAOMA_550);
	
		Moto m2 = new Car("京A-0002",MotoType.BIEKE_GL8);
		Moto m3 = new Car("京A-0003",MotoType.BIEKE_STREET);
		Moto m4 = new Car("京A-0004",MotoType.BIEKE_GL8);
		Moto m5 = new Car("京a-0005",MotoType.BAOMA_550);		
		Moto b1 = new Bus("京b-0001",MotoType.GOLD_CUP,18);
		Moto b2 = new Bus("京b-0002",MotoType.GOLD_LONG,12);
		Truck t1 = new Truck("京C-001",MotoType.HUANG_HE,30);
		t1.setDayDunMoney(80);
		
		comp.addMoto(m1);
		comp.addMoto(m2);
		comp.addMoto(m3);
		comp.addMoto(m4);
		comp.addMoto(m5);
		comp.addMoto(b1);
		comp.addMoto(b2);				
		comp.addMoto(t1);
	}
	
	
	public void test(){
		Test test = new Test();
		test.initRentCompany();
		RentCompany comp = test.comp;          //取出公司的数据
		
		Moto m1 = comp.getMotos().get(4);          
		User user = new User("张三");
		user.rentMoto(m1);                     //张三租车car
		//过几天之后,张三来还车
		double rentMoney = user.rentBackMoto(m1);
		System.out.println("总租金是" + rentMoney);
		
		user = new User("李四");
		Moto m2 = comp.getMotos().get(5);
		user.rentMoto(m2);
		//过几天之后,李四来还车
		rentMoney = user.rentBackMoto(m2);
		System.out.println("总租金是" + rentMoney);
		
		comp.removeMoto(comp.getMotos().get(0));
		
		System.out.println("----------------------出租重卡---------");
		Moto m3 = comp.getMotos().get(6);
		user.rentMoto(m3);
		//过几天之后,李四来还车
		rentMoney = user.rentBackMoto(m3);
		System.out.println(m3.getMotoNo() + "总租金是：" + rentMoney);	
		
	}
	
	public static void testListMoto(){
		Test test = new Test();
		test.initRentCompany();
		RentCompany comp = test.comp;          //取出公司的数据
		
		List<Moto> motos = new ArrayList<Moto>();
		motos.add(comp.getMotos().get(0));
		motos.add(comp.getMotos().get(2));
		motos.add(comp.getMotos().get(5));
		
		User user = new User("李四");
		user.rentMotos(motos);
		//过几天归还
		double allMoney = user.rentBackMoto(motos);
		System.out.println(user.getName() + "一共租了" + motos.size());
		System.out.println("总租金是："  + allMoney);
		
		
		
	}
   
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Test.testListMoto();
		//aa add
		
	}

}

