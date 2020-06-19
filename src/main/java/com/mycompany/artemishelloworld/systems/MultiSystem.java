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
import com.mycompany.artemishelloworld.components.CountComponent;


@All({Goodbye.class, Hello.class, CountComponent.class})
public class MultiSystem extends IteratingSystem {

    protected ComponentMapper<Hello> mHello;
    protected ComponentMapper<Goodbye> mGoodbye;
    protected ComponentMapper<CountComponent> mCount;

    @Override
    protected void process(int i) {
        System.out.println("MultiSystem: " + i);
        mCount.get(i).data.setCount(mCount.get(i).data.getCount()+1);
        System.out.println("" + i + " Has Hello " + mHello.get(i).data.getMessage());
        System.out.println("" + i + " Has Goodbye " + mGoodbye.get(i).message);
        System.out.println("" + i + " Count = " + mCount.get(i).data.getCount());
    }

}
