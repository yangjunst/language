package control.demo;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;
import static net.mindview.util.Print.printnb;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/14 11:16
 * Program Goal:
 * 寻求某个数字区间的质数序列
 *********************************************/
public class FindPrimes {
    /**
     * 此寻找质数的小算法是习题答案的参考实现方案
     */
    //TODO 后期算法课程学完了，这算是小儿科了，当下理解有点费劲及难度
    public static void findPrimes() {
        int max = 100;
        boolean[] sieve = new boolean[max + 1];
        int limit = (int) floor(sqrt(max));
        printnb(1 + " ");
        if (max > 1) {
            printnb(2 + " ");
        }
        for (int i = 3; i <= limit; i += 2)
            if (!sieve[i])
                for (int j = 2 * i; j <= max; j += i)
                    sieve[j] = true;
        for (int i = 3; i <= max; i += 2)
            if (!sieve[i])
                printnb(i + " ");
    }

    static void findPrimes(int max) {
        for (int i = 1; i <= max; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(i + ",");
            }
        }
    }

    public static void main(String[] args) {
        findPrimes(100);
        System.out.println();
        findPrimes();
    }
}
