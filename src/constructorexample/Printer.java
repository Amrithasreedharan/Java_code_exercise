package constructorexample;
public class Printer {
    private int tonerLevel;
    private  boolean duplex;
    private int pagesPrinted;

    public Printer(int tonerLevel, boolean duplex) {
        if ( tonerLevel < -1 || tonerLevel > 100){
            this.tonerLevel = -1;
        }else{
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        tonerLevel = tonerLevel + tonerAmount;
        return tonerLevel;
    }

}
