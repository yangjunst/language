package innerclasses;

import java.io.Serializable;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/1 13:26
 * Program Goal:
 *********************************************/
public class LocalClass {
    Serializable serializable=new Serializable() {
    };

    public static void main(String[] args) {
        class C{}
       new Serializable() {
            Cloneable cloneable=new Cloneable(){};
        };
    }
}
