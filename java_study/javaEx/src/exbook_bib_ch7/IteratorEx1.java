import java.util.Vector; 
import static java.lang.System.out; 
public class IteratorEx1{ 
 
	public static void main(String[] args) { 
		Vector<String> v = new Vector<String>(2,5); 
 
		v.add("����ö"); 
		v.add("�����"); 
		v.add("�⼺��"); 
		out.println("����ũ��:"+v.size()); 

		Iterator<String> it = v.iterator(); // Iterator ��� 
		while(it.hasNext()){ 
			out.println(it.next()); 
			it.remove(); // ���� �÷��ǿ��� ��� ���� 
		} 
		// it.remove(); 

		out.println("����ũ��:"+v.size()); 
	} 
}
