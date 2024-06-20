/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author carol
 */
public class PrimeiraTelaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    Button btnAbrir;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EventHandler<ActionEvent> cliqueAbrir = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                try {
                    System.out.println("Uusario clicou no botao");
                    Parent parent = FXMLLoader.load(getClass().getResource("/view/SegundaTela.fxml"));
                    Scene scene = new Scene(parent);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        btnAbrir.setOnAction(cliqueAbrir);
    }    
    
}
