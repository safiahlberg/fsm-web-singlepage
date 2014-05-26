/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wixia.state;

import com.wixia.toolbox.fsm.FiniteStateMachine;

/**
 *
 * @author safi
 */
@FiniteStateMachine(states = {
    Shift000.class,
    Shift001.class,
    Shift010.class,
    Shift011.class,
    Shift100.class,
    Shift101.class,
    Shift110.class,
    Shift111.class},
        initialState = Shift000.class)
public interface WebState {

    void shiftOne();

    void shiftZero();
    
    String getPage();
}
