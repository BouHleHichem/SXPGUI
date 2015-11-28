/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.util;

/**
 *
 * @author yassine
 */
public class Verification {
            public  static String dateConverter(String dateValue){
                         String dateValue1= dateValue.split("/")[0];
                        String dateValue2= dateValue.split("/")[1];
                        String dateValue3= dateValue.split("/")[2];
                        return dateValue1+"-"+dateValue2+"-"+dateValue3;
                        }
            }
