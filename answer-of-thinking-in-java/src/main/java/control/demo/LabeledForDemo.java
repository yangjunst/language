package control.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/14 13:38
 * Program Goal:
 * Label������ŵ��ǵ�����䣬�������������
 *********************************************/
public class LabeledForDemo {
    public static void main(String[] args) {
        int i, j=0;
        ok:
        for(i=0;i<20;i++){
            for(j=10;j<20;j++){
                if(i>j){
                    break ok;
                }
            }
        }
        System.out.println(i+"-------"+j);
    }
}
