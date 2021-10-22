public class Main {

    public Main(){
    }

    public static void main(String[] args){
        Accumulateur mAccumulateur = new Accumulateur();

        mAccumulateur.accumuler('1');
        mAccumulateur.push();
        mAccumulateur.accumuler('2');
        mAccumulateur.push();

        System.out.print(mAccumulateur.maPile.pop());
        System.out.print("\n");
        System.out.print(mAccumulateur.maPile.pop());

        //mAccumulateur.add();

        //System.out.print(mAccumulateur.maPile.pop());

    }
}
