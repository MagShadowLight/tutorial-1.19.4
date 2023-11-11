//package stuff.network;
//
//import io.netty.buffer.Unpooled;
//import net.fabricmc.fabric.api.network.PacketContext;
//import net.minecraft.entity.effect.StatusEffect;
//import net.minecraft.entity.effect.StatusEffects;
//import net.minecraft.network.PacketByteBuf;
//import net.minecraft.network.packet.s2c.play.CustomPayloadS2CPacket;
//import net.minecraft.server.network.ServerPlayerEntity;
//import net.minecraft.util.Identifier;
//
//import java.util.UUID;
//public class EnderGauntletPacket {
//    public static final Identifier PACKET_ID = new Identifier("tutorial", "ender_gauntlet");
//
//    public static CustomPayloadS2CPacket createPacket(UUID playerUUID, StatusEffect statusEffect, int duration) {
//        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
//        buf.writeUuid(playerUUID);
//        buf.writeInt(StatusEffect.getRawId(statusEffect));
//        buf.writeInt(duration);
//        return new CustomPayloadS2CPacket(PACKET_ID, buf);
//    }
//
//    public static void sendEffectUpdate(ServerPlayerEntity player, StatusEffect statusEffect, int duration) {
//        player.networkHandler.sendPacket(createPacket(player.getUuid(), statusEffect, duration));
//    }
//
//    public static void handlePacket(PacketContext context, PacketByteBuf buffer) {
//        UUID playerUUID = buffer.readUuid();
//        int rawID = buffer.readInt();
//        int duration = buffer.readInt();
//
//        context.getTaskQueue().execute(() -> {
//            ServerPlayerEntity player = (ServerPlayerEntity) context.getPlayer();
//            player.removeStatusEffect(StatusEffect.byRawId(rawID));
//
//            sendEffectUpdate(player, StatusEffects.REGENERATION, 0);
//        });
//
//        ;
//    }
//
//
//
//}
