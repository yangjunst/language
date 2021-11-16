package innerclasses;

import java.io.Serializable;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/1 13:26
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
