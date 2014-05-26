/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wixia.state;

import com.wixia.toolbox.fsm.Transition;

/**
 *
 * @author safi
 */
public class Shift011  extends AbstractWebState {
    
    @Transition(newState = Shift101.class)
    public void shiftOne() {        
    }

    @Transition(newState = Shift001.class)
    public void shiftZero() {        
    }
    
}