package interfaces.demo.impl;

import interfaces.demo.Nesting;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/30 15:27
 * Program Goal:
 *********************************************/
public class Test extends Nesting {
    class Impl implements A{

        @Override
        public void show() {
            System.out.println("show...Impl");
        }

        @Override
        public void display() {
            System.out.println("display... Impl");
        }
    }

    public static void main(String[] args) {
        Nesting.A a=new Test().new Impl();
        a.display();
        a.show();
    }
}
