
//Ĭ��ֵ ����:null ������������:0 boolean:false 
//��final����ı�����Ϊ������������ĺ���Ϊ����������ܱ�����(extends)�����������Ϊ�����࣬���ܱ�����
import sun.security.timestamp.TSResponse;

import java.util.*;

//�������λΪ����λ��Ϊ1�Ǵ�������Ϊ0�Ǵ�������
public class Test1 {
	public static void main(String[] args) {
		int a = 0; // ���� 4���ֽ�
		byte b = 0; // �ֽ��� 1���ֽ�
		short c = 0; // ������ 2���ֽ�
		long d = 0L; // ������ 8���ֽ�
		float e = 0.0f; // �����ȸ��������� 4���ֽ� float��Ҫд��f,��double�Ͳ��ü�
		double f = 0.0; // ˫���ȸ��������� 8���ֽ�
		boolean g = true; // ������������ 1���ֽ�
		char h = 'a'; // �ַ����� 2���ֽ�(��һ����c���ã�c��ֻռ��һ���ֽڣ�����ͬ���Ƕ���'')

		String i = "���ѽ!"; // �ַ�������
		// String�ͱ���iʵ���Ͼ���һ���������͵ı���,����i�д洢����"���ѽ"������,������"���ѽ"�ַ�������
		Scanner reader = new Scanner(System.in);
		System.out.println("�ȼ��㷢һ���ҵ�ʱ�����飬�ã����ڿ�ʼ������");
		System.out.println("EDGţ��!");

		System.out.print("������һ��a��ֵ�����ͣ�:"); // reader.nextInt();��������������
		a = reader.nextInt();
		System.out.println("�������ղ������a�ǣ�" + a);

		System.out.println("�б�Ҫ˵һ��byte�����������Ϊ127,���λ�Ƿ���λ��2^6+2^5+2^4+2^3+2^2+2^1+2^0=127");
		System.out.print("ͬ����������������һ��b��ֵ���ֽ��ͣ�:");
		b = reader.nextByte();
		System.out.println("���ԣ����ղ������b�ǣ�" + b);

		System.out.print("��ͬ������������һ��c��ֵ�������ͣ�:");
		c = reader.nextShort();
		System.out.println("���ԣ����ղ������c�ǣ�" + c);

		System.out.print("�ٺ٣���������һ��d��ֵ�������ͣ�:");
		d = reader.nextLong();
		System.out.println("���ԣ����ղ������d�ǣ�" + d);

		System.out.print("�ţ�����������һ��e��ֵ�������ȸ�������:");
		e = reader.nextFloat();
		System.out.println("����ֵe�ǣ�" + e);

		System.out.print("������������һ��f��ֵ��˫���ȸ�������:");
		f = reader.nextDouble();
		System.out.println("˫���ȸ�����f��ֵ�ǣ�" + f);

		System.out.print("������һ��g��ֵ����������,��true or false��:");
		g = reader.nextBoolean();
		System.out.println("����ֵg=" + g);

		System.out.println("ԭ���ǻ�ȡ�����һ���ֽ�!���Լ�ʹ�������ַ���Ҳֻ�ǻ�ȡ��һ����ĸ!");
		System.out.print("������һ��h��ֵ���ַ���:");
		h = reader.next().charAt(0);// ��ȡ�±�Ϊ0���ַ� �±��0��ʼ��֪����,��Ȼ�����������д��1����ô���ǵڶ����ֽ�
		System.out.println("h=" + h);

		System.out.print("������һ��i��ֵ���ַ�����:");
		i = reader.next();
		System.out.println("���ַ���ΪiΪ��" + i);

		Test1 ab = new Test1();
		boolean ok = ab instanceof Test1;
		if(ok)
			System.out.println("˵������a����Test1��");
	}
}