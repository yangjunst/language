package access.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/16 9:01
 * Program Goal:
 * CompileUnitClass.java��Ϊ���ļ��ı��뵥Ԫ
 *********************************************/
class OuterClass{
    public static void main(String[] args) {
        System.out.println("OuterClass main....");
    }
}
class Outer{}

class Example {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(new Outer());
        System.out.println(new OuterClass());
    }
}
