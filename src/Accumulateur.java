public class Accumulateur implements IAccumaleur {

    private Pile maPile ;

    public Accumulateur(Pile maPile) {
        this.maPile = maPile;
    }

    @Override
    public void push(double nombreAEmpile) {
        maPile.push(nombreAEmpile);
    }

    @Override
    public void drop() {
        maPile.drop();
    }

    @Override
    public void swap() {
        if(maPile.size()>=2) {
            Double variableDepile1 = maPile.pop();
            Double variableDepile2 = maPile.pop();
            push(variableDepile1);
            push(variableDepile2);
        }
    }

    @Override
    public void add() {
        if(maPile.size()>=2) {
            Double variableDepile1 = maPile.pop();
            Double variableDepile2 = maPile.pop();
            Double variableAddition = variableDepile1 + variableDepile2;
            push(variableAddition);
        }
    }

    @Override
    public void sub() {
        if(maPile.size()>=2) {
            Double variableDepile1 = maPile.pop();
            Double variableDepile2 = maPile.pop();
            Double variableSoustraction = variableDepile1 - variableDepile2;
            push(variableSoustraction);
        }
    }

    @Override
    public void mult() {

        if(maPile.size()>=2) {
            Double variableDepile1 = maPile.pop();
            Double variableDepile2 = maPile.pop();
            Double variableMultiplication = variableDepile1 * variableDepile2;
            push(variableMultiplication);
        }

    }

    @Override
    public void div() {

        if(maPile.size()>=2) {
            Double variableDepile1 = maPile.pop();
            Double variableDepile2 = maPile.pop();
            if (variableDepile2 == 0) {
                System.out.print("ZeroDivision Error");
            } else {
                Double variableDivision = variableDepile1 / variableDepile2;
                push(variableDivision);
            }

        }
    }

    @Override
    public void neg() {
        if(!maPile.isEmpty()){
            maPile.push(-maPile.pop());
        }
    }

    @Override
    public void backspace() {
        maPile.pop();
    }

    @Override
    public void accumuler(char character) {

    }

    @Override
    public void reset() {

    }
}
