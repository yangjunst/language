package control.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/4 16:57
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
