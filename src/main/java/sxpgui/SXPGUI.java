package sxpgui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import model.data.item.Category;
import sxpgui.model.Item;
import model.data.user.User;
import sxpgui.controller.LoginController;

public class SXPGUI  extends Application{
    /**
     * @param args the command line arguments
     */
            public static ObservableList<Item> myObjects = FXCollections.observableArrayList();
            
//private BorderPane rootLayout;
@Override
public void start(Stage stage) throws Exception {        
            try{
                        //populateObjectList();
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(SXPGUI.class.getResource("controller/login.fxml"));
                        BorderPane ap = loader.load();
                        LoginController loginController = loader.getController();
                        loginController.setMainStage(stage);
                        Scene sc = new Scene(ap);
                        stage.setScene(sc);
                        
                        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                                    @Override
                                    public void handle(WindowEvent event) {
                                        controller.ManagerBridge.logout();
                                        model.Application.getInstance().close();
                                        Platform.exit();
                                        System.exit(0);
                                                }
                                    });
                        
                        stage.show();
                        }
            catch(Exception e){
                        e.printStackTrace();
                        }
            }

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
            // model.Application.main(args);
            launch(args);           
            }
    
    /*public void populateObjectList(){
                User user = new User("test", " ", "Doe", "John", "john.doe@sxp.com", "+33442044204");
                Item item = new Item(new model.data.item.Item(user, "Potatoes", new Category(Category.CATEGORY.FoodAndBeverages), "Great potatoes", "", "FRANCE", "Call me", 0L, 0L, model.data.item.Item.TYPE.OFFER));
                myObjects.add(item);
    }*/

public static void showItems(){
    
    SXPGUI.myObjects.clear();
     for (model.data.item.Item item : controller.ManagerBridge.getCurrentUserItems()) {
                        Item item1 = new Item(item);
                        SXPGUI.myObjects.add(item1);
                        }
    
}

}           
