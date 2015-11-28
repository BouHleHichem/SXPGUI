/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;
import javax.resource.cci.Record;
import sxpgui.SXPGUI;
import sxpgui.model.Item;

/**
 *
 * @author ZONGO
 */


public class MainFrameController implements Initializable{
    
     ArrayList<model.data.item.Item> maliste= new ArrayList<model.data.item.Item>();
    
            @FXML
            private TableView<Item> tableView;
            @FXML
            private TableColumn<Item,String> titleColumn;
            @FXML
            private TableColumn<Item,String> descriptionColumn;
            @FXML
            private TableColumn actionColumn;
            
            @FXML
            private MenuItem allContrats;
            
            
            @Override
            public void initialize(URL location, ResourceBundle resources) {
                        titleColumn.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
                        descriptionColumn.setCellValueFactory(cellData -> cellData.getValue().descriptionProperty());
                        
                        actionColumn.setCellValueFactory(
                                    new Callback<TableColumn.CellDataFeatures<Record, Boolean>, ObservableValue<Boolean>>() {
                                                @Override
                                                public ObservableValue<Boolean> call(TableColumn.CellDataFeatures<Record, Boolean> p) {
                                                            return new SimpleBooleanProperty(false);
                                                            }
                                                });
                        
                        actionColumn.setCellFactory(
                                    new Callback<TableColumn<Record, Boolean>, TableCell<Record, Boolean>>() {
                                                @Override
                                                public TableCell<Record, Boolean> call(TableColumn<Record, Boolean> p) {
                                                            return new sxpgui.model.ButtonCell();
                                                }
        
        });
                        
                        SXPGUI.showItems();
                        tableView.setItems(SXPGUI.myObjects);
                        }
            
            @FXML
            public void showContratList(){
                        try {
                                    FXMLLoader loader = new FXMLLoader();
                                    loader.setLocation(SXPGUI.class.getResource("controller/allContrat.fxml"));
                                    AnchorPane pane = loader.load();
                                    Stage dialogStage = new Stage();
                                    dialogStage.setTitle("Contrat");
                                    dialogStage.initModality(Modality.WINDOW_MODAL);
                                    Scene scene = new Scene(pane);
                                    dialogStage.setScene(scene);
                                    
                                    dialogStage.show();
                                    }
                        catch (Exception e) {
                                    e.printStackTrace();
                                    }
                        
            }
            
            @FXML
            public void showAddItemDialog(){
                        try {
                                    FXMLLoader loader = new FXMLLoader();
                                    loader.setLocation(SXPGUI.class.getResource("controller/addItem.fxml"));
                                    AnchorPane pane = loader.load();
                                    Stage dialogStage = new Stage();
                                    dialogStage.setTitle("Add new item");
                                    dialogStage.initModality(Modality.WINDOW_MODAL);
                                    Scene scene = new Scene(pane);
                                    dialogStage.setScene(scene);
                                    AddItemController addItemController=loader.getController();
                                    addItemController.setStage(dialogStage);
                                    dialogStage.show();
                                    }
                        catch (Exception e) {
                                    e.printStackTrace();
                                    }
            }
            
            @FXML
            public void showUpdateItemDialog(){
                        try {
                                    Item item = tableView.getSelectionModel().getSelectedItem();
                                   if(item == null){
                                               
                                                }
                                   else{
                                               FXMLLoader loader = new FXMLLoader();
                                                loader.setLocation(SXPGUI.class.getResource("controller/addItem.fxml"));
                                                AnchorPane pane = loader.load();
                                                Stage dialogStage = new Stage();
                                                dialogStage.setTitle("Update item");
                                                dialogStage.initModality(Modality.WINDOW_MODAL);
                                                Scene scene = new Scene(pane);
                                                dialogStage.setScene(scene);
                                                AddItemController addItemController=loader.getController();
                                                addItemController.initForm(item);
                                                addItemController.setStage(dialogStage);
                                                dialogStage.show();
                                                }
                                    }
                        catch (Exception e) {
                                    e.printStackTrace();
                                    }
                        
            }
            
            public void showMessage(){
                        try {
                                    FXMLLoader loader = new FXMLLoader();
                                    loader.setLocation(SXPGUI.class.getResource("controller/message.fxml"));
                                    AnchorPane pane = loader.load();
                                    Stage dialogStage = new Stage();
                                    dialogStage.setTitle("Message");
                                    dialogStage.initModality(Modality.WINDOW_MODAL);
                                    Scene scene = new Scene(pane);
                                    dialogStage.setScene(scene);
                                    
                                    dialogStage.show();
                                    }
                        catch (Exception e) {
                                    e.printStackTrace();
                                    }
                        
                        
            }
            
   
            
}
