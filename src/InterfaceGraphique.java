import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

import java.util.List;

public class InterfaceGraphique extends Scene implements IView {

    public InterfaceGraphique(){
        super(new StackPane());
    }

    @Override
    public void affiche() {

    }

    @Override
    public void change(List<String> data) {

    }

    @Override
    public void change(String accu) {

    }
}
