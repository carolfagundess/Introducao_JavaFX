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
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author carol
 */
public class SegundaTelaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    Button btnFechar;
    
    @FXML
    Button bntMensagem;
    
    public void onBtnMostrarMensagem(ActionEvent event){
        System.out.println(event.getSource());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText("Mensagem de informação");
        alert.setContentText("JavaFX é melhor que o SWING");
        alert.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       btnFechar.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent t) {
               Stage stage = (Stage) btnFechar.getScene().getWindow();
               stage.close();
           }
       });
    }    
    
}
