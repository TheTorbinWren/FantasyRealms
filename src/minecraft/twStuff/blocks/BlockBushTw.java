package twStuff.blocks;

import static net.minecraftforge.common.EnumPlantType.Cave;
import static net.minecraftforge.common.EnumPlantType.Crop;
import static net.minecraftforge.common.EnumPlantType.Desert;
import static net.minecraftforge.common.EnumPlantType.Nether;
import static net.minecraftforge.common.EnumPlantType.Plains;
import static net.minecraftforge.common.EnumPlantType.Water;

import java.util.ArrayList;
import java.util.Random;

import twStuff.twStuff;
import twStuff.items.ItemTw;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IShearable;

public class BlockBushTw extends BlockFlowerTw implements IShearable {

	protected BlockBushTw (int id, int texture, Material material) {
		super (id, texture, material);
		
		setBlockName("twBush");
		setHardness(0.2F);
		setLightOpacity(1);
		setStepSound(Block.soundGrassFootstep);
		setTickRandomly(true);
		float bound = 0.075f;
		this.setBlockBounds(0.5F - bound, 0.0F, 0.5F - bound, 0.5F + bound, 0.35F, 0.5F + bound);
		setCreativeTab(CreativeTabs.tabDecorations);
		
		this.disableStats();
		this.setRequiresSelfNotify();
		
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, "Berry Bush");
	}
	
	public void updateTick(World world, int x, int y, int z, Random random){
		super.updateTick(world, x, y, z, random);
		
		if (world.getBlockLightValue(x, y+1, z) >= 9){
			int i = world.getBlockMetadata(x, y, z);
			
			if (i<2){
				if (random.nextInt(20) == 0){
					i++;
					world.setBlockMetadataWithNotify(x, y, z, i);
				}
			}
			
		}
	}
	
	public int idDropped(int metadata, Random random, int par2){
		if (metadata == 2){
			return ItemTw.berries.shiftedIndex;
		}
		else{
			return 0;
		}
	}

	public int quantityDropped(Random par1Random){
        return 1 + par1Random.nextInt(2);
    }
	
	public int getRenderType(){
		return 1;
	}
	
	public int getBlockTextureFromSideAndMetadata(int par1, int meta){
		switch(meta)
		{
		case 0: return 0;
		case 1: return 1;
		case 2: return 2;
		default: return 0;
		}
	}
	
    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4){
    	switch (par1IBlockAccess.getBlockMetadata(par2, par3, par4))
    	{
    	case 0:
    		float bound = 0.075f;
    		this.setBlockBounds(0.5F - bound, 0.0F, 0.5F - bound, 0.5F + bound, 0.35F, 0.5F + bound);
    		break;
    	default:
            float var3 = 0.4F;
            this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.8F, 0.5F + var3);
    	}
    }
    
    public void fertalize(World world, int x, int y, int z){
    	world.setBlockMetadataWithNotify(x, y, z, 2);
    }
    
    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        return Plains;
    }

    @Override
    public boolean isShearable(ItemStack item, World world, int x, int y, int z) 
    {
        return true;
    }

    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, World world, int x, int y, int z, int fortune) 
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 3));
        return ret;
    }


}
