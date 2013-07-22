package org.Offit.block;

import org.Offit.Chunk;
import org.Offit.Location;
import org.Offit.Material;
import org.Offit.World;
import org.Offit.material.MaterialData;
import org.Offit.metadata.Metadatable;


	
	public interface BlockState extends Metadatable {

	  
	    Block getBlock();

	    MaterialData getData();

	 
	    Material getType();

	   
	    int getTypeId();

	  
	    byte getLightLevel();

	
	    World getWorld();

	 
	    int getX();

	    int getY();

	  	    int getZ();

	   
	    Location getLocation();

	   
	    Location getLocation(Location loc);

	   
	    Chunk getChunk();

	    
	    void setData(MaterialData data);

	   
	    void setType(Material type);

	  
	    boolean setTypeId(int type);

	   
	    boolean update();

	    
	    boolean update(boolean force);

	 
	    boolean update(boolean force, boolean applyPhysics);

	   
	    public byte getRawData();

	   
	    public void setRawData(byte data);
	}


}
