package vasudevan.java.anitha.morning.ForeNoonStack.oop;

public class DemoInterface implements Happy{
    public static void main(String[] args) {
        Regular reg=new Regular();
        reg.name="Anitha";
        reg.doomsDay();
        // direct object initialization not supported in interface since it has no constructor
        //Happy hap=new Happy();

        DemoInterface demo=new DemoInterface();
        System.out.println(demo.vary);
        //demo.vary=44;
        demo.judgementDay();
    }

    @Override
    public void judgementDay() {
        System.out.println("Judgement day is coming");
    }
}

class Regular{
    String name;
    public void doomsDay(){
        System.out.println("World extinct");
    }
}

// interface members such as object,variables,arrays has to be initialized, and the initial value cannot be changed(final)
// interface methods are abstract(method without body)
// overriding interface methods are mandate
interface Happy{
    int vary=56;
    public void judgementDay();
}