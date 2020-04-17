package javaEx;

import java.util.ArrayList;
import java.util.List;

import kr.co.soldesk.car.Car;
import kr.co.soldesk.car.DumpTruck;
import kr.co.soldesk.car.Sedan;

public class GenericsEx1 {

	public static void main(String[] args) {
	// 객체를 여러개 담아서 사용가능한 타입(List(interface))
	// List를 구현한 클래스 ArrayList	
		List<Object> a1 = new ArrayList<Object>();
		a1.add("사과"); // 이런 식으로 String 삽입 가능
		a1.add(200); // 이런 식으로 int 삽입 가능
		a1.add("포도");
		a1.add("300");;
		
		for(int i=0; i<a1.size();i++) {
			// System.out.println(a1.get(i));
			if(a1.get(i) instanceof String) {				
				String str = (String)a1.get(i);
				System.out.println(str);
			} else {
				int num = (Integer)a1.get(i);
				System.out.println(num);
			}
		}
		// 제네릭은 타입을 지정하는 것.
		List<String> a2 = new ArrayList<String>();
			a2.add("사과");
			a2.add("200"); // integer type을 넣으면 실행이 안된다.
			a2.add("딸기");
			a2.add("300");
			
		List<Car> a3 = new ArrayList<Car>();
		a3.add(new Sedan(4,4,"화이트"));
		a3.add(new DumpTruck(6,4,"블랙"));
		a3.add(new Sedan(4,4,"화이트"));
		a3.add(new DumpTruck(6,4,"블랙"));
		// 실행 for DumpTruck아니면 시동걸고 전진,
		// 			DumpTruck이면 시동걸고 DumpUp
		
		for(int j=0; j<a3.size();j++) {
			if(a3.get(j) instanceof Sedan) {
			Sedan s1 = (Sedan) a3.get(j);
			s1.start();
			s1.drive();
			} else {
			DumpTruck d1 = (DumpTruck) a3.get(j);
			d1.start();
			d1.dumpUp();
			}
			
		}
			
		}
	}

