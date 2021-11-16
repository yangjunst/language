package control.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/19 20:34
 * Program Goal:
 *********************************************/
public class ContinueControlDemo {
    public static void main(String[] args) {
        OK:
        for (int i = 0; i < 3; i++) {
            System.out.println("yes"+i);
            for (int j = 0; j < 3; System.out.println("-->" + j)) {
                System.out.println("ok"+j);
                continue OK;
            }
        }
    }
}
