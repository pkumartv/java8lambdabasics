package io.java8.unit2;

public class ThisReferenceExample {
    
    public void doProcess(int i, Process p){
        p.process(i);
    }


    public void  execute(){

        doProcess(20, i-> {
            System.out.println(i);
            System.out.println(this); //lambda doesnt override this reference. It still referes to the  this from main
        });

    }
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample= new ThisReferenceExample();
        // thisReferenceExample.doProcess(10, i-> {
        //     System.out.println(i);
        //    // System.out.println(this); //lambda doesnt override this reference. It still referes to the  this from main
        // });
        thisReferenceExample.execute();
    }

    @Override
    public String toString() {
        return "This reference of parent class ThisReferenceExample: "+super.toString();
    }
}
