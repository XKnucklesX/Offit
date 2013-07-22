package org.Offit.block;

public interface Block extends Metadatable {

  
    byte getData();

   
    Block getRelative(int modX, int modY, int modZ);

   
    Block getRelative(BlockFace face);

    
    Block getRelative(BlockFace face, int distance);

   
    Material getType();

   
    int getTypeId();

   
    byte getLightLevel();

    
    byte getLightFromSky();

    byte getLightFromBlocks();

    
    World getWorld();

    
    int getX();

   
    int getY();

    
    int getZ();

    
    Location getLocation();

    
    Location getLocation(Location loc);

    
    Chunk getChunk();

    
    void setData(byte data);

   
    void setData(byte data, boolean applyPhysics);

    
    void setType(Material type);

    boolean setTypeId(int type);

    
    boolean setTypeId(int type, boolean applyPhysics);

    
    boolean setTypeIdAndData(int type, byte data, boolean applyPhysics);

   
    BlockFace getFace(Block block);

    
    BlockState getState();

  
    Biome getBiome();

   
    void setBiome(Biome bio);

    
    boolean isBlockPowered();

  
    boolean isBlockIndirectlyPowered();

    
    boolean isBlockFacePowered(BlockFace face);

   
    boolean isBlockFaceIndirectlyPowered(BlockFace face);

   
    int getBlockPower(BlockFace face);

   
    int getBlockPower();

   
    boolean isEmpty();

    
    boolean isLiquid();

   
    double getTemperature();

    
    double getHumidity();

   
    PistonMoveReaction getPistonMoveReaction();

   
    boolean breakNaturally();

  
    boolean breakNaturally(ItemStack tool);

    
    Collection<ItemStack> getDrops();

    
    Collection<ItemStack> getDrops(ItemStack tool);

}
