public class Main {

    public Main(){
    }

    public static void main(String[] args){
        Accumulateur mAccumulateur = new Accumulateur();

        mAccumulateur.accumuler('5');
        mAccumulateur.push();
        mAccumulateur.accumuler('2');
        mAccumulateur.push();


        mAccumulateur.add();

        System.out.print(mAccumulateur.maPile.pop());

    }
}
