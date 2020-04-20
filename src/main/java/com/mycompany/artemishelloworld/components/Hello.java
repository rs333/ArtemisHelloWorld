package com.mycompany.artemishelloworld.components;


import com.artemis.Component;

public class Hello extends Component {
    private String message;
    public void message(String message){
        this.message = message;
    }
    public String message(){ return message; }
}
