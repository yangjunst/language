package control.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/14 13:38
 * Program Goal:
 * Label后紧跟着的是迭代语句，不可是其它语句
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
