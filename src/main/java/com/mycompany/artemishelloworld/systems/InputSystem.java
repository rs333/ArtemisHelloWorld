package com.mycompany.artemishelloworld.systems;

import com.mycompany.artemishelloworld.components.Hello;
import com.artemis.ComponentMapper;
import com.artemis.annotations.All;
import com.artemis.annotations.Exclude;
import com.artemis.annotations.One;
import com.artemis.systems.IteratingSystem;
import com.mycompany.artemishelloworld.components.Goodbye;
import com.mycompany.artemishelloworld.components.Input;


@One({Hello.class})
@Exclude(Goodbye.class)
public class InputSystem extends IteratingSystem {

    protected ComponentMapper<Hello> mHello;
    protected ComponentMapper<Input> mInput;

    @Override
    protected void process(int id) {
        System.out.println("HelloSystem: " + id);
        System.out.println("" + id + " Has " + mHello.get(id).message());

        if (world.getEntity(0).getComponent(Input.class).count == 1) {
            int entityId = world.create();
            world.edit(entityId).create(Goodbye.class).message("Get ready to say goodbye world!");
        }
    }
}
