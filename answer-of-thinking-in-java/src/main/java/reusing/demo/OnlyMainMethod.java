package reusing.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/17 15:25
 * Program Goal:
 * 每个类文件中都可以同时包含main()函数，
 * 包括静态内部类
 *********************************************/
public class OnlyMainMethod {
    public static void main(String[] args) {
        System.out.println("Only");
    }

    static class Inner{
        public static void main(String[] args) {
            System.out.println("Inner");
        }
    }
}
