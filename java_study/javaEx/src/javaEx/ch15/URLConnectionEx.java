package javaEx.ch15;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class URLConnectionEx {
	public static void main(String[] args) throws MalformedURLException, IOException {
		//url 생성
		URL url = new URL("https://docs.oracle.com/javase/8/docs/api/");
		// URLConnection 객체 받기
		URLConnection urlCon = url.openConnection();
		//실제 연결 완료
		urlCon.connect();
		Map<String,List<String>> map = urlCon.getHeaderFields();
		//java collection 이란? (모든 컬렉션에서는 제네릭 사용)
		/* 
		  Map, List = Interface
		  Map을 구현하고 있는 구현체로 많이 쓰는 것 = HashMap
		  List를 구현하고 있는 구현체로 많이 쓰는 것 = ArrayList
		  Map은 형태가 Key와 value형태로 이루어져있고 key에 해당하는 value를 가져오는 형태의 자료구조. 
		  List는 순차적으로 해당되는 인덱스에 위치한 객체를 갖고 오는 자료구조.
		  key = List<String> 형태로 가져옴
		 */ 
		// 맵에 저장되어있는 모든 키값을  가져와라
		Set<String> s = map.keySet();
		// Set Interface로 그 구현체는 순서 없음
		// 순서를 부여하고 값을 받아오는 처리에 유용. = Iterator
		Iterator<String> iter = s.iterator();
		//순서대로 읽는 방법
		while(iter.hasNext()) {
			// 키 이름
			String name = iter.next();
			System.out.print(name+" : ");
			List<String> value = map.get(name);
			//출력을 하기 위해서  List 길이만큼 출력
			for(String v : value) {
				System.out.println(v+"\t");
			}
			System.out.println();
		}
		
		int len = urlCon.getContentLength();
		System.out.println("문서 길이 : "+len+"바이트");
		if(len>0) {
			InputStream input = urlCon.getInputStream();
			int readByte;
			System.out.println("=========문서내용=========");
			while((readByte=input.read())!=-1 && (--len>0)) {
				System.out.print((char)readByte);
			} // while close
			input.close();
		} // if close
		else {
			System.out.println("내용 없음");
		}
	}
}
