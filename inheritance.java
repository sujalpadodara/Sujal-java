

class Base {
    public int x;

    public int getX() {
        System.out.println("I am in base");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
    class Derived extends Base {
        public int y;

        public void setY(int y) {

            this.y = y;

        }

        public int getY() {
            System.out.println("I am derived class");
            return y;
        }
    }



class inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());
        Derived d = new Derived();
        d.setY(99);
        System.out.println(d.getY());


        

    }
}