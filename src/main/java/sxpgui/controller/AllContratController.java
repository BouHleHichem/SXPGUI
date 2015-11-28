/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import sxpgui.SXPGUI;

import sxpgui.model.*;

/**
 * FXML Controller class
 *
 * @author yassine
 */
public class AllContratController implements Initializable {
    
    @FXML
    TextField t1;
    
    
    @FXML
    Button add;
    
    @FXML
    Label error ;
    
    @FXML
    private TableView<Contrat> tableView;       
    @FXML
    private TableColumn<Contrat,String> titleColumn;
    @FXML
    private TableColumn<Contrat,String> stateColumn;
    ObservableList<Contrat> myContrats = FXCollections.observableArrayList();
    
 //   private ObservableList<Contrat> ContratData = FXCollections.observableArrayList();
  //  ArrayList<Contrat> MyContrat=new ArrayList<Contrat>();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        titleColumn.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
        stateColumn.setCellValueFactory(cellData -> cellData.getValue().stateProperty());
        tableView.setItems(this.myContrats);
        for(model.data.contrat.Contrat contrat : controller.ManagerBridge.getCurrentUserContrats()){
                    Contrat contrat1 = new Contrat(contrat);
                    this.myContrats.add(contrat1);
        }
    }    
    
    public void addContratt(){
        
        if(!t1.getText().equals("")){
            controller.ManagerBridge.createContrat(t1.getText());
            Contrat contrat=new Contrat();
            contrat.setTitle(t1.getText());
            contrat.setState(model.data.contrat.Contrat.getPossibleState(0));
            this.myContrats.add(contrat);
        }
        else error.setText("You have to give a contrat name !! ");
        
    }
    
    
    
    public void getCont(){
        
       try{
           
//           MyContrat=controller.ManagerBridge.getCurrentUserContrats();
           
       }catch(Exception e){
           
       }
        
    }
    
}
