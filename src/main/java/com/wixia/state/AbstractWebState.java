/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wixia.state;

/**
 *
 * @author safi
 */
public abstract class AbstractWebState implements WebState {    

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
   
   @Override
   public String getPage() {
       return this.toString().toLowerCase().concat(".xhtml");
   }
}
