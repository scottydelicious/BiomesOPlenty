package tdwp_ftw.biomesop.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import tdwp_ftw.biomesop.mod_BiomesOPlenty;

public class BlockRedRockBrick extends Block
{
    public BlockRedRockBrick(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(mod_BiomesOPlenty.tabBiomesOPlenty);
    }
    
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("BiomesOPlenty:redbrick");
	}
}
