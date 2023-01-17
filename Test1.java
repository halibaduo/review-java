
//默认值 对象:null 基本数据类型:0 boolean:false 
//被final定义的变量即为常量，被定义的函数为最后函数，不能被覆盖(extends)，被定义的类为最终类，不能被派生
import sun.security.timestamp.TSResponse;

import java.util.*;

//数的最高位为符号位，为1是代表负数，为0是代表正数
public class Test1 {
	public static void main(String[] args) {
		int a = 0; // 整型 4个字节
		byte b = 0; // 字节型 1个字节
		short c = 0; // 短整型 2个字节
		long d = 0L; // 长整型 8个字节
		float e = 0.0f; // 单精度浮点数类型 4个字节 float型要写上f,而double型不用加
		double f = 0.0; // 双精度浮点数类型 8个字节
		boolean g = true; // 布尔类型数据 1个字节
		char h = 'a'; // 字符类型 2个字节(这一点与c不用，c中只占用一个字节，但相同的是都用'')

		String i = "你好呀!"; // 字符串类型
		// String型变量i实际上就是一个引用类型的变量,变量i中存储的是"你好呀"的引用,而不是"你好呀"字符串本身
		Scanner reader = new Scanner(System.in);
		System.out.println("先简单抒发一下我当时的热情，好，现在开始！！！");
		System.out.println("EDG牛逼!");

		System.out.print("请输入一个a的值（整型）:"); // reader.nextInt();是输入整型数据
		a = reader.nextInt();
		System.out.println("所以您刚才输入的a是：" + a);

		System.out.println("有必要说一下byte数据类型最大为127,最高位是符号位，2^6+2^5+2^4+2^3+2^2+2^1+2^0=127");
		System.out.print("同样，现在请再输入一个b的值（字节型）:");
		b = reader.nextByte();
		System.out.println("所以，您刚才输入的b是：" + b);

		System.out.print("再同样，请再输入一个c的值（短整型）:");
		c = reader.nextShort();
		System.out.println("所以，您刚才输入的c是：" + c);

		System.out.print("嘿嘿，请再输入一个d的值（长整型）:");
		d = reader.nextLong();
		System.out.println("所以，您刚才输入的d是：" + d);

		System.out.print("嗯，请再再输入一个e的值（单精度浮点数）:");
		e = reader.nextFloat();
		System.out.println("它的值e是：" + e);

		System.out.print("请再再再输入一个f的值（双精度浮点数）:");
		f = reader.nextDouble();
		System.out.println("双精度浮点数f的值是：" + f);

		System.out.print("请输入一个g的值（布尔类型,即true or false）:");
		g = reader.nextBoolean();
		System.out.println("布尔值g=" + g);

		System.out.println("原理是获取最初的一个字节!所以即使是输入字符串也只是获取第一个字母!");
		System.out.print("请输入一个h的值（字符）:");
		h = reader.next().charAt(0);// 读取下标为0的字符 下标从0开始是知道的,当然，如果你其中写上1，那么就是第二个字节
		System.out.println("h=" + h);

		System.out.print("请输入一个i的值（字符串）:");
		i = reader.next();
		System.out.println("该字符串为i为：" + i);

		Test1 ab = new Test1();
		boolean ok = ab instanceof Test1;
		if(ok)
			System.out.println("说明对象a是类Test1的");
	}
}