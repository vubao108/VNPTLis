package com.mycompany.mavenproject3;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.script.ScriptException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.mavenproject3.Common.ProcessData;
public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("Check javascript processing log data of LIS system");
        stage.setScene(scene);
        stage.show();
//        HBox hBox = new HBox();
//         final TextArea dataArea = new TextArea();
//         dataArea.setText("nhap data vao day");
//         dataArea.setPrefHeight(400);
//         dataArea.setWrapText(true);
//         final TextArea scriptArea = new TextArea();
//         scriptArea.setText("return data + 1;");
//         scriptArea.setPrefHeight(400);
//         scriptArea.setWrapText(true);
//         hBox.getChildren().add(dataArea);
//         hBox.getChildren().add(scriptArea);
//
//         VBox vBox = new VBox();
//         Button xulyButton  = new Button("Xử lý");
//         final TextArea ketquArea = new TextArea("ket qua");
//
//         ketquArea.setWrapText(true);
//         xulyButton.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                String ketqua =ProcessData.HandleWithInput(dataArea.getText(), scriptArea.getText());
//                ketquArea.setText(ketqua);
//            }
//        });
//         vBox.getChildren().add(hBox);
//         vBox.getChildren().add(xulyButton);
//        
//         vBox.getChildren().add(ketquArea);
//
//
//         
//
//
//        Scene scene = new Scene(vBox, 1000, 600);
//        stage.setScene(scene);
//        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
