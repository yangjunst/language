package innerclasses.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/30 18:06
 * Program Goal:
 *********************************************/
public class OuterClassDemo {
    private class InnerClass {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public InnerClass(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new OuterClassDemo().new InnerClass(31, "yangjunst");
        System.out.println(innerClass.age + "-->" + innerClass.name);
    }
}

