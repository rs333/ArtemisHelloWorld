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
import com.mycompany.artemishelloworld.components.Goodbye;
import com.mycompany.artemishelloworld.components.Hello;


@All({Goodbye.class, Hello.class})
public class MultiSystem extends IteratingSystem {

    protected ComponentMapper<Hello> mHello;
    protected ComponentMapper<Goodbye> mGoodbye;

    @Override
    protected void process(int i) {
        System.out.println("MultiSystem: " + i);

        System.out.println("" + i + " Has Hello " + mHello.get(i).message());
        System.out.println("" + i + " Has Goodbye " + mGoodbye.get(i).message());

    }

}
