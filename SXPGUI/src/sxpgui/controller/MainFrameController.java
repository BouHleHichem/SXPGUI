/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;
import sxpgui.SXPGUI;
import sxpgui.model.Item;

/**
 *
 * @author ZONGO
 */
public class MainFrameController implements Initializable{
            
            @FXML
            private TableView<Item> tableView;
            @FXML
            private TableColumn<Item,String> titleColumn;
            @FXML
            private TableColumn<Item,String> descriptionColumn;
            @FXML
            private TableColumn operationColumn;
            
            @FXML
            private MenuItem allContrats;
            
            
            @Override
            public void initialize(URL location, ResourceBundle resources) {
                        titleColumn.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
                        descriptionColumn.setCellValueFactory(cellData -> cellData.getValue().descriptionProperty());
                        
                        //operationColumn.setCellFactory(new Callback);
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        tableView.setItems(SXPGUI.myObjects);
                        }
            
            @FXML
            public void showContratList(){
                        try {
                                    FXMLLoader loader = new FXMLLoader();
                                    loader.setLocation(SXPGUI.class.getResource("controller/contrat.fxml"));
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
            public void showAjouterObjet(){
                        try {
                                    FXMLLoader loader = new FXMLLoader();
                                    loader.setLocation(SXPGUI.class.getResource("controller/AjouterObjet.fxml"));
                                    AnchorPane pane = loader.load();
                                    Stage dialogStage = new Stage();
                                    dialogStage.setTitle("Objects");
                                    dialogStage.initModality(Modality.WINDOW_MODAL);
                                    Scene scene = new Scene(pane);
                                    dialogStage.setScene(scene);
                                    
                                    dialogStage.show();
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
