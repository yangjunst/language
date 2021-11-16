package reusing.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 开发时间: 2021/8/18 16:11
 * 入职时间: 2016/05/16
 * Program Goal:
 *********************************************/
public class BaseClassInstanceInSubClass {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println("BaseClassInstanceInSubClass-->"+sub.hashCode());

    }
    static class Super {
        Super(){
            System.out.println("Super---->"+this.hashCode());
        }
        public void main(String str) {
            System.out.println("super-->"+str);
            System.out.println(this.toString());
            System.out.println(super.toString());
            System.out.println(this.hashCode());
            System.out.println(super.hashCode());
        }
    }

    static class Sub extends Super{

        Sub(){
            System.out.println("Sub---->"+this.hashCode());
        }

        @Override
        public void main(String str) {
            System.out.println("sub--->"+str);
            super.main(str);
        }

        public Super main() {
           return new Super();
        }
    }
}
