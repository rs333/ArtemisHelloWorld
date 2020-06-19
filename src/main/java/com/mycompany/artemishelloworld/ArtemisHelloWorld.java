package com.mycompany.artemishelloworld;


import com.mycompany.artemishelloworld.systems.HelloSystem;
import com.mycompany.artemishelloworld.components.Hello;
import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.mycompany.artemishelloworld.components.Input;
import com.mycompany.artemishelloworld.systems.CountSystem;
import com.mycompany.artemishelloworld.systems.GoodbyeSystem;
import com.mycompany.artemishelloworld.systems.MultiSystem;

public class ArtemisHelloWorld {
     public static void main( String[] args ) {

        // 1. Register any plugins, setup the world.
        WorldConfiguration setup = new WorldConfigurationBuilder()
                .with(new CountSystem())
                .with(new HelloSystem())
                .with(new GoodbyeSystem())
                .with(new MultiSystem())
                .build();

        // 2. Create the world.
        World world = new World(setup);

        // 3. Create entity. You can do it here or inside systems.
        int entityId = world.create();
        world.edit(entityId).create(Input.class).input=( -1);
        world.edit(entityId).getEntity().getComponent(Input.class).count = 0;
        entityId = world.create();
        world.edit(entityId).create(Hello.class).data.setMessage("Hello-world!");

        // 4. Run the world. HelloWorldSystem should print the hello world message.
        for(int i=0; i<10000; i++)
        world.process();
    }
    
}
