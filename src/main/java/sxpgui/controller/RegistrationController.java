package sxpgui.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Yassine
 */
public class RegistrationController implements Initializable {
            @FXML
            private Text message;
            @FXML
            private TextField userName;
            @FXML
            private TextField name;
            @FXML
            private TextField firstName;
            @FXML
            private TextField email;
            @FXML
            private TextField phone;
            @FXML
            private PasswordField password;
            @FXML
            private PasswordField confirmPassword;
            @FXML
            private Button registration;
            @FXML
            private Button cancel;
            
            private Stage stage;
    /**
     * Initializes the controller class.
     */
@Override
public void initialize(URL url, ResourceBundle rb) {
        // TODO
            }    
    
public void handleRegistration (){
            if(isUserNameOk() && isNameOk() && isFirstNameOk() && isEmailOk() && isPhoneOk() && isPasswordOk()){
                        controller.ManagerBridge.registration(userName.getText(), password.getText(),name.getText() , firstName.getText(), email.getText(), phone.getText());
                        stage.close();
                        }
            }

public void handleCancel(){
            stage.close();
            }

public boolean isUserNameOk(){
            if(userName.getText().length()>0){
                        return true;
                        }
            else{
                        message.setText( "Invalid username !");
                        // TODO : assigner a userName un classe qui prmet de voir qu'il est mal renseignee
                        //message.setStyle(null);
                        return false;
                        }
            }

public boolean isNameOk(){
            if(name.getText().length()>0){
                        return true;
                        }
            else{
                        message.setText( "Invalid name !");
                        // TODO : assigner a name un classe qui permet de voir qu'il est mal renseignee
                        //message.setStyle(null);
                        return false;
                        }
            }

public boolean isFirstNameOk(){
            if(firstName.getText().length()>0){
                        return true;
                        }
            else{
                        message.setText( "Invalid firstname !");
                        // TODO : assigner a firstName un classe qui prmet de voir qu'il est mal renseignee
                        //message.setStyle(null);
                        return false;
                        }
            }

public boolean isEmailOk(){
            if(email.getText().length()>0){
                        return true;
                        }
            else{
                        message.setText( "Invalid username !");
                        // TODO : assigner a message un classe qui prmet de voir qu'il est mal renseignee
                        //message.setStyle(null);
                        return false;
                        }
            }

public boolean isPhoneOk(){
            // TODO : voir le check du phone number
            if(phone.getText().length()>0){
                        return true;
                        }
            else{
                        message.setText( "Invalid phone number !");
                        // TODO : assigner au champ une classe qui prmet de voir qu'il est mal renseignee
                        //message.setStyle(null);
                        return false;
                        }
            }

public boolean isPasswordOk(){
            String password1 = password.getText();
            String password2 = confirmPassword.getText();
            if(password1.length() <1 || password2.length()  < 1){
                        message.setText( "Invalid password !");
                        // TODO : assigner a message un classe qui prmet de voir qu'il est mal renseignee
                        //message.setStyle(null);
                        return false;
                        }
            else{
                        if(! password1.equals(password2)){
                                    message.setText( "Passwords don't match !");
                                    // TODO : assigner a message un classe qui prmet de voir qu'il est mal renseignee
                                    //message.setStyle(null);
                                    return false;
                                    }
                        else return true;
                        }
            }

            /**
             * @return the stage
             */
            public Stage getStage() {
                        return stage;
            }

            /**
             * @param stage the stage to set
             */
            public void setStage(Stage stage) {
                        this.stage = stage;
            }
}


