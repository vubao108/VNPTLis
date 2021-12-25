package com.mycompany.mavenproject3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.mycompany.mavenproject3.Common.ProcessData;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;



public class FXMLController implements Initializable {
    
    @FXML
    private Button xulyButton;
    @FXML
    private TextArea dataArea; 
    @FXML
    private TextArea scriptArea;
    @FXML
    private TextArea ketquArea;


    @FXML
    private void handleRunScriptButtonAction(ActionEvent event) {
        ketquArea.setText("Đang xử lý ....");
        String ketqua =ProcessData.HandleWithInput(dataArea.getText(), scriptArea.getText());
        ketquArea.setText(ketqua);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
