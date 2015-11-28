/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.model;

import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.data.item.Category;
import util.DateConverter;

/**
 *
 * @author ZONGO
 */
public class Item {
            private StringProperty itemKey;
            private StringProperty friendlyNick;	// Friendly-user Pseudo of owner
            private StringProperty title;			// Title of the object
            private StringProperty category;		// Category of the object
            private StringProperty description;		// Big description of the object
            private StringProperty image;			// Image of the object (convert with Base64)
            private StringProperty country;			// Country of the object
            private StringProperty contact;			// Description of method for contact the owner
            private StringProperty date;				// Date of post/update
            private StringProperty lifeTime;			// LifeTime of the object (at the end of this, the object is delete)
            private StringProperty type;
            
            public Item(){
                        this.itemKey = new SimpleStringProperty(null);
                        this.friendlyNick = new SimpleStringProperty(null);
                        this.title = new SimpleStringProperty(null);
                        this.category = new SimpleStringProperty(null);
                        this.description = new SimpleStringProperty(null);
                        this.image = new SimpleStringProperty(null);
                        this.country = new SimpleStringProperty(null);
                        this.contact = new SimpleStringProperty(null);
                        this.date = new SimpleStringProperty(null);
                        this.lifeTime = new SimpleStringProperty(null);
                        this.type = new SimpleStringProperty(null);
            }
            public Item(model.data.item.Item item){
                        this.itemKey = new SimpleStringProperty(item.getItemKey());
                        this.friendlyNick = new SimpleStringProperty(item.getFriendNick());
                        this.title = new SimpleStringProperty(item.getTitle());
                        this.category = new SimpleStringProperty(item.getCategory().getStringChoice());
                        this.description = new SimpleStringProperty(item.getDescription());
                        this.image = new SimpleStringProperty(item.getImage());
                        this.country = new SimpleStringProperty(item.getCountry());
                        this.contact = new SimpleStringProperty(item.getContact());
                        this.date = new SimpleStringProperty(DateConverter.getString(item.getDate()));
                        this.lifeTime = new SimpleStringProperty(DateConverter.getString(item.getLifeTime()));
                        this.type = new SimpleStringProperty(item.getType().toString());
                        
                        
            }
            
             /**
             * @return the itemKey
             */
            public String getItemKey() {
                        return itemKey.get();
            }

            /**
             * @param itemKey the itemKey to set
             */
            public void setItemKey(String itemKey) {
                        this.itemKey.set(itemKey);
            }
            
            /**
             * @return the itemKeyProperty
             */
            public StringProperty itemKeyProperty() {
                        return itemKey;
            }

            /**
             * @return the friendlyNick
             */
            public String getFriendlyNick() {
                        return friendlyNick.get();
            }

            /**
             * @param friendlyNick the friendlyNick to set
             */
            public void setFriendlyNick(String friendlyNick) {
                        this.friendlyNick.set(friendlyNick);
            }
            
            /**
             * @return the friendlyNickProperty
             */
            public StringProperty friendlyNickProperty() {
                        return friendlyNick;
            }

            /**
             * @return the title
             */
            public String getTitle() {
                        return title.get();
            }

            /**
             * @param title the title to set
             */
            public void setTitle(String title) {
                        this.title.set(title);
            }
            
            /**
             * @return the titleProperty
             */
            public StringProperty titleProperty() {
                        return title;
            }

            /**
             * @return the category
             */
            public String getCategory() {
                        return category.get();
            }

            /**
             * @param category the category to set
             */
            public void setCategory(String category) {
                        this.category.set(category);
            }
            
            /**
             * @return the categoryProperty
             */
            public StringProperty categoryProperty() {
                        return category;
            }

            /**
             * @return the description
             */
            public String getDescription() {
                        return description.get();
            }

            /**
             * @param description the description to set
             */
            public void setDescription(String description) {
                        this.description.set(description);
            }
            
            /**
             * @return the descriptionProperty
             */
            public StringProperty descriptionProperty() {
                        return description;
            }

            /**
             * @return the image
             */
            public String getImage() {
                        return image.get();
            }

            /**
             * @param image the image to set
             */
            public void setImage(String image) {
                        this.image.set(image);
            }
            
            /**
             * @return the image
             */
            public StringProperty imageProperty() {
                        return image;
            }

            /**
             * @return the country
             */
            public String getCountry() {
                        return country.get();
            }

            /**
             * @param country the country to set
             */
            public void setCountry(String country) {
                        this.country.set(country);
            }
            
             /**
             * @return the country
             */
            public StringProperty countryProperty() {
                        return country;
            }

            /**
             * @return the contact
             */
            public String getContact() {
                        return contact.get();
            }

            /**
             * @param contact the contact to set
             */
            public void setContact(String contact) {
                        this.contact.set(contact);
            }
            
            /**
             * @return the contact
             */
            public StringProperty contactProperty() {
                        return contact;
            }

            /**
             * @return the date
             */
            public String getDate() {
                        return date.get();
            }

            /**
             * @param date the date to set
             */
            public void setDate(String date) {
                        this.date.set(date);
            }
            
             /**
             * @return the date property
             */
            public StringProperty dateProperty() {
                        return date;
            }

            /**
             * @return the lifeTime
             */
            public String getLifeTime() {
                        return lifeTime.get();
            }

            /**
             * @param lifeTime the lifeTime to set
             */
            public void setLifeTime(String lifeTime) {
                        this.lifeTime.set(lifeTime);
            }
            
            /**
             * @return the lifeTime
             */
            public StringProperty lifeTimeProperty() {
                        return lifeTime;
            }

            /**
             * @return the type
             */
            public String getType() {
                        return type.get();
            }

            /**
             * @param type the type to set
             */
            public void setType(String type) {
                        this.type.set(type);
            }
            
            /**
             * @return the type property
             */
            public StringProperty typeProperty() {
                        return type;
            }
            
            
}
