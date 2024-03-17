package thaumicenergistics.api;

import appeng.api.definitions.IItemDefinition;
import net.minecraft.item.Item;

/**
 * Contains functions that return the Item Definition for each item in Thaumic Energistics
 *
 * @author BrockWS
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IThEItems {


    // Cells

    IItemDefinition essentiaCell1k();

    IItemDefinition essentiaCell4k();

    IItemDefinition essentiaCell16k();

    IItemDefinition essentiaCell64k();

    IItemDefinition essentiaCell256k();

    IItemDefinition essentiaCell1024k();

    IItemDefinition essentiaCell4096k();

    IItemDefinition essentiaCell16384k();

    IItemDefinition essentiaCell65536k();

    IItemDefinition essentiaCell262144k();

    IItemDefinition essentiaCell1048576k();




















    IItemDefinition essentiaCellCreative();

    // Parts

    IItemDefinition essentiaImportBus();

    IItemDefinition essentiaExportBus();

    IItemDefinition essentiaStorageBus();

    IItemDefinition essentiaTerminal();

    IItemDefinition arcaneTerminal();

    IItemDefinition arcaneInscriber();

    // Materials

    IItemDefinition diffusionCore();

    IItemDefinition coalescenceCore();

    IItemDefinition AdvEssentiaCellCasing();

    IItemDefinition primalIngot();

    IItemDefinition essentiaComponent1k();

    IItemDefinition essentiaComponent4k();

    IItemDefinition essentiaComponent16k();

    IItemDefinition essentiaComponent64k();

    IItemDefinition essentiaComponent256k();

    IItemDefinition essentiaComponent1024k();

    IItemDefinition essentiaComponent4096k();

    IItemDefinition essentiaComponent16384k();

    IItemDefinition essentiaComponent65536k();

    IItemDefinition essentiaComponent262144k();

    IItemDefinition essentiaComponent1048576k();

















    IItemDefinition upgradeArcane();

    IItemDefinition knowledgeCore();

    IItemDefinition blankKnowledgeCore();

    // Other

    IItemDefinition dummyAspect();
}
