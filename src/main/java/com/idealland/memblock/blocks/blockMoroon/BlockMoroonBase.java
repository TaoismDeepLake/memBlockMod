package com.idealland.memblock.blocks.blockMoroon;

import com.idealland.memblock.blocks.BlockBase;
import net.minecraft.block.material.Material;

public class BlockMoroonBase extends BlockBase {
    public BlockMoroonBase(String name, Material material) {
        super(name, material);
        setResistance(1.0F);
    }
}
