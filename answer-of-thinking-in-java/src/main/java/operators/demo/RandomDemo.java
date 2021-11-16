package operators.demo;

import java.util.Random;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/9 20:01
 *  Program Goal:
 *  Random的魔幻数字47
 *  nextInt()有参数，则，有了上限参数，下线零
 *  对于其他nextInt/Float/Double/Long则无参数
 *********************************************/
public class RandomDemo {
    public static void main(String[] args) {
        Random random=new Random();
        Long l = random.nextLong();
        System.out.println(l.toString());
        Double v = random.nextDouble();
        System.out.println(v.toString());
        Float f=random.nextFloat();
        System.out.println(f.toString());
        int i = random.nextInt(3);
        System.out.println(i);
        Integer a=random.nextInt();
        System.out.println(a);
        double x=1.4,y=2.3;
        double z=x%y;
        System.out.println("x%y--->"+z);
        System.out.println("y%x--->"+(y%x));
    }
}
