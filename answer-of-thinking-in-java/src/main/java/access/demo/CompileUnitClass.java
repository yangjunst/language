package access.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/16 9:01
 * Program Goal:
 * CompileUnitClass.java即为此文件的编译单元
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
