package arrays.demo;

import java.util.Arrays;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/25 16:28
 * Program Goal:
 *********************************************/
public class MultiArray {
    public static void main(String[] args) {
        int[][][] arr=new int[2][][];
        arr[0]=new int[2][];
        arr[1]=new int[3][];
        arr[0][0]=new int[7];
        arr[1][0]=new int[4];
        System.out.println(Arrays.deepToString(arr));
    }
}
