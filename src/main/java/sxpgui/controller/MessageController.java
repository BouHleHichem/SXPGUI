/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.controller;

import controller.SearchUserController;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.data.user.User;
import sxpgui.SXPGUI;

/**
 *
 * @author EL MAHIL
 */
public class MessageController implements Initializable {
    
    @FXML 
    private TextField subject;
    @FXML
    private TextField receiver;
    @FXML
    private TextArea message;
    @FXML
    private Button SearchUser;
    @FXML
    private Button cancel;
    @FXML
    private Button send;
     @FXML
    private Stage fenetre;

    User user ;

  

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @FXML 
    public void handlecancel(){
    
      fenetre.close();
    
    }
    
//    @FXML
//    public List<User> userSearch(){
//        SearchUserController searchuser = new SearchUserController();
//        searchuser.startSearch(receiver.getText());
//        return null;
//    }
    
    @FXML 
    public void handlesend(){
    
        controller.MessageController send;
        System.out.println(subject.getText()+" yass");
        System.out.println(message.getText()+" ami");
        System.out.println(user.getKeys());
        send = new controller.MessageController(subject.getText(),message.getText(),user.getKeys());
    }
    
    public Stage getFenetre() {
        return fenetre;
    }

    public void setFenetre(Stage fenetre) {
        this.fenetre = fenetre;
    }

    public Button getSearchUser() {
        return SearchUser;
    }

    public void setSearchUser(Button SearchUser) {
        this.SearchUser = SearchUser;
    }
    
    @FXML
            public void showSearchUser(){
                        try {
                                    FXMLLoader loader = new FXMLLoader();
                                    loader.setLocation(SXPGUI.class.getResource("controller/finduser.fxml"));
                                    VBox pane = loader.load();
                                    Stage dialogStage = new Stage();
                                    dialogStage.setTitle("Search user");
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
