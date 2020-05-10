package com.mycompany.artemishelloworld.components;


import com.mycompany.artemishelloworld.proto.*;
import com.artemis.Component;
import com.mycompany.artemishelloworld.proto.ArtemisTest.HelloWorld;

public class Hello extends Component {
    private HelloWorld.Builder message_current = HelloWorld.newBuilder();
    
    private HelloWorld.Builder message_last = HelloWorld.newBuilder();
    private HelloWorld.Builder delta = HelloWorld.newBuilder();
    private HelloWorld.Builder swapper;
   
    public void message(String message){
       delta.clearMessage();
       delta.setMessage(message);
    }
    public String message(){ return message_current.getMessage(); }
    
    public void swap(){
      swapper = message_last;
      message_last = message_current;
      message_current = message_last;
    }
}
