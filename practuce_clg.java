class A{
   A(){
        System.out.println("Default con...");
    }
    A(int a,int b){
            System.out.println("A="+a);
            System.out.println("B="+b);
            System.out.println("c="+ (a+b));
        }

}


class practuce_clg{
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 =new A(9,89);
    }
}