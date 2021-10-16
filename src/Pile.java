public class Pile extends java.util.Stack {

    public Pile(){
        super();
    }

    public void drop(){
        double elementElimine = (double) this.pop();
    }

    @Override public Double pop(){
        return (double)this.pop();
    }

}
