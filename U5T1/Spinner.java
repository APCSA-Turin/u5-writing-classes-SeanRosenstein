public class Spinner {

    private int sections;
    private int spin;
    private int spinCount;
    private int spinSum;


    public Spinner (int sections){
        this.sections=sections;
    }

    public int spin(){
        spin = (int) (Math.random()*sections)+1;
        spinCount++;
        spinSum+=spin;
        return spin;
    }

    public int lastSpin(){
        return spin;
    }

    public int spinCount(){
        return spinCount;
    }

    public int spinSum(){
        return spinSum;
    }

    public double averageSpin(){
        return (double)spinSum/spinCount;
    }
}
