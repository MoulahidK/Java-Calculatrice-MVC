public class Pile extends java.util.Stack<Double> {

    public Pile(){
        super();
    }

    public void drop(){
        double elementElimine = (double) this.pop();
    }

}
