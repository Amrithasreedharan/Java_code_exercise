package LambdaExpression;

interface CabTwo {
    //public void bookcab(String source, String destination);
    public String bookcab(String source, String destination);
}

public class TestTwo {
    public static void main(String[] args) {


        //CabTwo cabtwo = (source,destination)-> System.out.println("ola cab booked from "+ source+ " " +"to "+destination);
        //cabtwo.bookcab("payyanur","banglore");

        //return
        CabTwo cabtwo = (source,destination)->{
            System.out.println("ola cab booked from "+ source+ " " +"to "+destination);
            return ("hi hi hi ");};
        System.out.println(cabtwo.bookcab("payyanur","banglore"));
        }

    }

