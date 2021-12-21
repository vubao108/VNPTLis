package javasript.helper;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.script.ScriptException;

import com.fasterxml.jackson.databind.ObjectMapper;
import  javasript.helper.Common.ProcessData;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




/**
 * Hello world!
 */
public  class App extends Application{
   
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // 
       // JavascriptHandler scriptHandler = (JavascriptHandler)ScriptFactory.create("JAVASCRIPT");
       // String tmp_script = "var dsketqua = []; var x=1; return data + '20';";
        // String data = "D 000601 0048                2348    E                    76  30.7r 77  24.4r 87  62.7r 88  6.00Pr94   2.3Nr";
        //String result_script = scriptHandler.createScript(tmp_script);
        
       launch();

        
    }


   
    @Override
    public void start(Stage stage) throws Exception {
        
       
         HBox hBox = new HBox();
         TextArea dataArea = new TextArea();
         dataArea.setText("nhap data vao day");
         dataArea.setPrefHeight(400);
         dataArea.setWrapText(true);
         TextArea scriptArea = new TextArea();
         scriptArea.setText("nhap script vao day");
         scriptArea.setPrefHeight(400);
         scriptArea.setWrapText(true);
         hBox.getChildren().add(dataArea);
         hBox.getChildren().add(scriptArea);

         VBox vBox = new VBox();
         Button xulyButton  = new Button("Xử lý");
         TextArea ketquArea = new TextArea("ket qua");

         ketquArea.setWrapText(true);
         xulyButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String ketqua =ProcessData.HandleWithInput(dataArea.getText(), scriptArea.getText());
                ketquArea.setText(ketqua);
            }
        });
         vBox.getChildren().add(hBox);
         vBox.getChildren().add(xulyButton);
        
         vBox.getChildren().add(ketquArea);


         


        Scene scene = new Scene(vBox, 1000, 600);
        stage.setScene(scene);
        stage.show();
    }
}
