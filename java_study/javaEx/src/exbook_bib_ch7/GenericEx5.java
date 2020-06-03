import static java.lang.System.out;
class GenericEx5<T>{

	T v;
	public GenericEx5(T n){
		v = n;
	}
	public void set(T n){
		v = n;
	}
	public T get(){
		return v;
	}
	public static void main(String[] args){
		GenEx3 g3 = new GenEx3();
		GenericEx5<? extends GenEx2> g5 = new GenericEx5<GenEx3>(g3);
		GenEx2 test = g5.get();
	//	GenEx3 test = g4.get();//오류
		out.println("g5의 결과 : "+ test.msg+","+test.getMsg());
	}
}
