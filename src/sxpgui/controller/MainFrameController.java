/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
            
            
            @Override
            public void initialize(URL location, ResourceBundle resources) {
                        titleColumn.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
                        descriptionColumn.setCellValueFactory(cellData -> cellData.getValue().descriptionProperty());
                        
                        //operationColumn.setCellFactory(new Callback);
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        tableView.setItems(SXPGUI.myObjects);
            }
            
}
