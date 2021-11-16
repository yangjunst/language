package control.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/14 10:40
 * Program Goal:
 * 检验char类型变量赋值数字后的运算
 *********************************************/
public class CharDemo {
    public static void main(String[] args) {
//        for (char c = 0; c < 128; c++) {
//            System.out.println("value: " + (int) c + " character: " + c);
//        }
        Character c=23,d=24,e=0,f='0';
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(d).equals(String.valueOf(c)));
        System.out.println(e==f);
    }
}
