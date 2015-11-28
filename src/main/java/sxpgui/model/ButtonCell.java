/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javax.resource.cci.Record;
import sxpgui.SXPGUI;

/**
 *
 * @author ZONGO
 */
public class ButtonCell extends TableCell<Record, Boolean> {
        final Button cellButton = new Button("Delete");
        
        public ButtonCell(){
            
        	//Action when the button is pressed
            cellButton.setOnAction(new EventHandler<ActionEvent>(){

                @Override
                public void handle(ActionEvent t) {
                    // get Selected Item
                	Item currentItem = (Item) ButtonCell.this.getTableView().getItems().get(ButtonCell.this.getIndex());
                	//remove selected item from the table list
                                    controller.ManagerBridge.removeItem(currentItem.getItemKey());
                                    SXPGUI.myObjects.remove(currentItem);
                }
            });
        }
        
        @Override
        protected void updateItem(Boolean t, boolean empty) {
            super.updateItem(t, empty);
            if(!empty){
                        setGraphic(cellButton);
                        }
            else{
               setGraphic( null );
            }
        }
        }
        
        
        
