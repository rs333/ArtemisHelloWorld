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
import com.mycompany.artemishelloworld.components.Input;


@All({Input.class})
public class CountSystem extends IteratingSystem {

    protected ComponentMapper<Input> mInput;

    @Override
    protected void process(int i) {
        System.out.println("CountSystem: " + i);
        mInput.get(i).count++;
        System.out.println("*** Loop " + mInput.get(i).count + " *********************************");
    }

}
