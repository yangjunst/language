package control.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/14 14:52
 * Program Goal:
 * 找出四位数的所有吸血鬼数字
 *@see Thinking In Java Page 75 The test questions No.10
 *********************************************/
public class Vampire {
    public static void main(String[] args) {
        int[] startDigit = new int[4];
        int[] productDigit = new int[4];
        for (int num1 = 10; num1 <= 99; num1++)
            for (int num2 = num1; num2 <= 99; num2++) {
                if ((num1 * num2) % 9 != (num1 + num2) % 9)
                    continue;
                int product = num1 * num2;
                startDigit[0] = num1 / 10;
                startDigit[1] = num1 % 10;
                startDigit[2] = num2 / 10;
                startDigit[3] = num2 % 10;
                productDigit[0] = product / 1000;
                productDigit[1] = (product % 1000) / 100;
                productDigit[2] = product % 1000 % 100 / 10;
                productDigit[3] = product % 1000 % 100 % 10;
                int count = 0;
                for (int x = 0; x < 4; x++)
                    for (int y = 0; y < 4; y++) {
                        if (productDigit[x] == startDigit[y]) {
                            count++;
                            productDigit[x] = -1;
                            startDigit[y] = -2;
                            if (count == 4)
                                System.out.println(num1 + " * " + num2
                                        + " : " + product);
                        }
                    }
            }
    }
}
