public class Accumulateur implements IAccumaleur {

    private Pile maPile ;

    public Accumulateur(Pile maPile) {
        this.maPile = maPile;
    }

    @Override
    public void push(double numbreAEmpile) {
        maPile.push(numbreAEmpile);
    }

    @Override
    public void drop() {
        maPile.drop();
    }

    @Override
    public void swap() {
        Double variableDepile1 = maPile.pop();
        Double variableDepile2 = maPile.pop();
        push(variableDepile1);
        push(variableDepile2);
    }

    @Override
    public void add() {
        Double variableDepile1 = maPile.pop();
        Double variableDepile2 = maPile.pop();
        Double variableAddition = variableDepile1 + variableDepile2;
        push(variableAddition);
    }

    @Override
    public void sub() {
        Double variableDepile1 = maPile.pop();
        Double variableDepile2 = maPile.pop();
        Double variableSoustraction = variableDepile1 - variableDepile2;
        push(variableSoustraction);
    }

    @Override
    public void mult() {

    }

    @Override
    public void div() {

    }

    @Override
    public void neg() {

    }

    @Override
    public void backspace() {

    }

    @Override
    public void accumuler(char character) {

    }

    @Override
    public void reset() {

    }
}
