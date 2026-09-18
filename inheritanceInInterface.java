interface Sample {
    void meth1();

    void meth2();

}

interface Child_Sample extends Sample {
    void meth3();

    void meth4();

}
class Sujal implements Child_Sample{
    public void meth1(){
        System.out.println("1");
    }
    public void meth2(){
        System.out.println("2");
    }
    public void meth3(){
        System.out.println("3");
    }
    public void meth4(){
        System.out.println("4");
    }

}

public class inheritanceInInterface {
    public static void main(String[] args) {
        Sujal obj= new Sujal();

        obj.meth1();
        obj.meth3();
    }
}
