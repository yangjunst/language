package operators.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/9 20:47
 * Program Goal:
 *   int c=a*-b;
 *   a*-b中的-b可以作为一个整体去与a进行操作
 *********************************************/
public class OneOperatorDemo {
    public static void main(String[] args) {
        byte a=-1;
        short b=3;
        int c=a*-b;
        System.out.println(c);
    }
}
