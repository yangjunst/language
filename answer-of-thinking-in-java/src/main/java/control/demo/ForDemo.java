package control.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/14 10:23
 * Program Goal:
 * 检验for循环的步长语句，在满足怎样的条件方能执行：
 * 只有一次循环正常结束后，才会执行步进语句。
 * 【循环体内没有break等中断语句,当有continue时可以进行执行】
 *********************************************/
public class ForDemo {
    public static void forDemo() {
        int a = 5;
        int b = 2;
        for (; a > b; b++, System.out.print(b + ",")) {
            continue;
        }
    }

    public static void Two() {
        int i = 0, j = 0;
        ok:
        for (i = 0; i < 15; i++) {
            System.out.println("outer---i----->" + i + " j--------->" + j);
            for (j = 10; j < 20; j++) {
                System.out.println("inner---i----->" + i + " j--------->" + j);
                if (i > j) {
                    System.out.println("ok");
                    continue ok;
                }
            }
        }
    }


    public static void Three() {
        int i = 0, j = 0;

        for (i = 0; i < 10; i++) {
            ok:
            for (j=0; j < 20; j++) {
                System.out.println("---i----->" + i + " j--------->" + j);
                continue ok;
            }
        }
    }


    public static void main(String[] args) {
        Three();
    }
}
