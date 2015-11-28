/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.controller;

import controller.ManagerBridge;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Yassine
 */
public class SearchUserController implements Initializable {

    @FXML
    private TextField txtfind;
    @FXML
    private Button btnfin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public TextField getTxtfind() {
        return txtfind;
    }

    public void setTxtfind(TextField txtfind) {
        this.txtfind = txtfind;
    }

    public Button getBtnfin() {
        return btnfin;
    }

    public void setBtnfin(Button btnfin) {
        this.btnfin = btnfin;
    } 
    
    @FXML
    public void handleBtnSearch(){
        controller.SearchUserController search= new controller.SearchUserController() ;
        search.startSearch(txtfind.getText());
    }
}
