package thaumicenergistics.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import thaumicenergistics.network.PacketHandler;
import thaumicenergistics.tile.TileSuperArcaneAssembler;

/**
     * @author MilkiBlack
     */
    public class PacketSuperAssemblerGUIUpdateRequest implements IMessage {

        public TileSuperArcaneAssembler TE;

        public PacketSuperAssemblerGUIUpdateRequest() {
        }

        public PacketSuperAssemblerGUIUpdateRequest(TileSuperArcaneAssembler TE) {
            this.TE = TE;
        }

        @Override
        public void fromBytes(ByteBuf buf) {
            BlockPos pos = new BlockPos(buf.readInt(), buf.readInt(), buf.readInt());
            World world = DimensionManager.getWorld(buf.readInt());
            TileEntity tile = world.getTileEntity(pos);
            if(tile instanceof TileSuperArcaneAssembler)
                this.TE = (TileSuperArcaneAssembler) tile;
        }

        @Override
        public void toBytes(ByteBuf buf) {
            BlockPos pos = TE.getPos();
            buf.writeInt(pos.getX());
            buf.writeInt(pos.getY());
            buf.writeInt(pos.getZ());
            buf.writeInt(TE.getWorld().provider.getDimension());
        }

        public static class Handler implements IMessageHandler<thaumicenergistics.network.packets.PacketSuperAssemblerGUIUpdateRequest, IMessage> {

            @Override
            public IMessage onMessage(thaumicenergistics.network.packets.PacketSuperAssemblerGUIUpdateRequest message, MessageContext ctx) {
                FMLCommonHandler.instance().getWorldThread(ctx.netHandler).addScheduledTask(() -> {
                    if(message.TE != null)
                        PacketHandler.sendToPlayer(ctx.getServerHandler().player, new PacketSuperAssemblerGUIUpdateRequest(message.TE));
                });
                return null;
            }
        }
    }

