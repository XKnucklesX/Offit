package org.Offit.block;

import org.Offit.inventory.Inventory;

public class Chest {
	
	public interface Chest extends BlockState, ContainerBlock {
	   
	    Inventory getBlockInventory();
	}

}
