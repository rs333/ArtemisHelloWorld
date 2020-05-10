/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.artemishelloworld.components;

import com.artemis.Component;
import com.mycompany.artemishelloworld.proto.ArtemisTest.Count;

public class CountComponent extends Component {
    public Count.Builder current = Count.newBuilder();
    public Count.Builder last = Count.newBuilder();
    public Count.Builder temp;
    public void swap(){
       temp = last;
       last = current;
       current = temp;
    }
}
