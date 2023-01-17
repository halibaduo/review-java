import java.nio.charset.*;
import java.io.*;
import java.io.FileReader;


public class Test46 {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 2, 3, 4 , 5, 6};
//        int[] shu = nums;  // 这相当于个函数起了一个别名
//        for(int i : shu)
//            System.out.print(i);
//        shu[0] = 9;
//        for(int i : nums)
//            System.out.print(i);
        String data = "王杰好厉害，我好喜欢！~[doge]";
        try {
            Writer output = new FileWriter("input1.txt",true);

            output.write(data);

            output.close();
        }catch(Exception e) {
            e.getStackTrace();
        }finally {
            System.out.println("over!");
        }




        char[] array = new char[100];
        try {
            Reader input = new FileReader("input1.txt");



            System.out.println("流中有数据吗？"+input.ready());


            input.read(array);  // 里面现在还没有数据
            System.out.println("流中的数据为:"+array);

            input.close();
        }catch(Exception e) {
            e.getStackTrace();
        }finally {
            System.out.println("over!");
        }

//        FileWriter也是一样的
//        try {
//            // 创建指定的编码方式
//            FileReader input1 = new FileReader("input1.txt", Charset.forName("UTF8"));
//
//            System.out.println("output1编码方式:"+input1.getEncoding());
//
//            input1.close();
//        }catch(Exception e) {
//            e.getStackTrace();
//        }finally {
//            System.out.println("over!");
//        }

        // 似乎是缺少 某种构造器 运行了就很容易看出来
//        try {
//            FileWriter output = new FileWriter("input2",true,Charset.forName("UFT8"));
//
//            System.out.println("编码方式是:"+output.Encoding());
//
//            output.close();
//        }catch(Exception e) {
//            e.getStackTrace();
//        }finally {
//            System.out.println("over!");
//        }
    }
}
