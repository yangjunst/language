package control.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/4 16:57
 * Program Goal:
 *********************************************/
public class ContinueClass {
    public static void main(String[] args) {
        for(int i=0;i<10; System.out.println("ok")){
            i++;
            if(i%2==0){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}
