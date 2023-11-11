//package stuff;
//
//import net.fabricmc.fabric.api.event.server.ServerTickCallback;
//import net.minecraft.entity.player.PlayerEntity;
//
//public class CustomTickHandler {
//
//    public static void init(){
//        ServerTickCallback.EVENT.register(server -> {
//            server.getPlayerManager().getPlayerList().forEach(player -> {
//                Ender_Gauntlet.removeExpiredEffects(player);
//            });
//        });
//    }
//
//}
