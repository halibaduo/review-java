import java.util.Scanner;
public class Test23{
	public static void main(String[] args){
		int p,q;
		System.out.println("请输入p,q的值:");
		Scanner reader = new Scanner(System.in);
		p = reader.nextInt();
		q = reader.nextInt();
		int[][] m = new int[p][q];
		for(int i=0; i<p; i++){
			for(int j=0; j<q; j++){
				System.out.println("第"+(i+1)+"行"+"第"+(j+1)+"列的数值为"+m[i][j]);
			}
		}
		Text1 s = new Text1();
		s.show();
	}
}
class Text1{
	void show(){
		System.out.println("输出");
	}
	void happy(){
		//Text1 qq = new Text1();
		//Text1::show();	
	}
}