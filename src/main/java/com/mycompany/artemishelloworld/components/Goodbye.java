/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.artemishelloworld.components;

import com.artemis.Component;

public class Goodbye extends Component{
    private String message;
    public void message(String message){
        this.message = message;
    }
    public String message(){ return message; }
}