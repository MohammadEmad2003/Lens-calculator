package zod;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class err implements Initializable {

    @FXML private Label erlbl1;
    public static Label erlbl;
    
    public void erclos(ActionEvent event) throws IOException{
        Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
        s.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    erlbl = erlbl1;
    }    
    
}
