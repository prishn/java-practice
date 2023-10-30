package methodtypes;

public class Programme2 {
    public static void main(String[] args) {
        Programme2 p2 = getObject();
        Programme2 p3 = getObject();
        int number = p2.m1();
        p2.add();
        p2.sub();
        getObject().add();
        getObject().sub();
    }
    public void add(){

    }
    public void sub(){

    }
    public int m1(){
        return 10;
    }
    public static Programme2 getObject(){
        Programme2 obj =new Programme2();
        return obj;
    }
}
