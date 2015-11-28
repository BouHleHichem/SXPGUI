/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.controller;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.stage.Stage;
import model.data.item.Category;
import sxpgui.SXPGUI;
import sxpgui.model.Item;

/**
 * FXML Controller class
 *
 * @author hichem
 */
public class AddItemController extends Application implements Initializable {

            @FXML 
            private TextField title ;
            @FXML 
            private ChoiceBox type;
            @FXML 
            private DatePicker lifeTime ;
            @FXML 
            private ChoiceBox categorie ;
            @FXML 
            private TextArea description;
            @FXML 
            private RadioButton file;
            @FXML 
            private RadioButton webcam ;
            @FXML 
            private Button choseImg ;
            @FXML 
            private TextField country ;
            @FXML 
            private TextArea contact ;
            @FXML 
            private Button add ;
            @FXML 
            private Button cancel ;
            
            private Stage stage;
            
            private ObservableList<String> listCat = FXCollections.observableArrayList();
            private ObservableList<String> listType = FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList catList = Category.getAllCategorie();
        for (int i=0 ; i<catList.size(); i++){
            listCat.add((String) catList.get(i));
            
            System.out.println(catList.get(0));
        }
        categorie.setItems(listCat);
        
         // ** récuperation de type
         listType.add("WISH");
         listType.add("PROPOSAL");
         type.setItems(listType);
         
        
    }    


    @Override
    public void start(Stage primaryStage) throws Exception {
             FXMLLoader loader = new FXMLLoader();
             AnchorPane page = (AnchorPane) loader.load();
            Scene scen = new Scene(page);
            //bntAddItem.setId("bevel-grey");
            primaryStage.setScene(scen);
            

    }
    
    @FXML
    public void handleCancel(){
        
        stage.close();
    }
    @FXML
    public void handleAdd(){
                //model.data.item.Item item = new model.data.item.Item
             //TODO
            if(title.getText() != "" && country.getText()!= "" && lifeTime.isEditable() == true){
                String titleValue=title.getText();
                String catValue=categorie.getSelectionModel().getSelectedItem().toString();
                String descValue=description.getText();
                //String imageValue=file.getText(); on rajout l'image aprés
                String contryValue=country.getText();
                String contactValue=contact.getText();
                String dateValue=lifeTime.getEditor().getText();
                String typeValue=type.getSelectionModel().getSelectedItem().toString();
                
                System.out.println(titleValue+" "+ catValue+" "+descValue+" "+contryValue+" "+contactValue+" "+dateValue+" "+typeValue);
                
                String key = controller.ManagerBridge.addItem(titleValue, catValue, descValue, "image", contryValue, contactValue, dateValue, typeValue);
                System.out.println("\nKEy :"+key+"\n\n");
                Item item1=new Item();
                item1.setItemKey(key);
                item1.setTitle(titleValue);
                item1.setCategory(catValue);
                item1.setDescription(descValue);
                item1.setImage("");
                item1.setCountry(contryValue);
                item1.setContact(contactValue);
                item1.setDate(dateValue);
                item1.setType(typeValue);
                
                SXPGUI.myObjects.add(item1);
                stage.close();
            }
        else{
           
            }
 }
    
    
        @FXML
    public void handleAddImg(){
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            //actionStatus.setText("File selected: " + selectedFile.getName());
            }
        else {
            //actionStatus.setText("File selection cancelled.");
            }

    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
    
}

 
 
    
   
    
    

   

    
   
    

