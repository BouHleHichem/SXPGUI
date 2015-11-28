/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.model;

import javafx.beans.property.*;

/**
 *
 * @author yassine
 */
public class Contrat {
    
    private StringProperty title;								// Title of deal
    private StringProperty state;

    public Contrat(model.data.contrat.Contrat contrat) {
        title = new SimpleStringProperty(contrat.getTitle());
        state = new SimpleStringProperty(contrat.getPossibleState(contrat.getState()));
    }

    public Contrat() {
        
        title=new SimpleStringProperty(null);
        state=new SimpleStringProperty(null);
    }
    
    

    public StringProperty titleProperty() {
        return title;
    }
    public String getTitle() {
        return title.get();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public StringProperty stateProperty() {
        return state;
    }
    public String getState() {
        return state.get();
    }

    public void setState(String state) {
        this.state.set(state);
    }
    
    
    
}
