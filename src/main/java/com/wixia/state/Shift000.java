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
public class Shift000 extends AbstractWebState {

    @Transition(newState = Shift100.class)
    public void shiftOne() {        
    }

    public void shiftZero() {        
    }
    
}