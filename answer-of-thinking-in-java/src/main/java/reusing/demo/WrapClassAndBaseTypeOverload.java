package reusing.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/18 20:06
 * Program Goal:
 *********************************************/
public class WrapClassAndBaseTypeOverload {
    public void f(int a) {
        System.out.println("int-->"+a);
    }
    public void f(Integer a) {
        System.out.println("Integer-->"+a);
    }
    public void f(char c) {
        System.out.println("char--->"+c);
    }
    public void f(Character c) {
        System.out.println("Character-->"+c);
    }

    public static void main(String[] args) {
        WrapClassAndBaseTypeOverload overload=new WrapClassAndBaseTypeOverload();
        overload.f(1);
        overload.f('c');
        overload.f(new Integer(1));
        overload.f(new Character('a'));
    }
}
