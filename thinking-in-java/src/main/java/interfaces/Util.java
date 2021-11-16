package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/30 14:21
 * Program Goal:
 *********************************************/
public class Util implements Readable {
    static int count=50;
    Random random=new Random();
    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count--==0){
            return -1;
        }
        String s=String.valueOf(random.nextInt(8999)+10000+" ");
        cb.append(s);
        return 2;
    }

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Util util=new Util();
        Scanner scanner=new Scanner(util);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
