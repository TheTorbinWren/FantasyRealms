package twStuff.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

import twStuff.WorldGenDarkwood;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockDarkwoodSapling extends BlockFlowerTw {
	public BlockDarkwoodSapling (int id, int texture){
		super(id, texture, Material.plants);
		
		setBlockName("twDarkWoodSapling");
		setHardness(0.0F);
		setStepSound(soundGrassFootstep);
		float bound = 0.4f;
		this.setBlockBounds(0.5F - bound, 0.0F, 0.5F - bound, 0.5F + bound, bound * 2.0f, 0.5F + bound);
		setCreativeTab(CreativeTabs.tabDecorations);
		this.setRequiresSelfNotify();
		
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, "Darkwood Sapling");
	}
	
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if (!world.isRemote)
        {
            super.updateTick(world, x, y, z, random);

            if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(7) == 0)
            {
                int meta = world.getBlockMetadata(x, y, z);

                if ((meta & 8) == 0)
                {
                    world.setBlockMetadataWithNotify(x, y, z, meta | 8);
                }
                else
                {
                   this.grow(world, x, y, z, random);
                }
            }
        }
    }
    
    public boolean grow(World world, int x, int y, int z, Random random){
		return new WorldGenDarkwood().generate(world, random, x, y, z);
	}
}
