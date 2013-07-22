package org.Offit.inventory;

import org.Offit.block.BrewingStand;


public enum BrewerInventory {
	
	public interface BrewerInventory extends Inventory {
	   
	    ItemStack getIngredient();
	   
	    void setIngredient(ItemStack ingredient);

	    BrewingStand getHolder();
	}
	

}
