package LambdaExpression;
interface Cab{
    public void bookCab();
}
/*class Ola implements Cab{
    @Override
    public void bookCab() {
        System.out.println("ola is booked");
    }
}*/
public class Test {
    public static void main(String[] args) {
        //Ola ola = new Ola();
        //ola.bookCab();

        // instead of this
        Cab ola= ()-> System.out.println("ola is booked by lambda");
        ola.bookCab();
    }
}
