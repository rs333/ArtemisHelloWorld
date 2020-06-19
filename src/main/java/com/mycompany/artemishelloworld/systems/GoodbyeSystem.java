/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.artemishelloworld.systems;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.annotations.All;
import com.artemis.annotations.One;
import com.artemis.systems.IteratingSystem;
import com.mycompany.artemishelloworld.components.CountComponent;
import com.mycompany.artemishelloworld.components.Goodbye;
import com.mycompany.artemishelloworld.components.Hello;


@One({Goodbye.class,Hello.class})
public class GoodbyeSystem extends IteratingSystem {
    protected ComponentMapper<Hello> mHello;
    protected ComponentMapper<Goodbye> mGoodbye;
     
    
    @Override
    protected void process(int i) {
        System.out.println("GoodbyeSystem: " + i );
        if( mHello.has(i) ){
            System.out.println("" + i + " Has Hello " + mHello.get(i).data.getMessage() );
        }else{
             world.edit(i).create(Hello.class).data.setMessage("Adding one last Hello.");
             world.edit(i).create(CountComponent.class).data.setCount(0).setId(i);
        }
         if( mGoodbye.has(i) ){
            System.out.println("" + i + " Has Goodbye " + mGoodbye.get(i).message );
           
        }
        
    }
    
}
