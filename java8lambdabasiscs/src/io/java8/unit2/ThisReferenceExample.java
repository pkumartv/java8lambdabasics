package io.java8.unit2;

public class ThisReferenceExample {
    
    public void doProcess(int i, Process p){
        p.process(i);
    }


    public void  execute(){

    }
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample= new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process(){

            @Override
            public void process(int i) {
               System.out.println(i );
               System.out.println(this);
                
            }

            @Override
            public String toString() {
                // TODO Auto-generated method stub
                return "This is the anonymouse inner class: "+super.toString();
            }
            
        });
    }
}
