package exBook;

public class ArrayEx1 {
public static void main(String[] args) {
	int aa[][] = {{1,2,3,4,},{5,6,7},{8,9,}};
	
	for (int i = 0; i<aa.length; i++) {
		for (int j=0; j<aa[i].length;j++) {
			System.out.print("배열의 ["+(i+1)+"행 "+(j+1)+"열] :");
			System.out.print(aa[i][j]+"\t");
		}
	}
}
}
