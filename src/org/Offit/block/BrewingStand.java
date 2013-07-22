package org.Offit.block;

import org.Offit.inventory.BrewerInventory;

/**
 * Represents a brewing stand.
 */
public interface BrewingStand extends BlockState, ContainerBlock {

    /**
     * How much time is left in the brewing cycle
     *
     * @return Brew Time
     */
    int getBrewingTime();

    /**
     * Set the time left before brewing completes.
     *
     * @param brewTime Brewing time
     */
    void setBrewingTime(int brewTime);

    public BrewerInventory getInventory();
}
