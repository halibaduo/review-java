import java.util.Scanner;
public class Test23{
	public static void main(String[] args){
		int p,q;
		System.out.println("������p,q��ֵ:");
		Scanner reader = new Scanner(System.in);
		p = reader.nextInt();
		q = reader.nextInt();
		int[][] m = new int[p][q];
		for(int i=0; i<p; i++){
			for(int j=0; j<q; j++){
				System.out.println("��"+(i+1)+"��"+"��"+(j+1)+"�е���ֵΪ"+m[i][j]);
			}
		}
		Text1 s = new Text1();
		s.show();
	}
}
class Text1{
	void show(){
		System.out.println("���");
	}
	void happy(){
		//Text1 qq = new Text1();
		//Text1::show();	
	}
}