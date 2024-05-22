package thaumicenergistics.tile.generators.ic2energygen.visgenerator;


import net.minecraft.util.ITickable;
import ic2.api.energy.prefab.BasicSource;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.common.lib.events.EssentiaHandler;
import thaumicenergistics.tile.TileBase;


public class TileICvisGeneratorBase extends TileBase implements ITickable {

public BasicSource energy












    @Override
    public void update() {
        energy.update();
        if (tick > 0)
            tick--;

        if (tick == 0) {
            createEnergy();
            tick = 120;
        }

    }
}
