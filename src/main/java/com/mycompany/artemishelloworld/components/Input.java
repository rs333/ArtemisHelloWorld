/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.artemishelloworld.components;

import com.artemis.Component;

public class Input extends Component{
    private int input;
    public int count;
    public void input(int message){
        this.input = message;
    }
    public int input(){ return input; }
}
