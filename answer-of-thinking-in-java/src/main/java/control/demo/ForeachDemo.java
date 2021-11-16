package control.demo;

import java.util.stream.IntStream;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/14 13:07
 * Program Goal:
 *********************************************/
public class ForeachDemo {
    public static void charArray() {
        for(Character c:"Hello World".toCharArray()){
            System.out.print(c+",");
        }
    }

    public static int[] generateArray() {
        return IntStream.rangeClosed(1,10).toArray();
    }
    public static void main(String[] args) {
        for(int i:generateArray()){
            System.out.print(i+",");
        }
        System.out.println();
        charArray();
    }
}
