package org.Offit.block;


import org.Offit.inventory.BrewerInventory;


public interface BrewingStand extends BlockState, ContainerBlock {

    
    int getBrewingTime();

    
    void setBrewingTime(int brewTime);

    public BrewerInventory getInventory();
}
