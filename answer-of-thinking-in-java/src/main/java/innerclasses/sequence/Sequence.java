package innerclasses.sequence;


/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/30 18:35
 * Program Goal:
 *********************************************/
 interface Selector {
    void next();

    boolean end();

    Object current();
}
class SequnceExample{
    private Object[] items;
    private int i;
    public SequnceExample(int nums) {
       this.items=new Object[nums];
    }

    public void addItem(Object obj){
        if(i>=items.length){
            return;
        }
        items[i++]=obj;
    }

    private class SequenceSelector implements Selector{
        private int end;

        @Override
        public void next() {
            end++;
        }

        @Override
        public boolean end() {
            return end==items.length;
        }

        @Override
        public Object current() {
            return items[end];
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        SequnceExample example=new SequnceExample(10);
        for(int i=0;i<example.items.length;i++){
            example.addItem(i);
        }

        Selector selector = example.selector();
        while (!selector.end()){
            Object current = selector.current();
            selector.next();
            System.out.print(current+" ");

        }

    }

}
