public class Accumulateur implements IAccumaleur {

    public Pile maPile ;
    private String mAccumuler;
    private boolean pointDejaSaisi = false;

    public Accumulateur() {
        this.maPile = new Pile();
        this.mAccumuler = new String();
    }

    @Override
    public void push() {
        if (mAccumuler.startsWith(".") & mAccumuler.endsWith(".")) {
            maPile.push(Double.parseDouble("0"));
            mAccumuler="";
        } else {
            if (mAccumuler.startsWith(".")) {
                maPile.push(Double.parseDouble("0" + mAccumuler));
                mAccumuler="";
            } else {
                if (mAccumuler.endsWith(".")) {
                    maPile.push(Double.parseDouble(mAccumuler + "0"));
                    mAccumuler="";
                }else{
                    maPile.push(Double.parseDouble(mAccumuler));
                    mAccumuler="";
                }
            }
        }



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
            maPile.push(variableDepile1);
            maPile.push(variableDepile2);
        }
    }

    @Override
    public void add() {
        if(maPile.size()>=2) {
            Double variableDepile1 = maPile.pop();
            Double variableDepile2 = maPile.pop();
            Double variableAddition = variableDepile1 + variableDepile2;
            maPile.push(variableAddition);
        }
    }

    @Override
    public void sub() {
        if(maPile.size()>=2) {
            Double variableDepile1 = maPile.pop();
            Double variableDepile2 = maPile.pop();
            Double variableSoustraction = variableDepile1 - variableDepile2;
            maPile.push(variableSoustraction);
        }
    }

    @Override
    public void mult() {
        if(maPile.size()>=2) {
            Double variableDepile1 = maPile.pop();
            Double variableDepile2 = maPile.pop();
            Double variableMultiplication = variableDepile1 * variableDepile2;
            maPile.push(variableMultiplication);
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
                maPile.push(variableDivision);
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
        if (mAccumuler != null && mAccumuler.length() > 0 ) {
            mAccumuler = mAccumuler.substring(0, mAccumuler.length() - 1);
        }
    }

    @Override
    public void accumuler(char character) {
       if(!(character == '.' & pointDejaSaisi)){
            mAccumuler+=String.valueOf(character);
            if(character == '.'){
                pointDejaSaisi=true;
            }
       }
    }

    @Override
    public void reset() {
        mAccumuler="";
        this.maPile=new Pile();
    }
}
