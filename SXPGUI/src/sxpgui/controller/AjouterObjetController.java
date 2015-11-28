/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.controller.objets;
import controller.ManagerBridge;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author hichem
 */
public class AjouterObjetController extends Application implements Initializable {

    @FXML private Button bntAddItem ;
    @FXML private Button bntCancel ;
    @FXML private Button bntAddImg ;
    @FXML private TextField txtTitle ;
    @FXML private TextField txtCountry ;
    @FXML private TextArea txaDescrition ;
    @FXML private TextArea txaContact ;
    @FXML private DatePicker dtpLeftTime ;
    @FXML private RadioButton rbtnFile ;
    @FXML private RadioButton rbtnWebCam ;    
    @FXML private ChoiceBox rbtnType ;
    @FXML private ChoiceBox rbtnCategorie ;
    @FXML private Label actionStatus ;

   
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        rbtnType.getItems().add("OFFER");
        rbtnType.getItems().add("COMMAND");
        rbtnType.setValue("OFFER");
        
        rbtnCategorie.getItems().addAll("Appliances","Baby","Appliances","Baby","Beauty","Books",
                "ClothingAccessories","Clothing","Computers","FoodAndBeverages","Health","Home","Industrial","Jewelry",
                "Music","MusicalInstruments","category","Office","OtherProducts","Photography","Shoes","Sports","Tools",
                "Toys","Vehicles","Video","VideoGames","OtherServices","PersonalCaring","Teaching","Transport","NA");
        rbtnCategorie.setValue("Appliances");
        
    }    
    @FXML
    public void handleAddImg(){
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            actionStatus.setText("File selected: " + selectedFile.getName());
            }
        else {
            actionStatus.setText("File selection cancelled.");
            }

    }
    @FXML
    public void handleCancel(){
          //TODO Window.close();
    }
    @FXML
    public void handleAddItem(){
             //TODO
            if(txtTitle.getText() != "" && txtCountry.getText()!= "" && dtpLeftTime.isEditable() == true){
                if(/*controller.ManagerBridge.addItem(userName.getText(), userName.getText())*/ true){
                 // redirection par la page principale 
                }
            }
        else{
           
            }
 }

    @Override
    public void start(Stage primaryStage) throws Exception {
             FXMLLoader loader = new FXMLLoader();
             AnchorPane page = (AnchorPane) loader.load();
            Scene scen = new Scene(page);
            scen.getStylesheets().add("ajouterobjet.css");
            //bntAddItem.setId("bevel-grey");
            primaryStage.setScene(scen);
            

    }
}

 
 
    
   
    
    

   

    
   
    

