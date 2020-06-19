package com.mycompany.artemishelloworld.components;


import com.mycompany.artemishelloworld.proto.*;
import com.artemis.Component;
import com.mycompany.artemishelloworld.proto.ArtemisTest.HelloWorld;

public class Hello extends Component {
    public HelloWorld.Builder data = HelloWorld.newBuilder();
}
