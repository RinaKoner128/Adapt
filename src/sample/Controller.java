package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import sample.Metods.Adapter;

public class Controller {
    public ListView listview;
    public Label label;
    public Label dly_udal;
    public AnchorPane ap2;
    public TextField textbox;

    Adapter adapter =new Adapter();


    public void Insert(ActionEvent actionEvent) {
        int s=Integer.parseInt(textbox.getText());
        adapter.inSert(s);
        listview.getItems().addAll(adapter.displ());
    }

    public void Poisk(ActionEvent actionEvent) {
        int s=Integer.parseInt(textbox.getText());
        adapter.poisk();
        listview.getItems().addAll(adapter.displ());
    }

    public void Delete(ActionEvent actionEvent) {
        adapter.Remuve();
        listview.getItems().addAll(adapter.displ());

    }

    public void Cl(ActionEvent actionEvent) {
            ap2.setVisible(true);
        }


}


