import java.util.Vector;
import static java.lang.System.out;
class VectorEx2{

	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>(2,5);

		//자원추가
		v.add(100.3);
		v.add(3.14);
		v.addElement(1000.);
		for(Double n : v)
			out.println(n);//추가된 요소들 출력

		//자원검색
		double search = 1000.0;//검색할 요소
		int index = v.indexOf(search);//검색
		if(index != -1)
			out.println("검색요소 "+search+"의 위치 :"+index);
		else
			out.println("검색요소 "+search+"가 없습니다.");

		out.println(":::::::삭제 전 용량/크기 확인:::::::");
		out.println("capacity : "+v.capacity ());
		out.println("size : "+v.size ());

		//자원삭제
		double del = 3.14;//삭제할 요소
		if(v.contains(del)){//삭제할 요소가 Vector의 요소인지 검사
			v.remove(del);//삭제
			out.println(del+"삭제 완료!");
		}

		out.println(":::::::삭제 후 용량/크기 확인:::::::");
		out.println("capacity : "+v.capacity ());
		out.println("size : "+v.size ());

		v.trimToSize ();//용량을 현재 요소의 수 크기로 설정
		out.println(":::::용량조절 후 용량/크기 확인:::::");
		out.println("capacity : "+v.capacity ());
		out.println("size : "+v.size ());
	}
}
