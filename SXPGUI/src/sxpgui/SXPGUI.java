/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui;

import java.util.Observable;
import sxpgui.controller.LoginController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.data.item.Category;
import model.data.user.User;
import sxpgui.model.Item;

/**
 *
 * @author Yassine
 */
public class SXPGUI extends Application {
    
            public static ObservableList<Item> myObjects = FXCollections.observableArrayList();
            
    //private BorderPane rootLayout;
    @Override
    public void start(Stage stage) throws Exception {        
        try{
                    populateObjectList();
            FXMLLoader loader = new FXMLLoader();
           
            loader.setLocation(SXPGUI.class.getResource("controller/login.fxml"));
            BorderPane ap = loader.load();
            LoginController loginController = loader.getController();
            loginController.setMainStage(stage);
            Scene sc = new Scene(ap);
            stage.setScene(sc);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //model.Application.main(args);
        launch(args);
    }
    
    public void populateObjectList(){
                User user = new User("test", " ", "Doe", "John", "john.doe@sxp.com", "+33442044204");
                Item item = new Item(new model.data.item.Item(user, "Potatoes", new Category(Category.CATEGORY.FoodAndBeverages), "Great potatoes", "", "FRANCE", "Call me", 0L, 0L, model.data.item.Item.TYPE.OFFER));
                myObjects.add(item);
    }
    
}
