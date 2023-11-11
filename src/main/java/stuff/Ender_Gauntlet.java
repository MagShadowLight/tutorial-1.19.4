package stuff;

// import the minecraft classes
import net.fabricmc.fabric.api.network.PacketContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

// import the java and other classes
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import stuff.network.EnderGauntletPacket;

// this is a Ender Gauntlet Item Class
public class Ender_Gauntlet extends Item {
    // declare and assign the string variable, "MOD_ID" to tutorial
    public static final String MOD_ID = "tutorial";
    // declare and assign the Logger variable as logger for this MOD_ID
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    // declare and assign the HashMap variable
    private static final Map<UUID, Long> itemCooldowns = new HashMap<>();
    // declare and assign the long variable
    private static final long COOLDOWN_TIME = TimeUnit.SECONDS.toMillis(50);

    public Ender_Gauntlet(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if (!world.isClient()) {
            UUID playerUUID = playerEntity.getUuid();
            long currentTime = System.currentTimeMillis();

            if (!itemCooldowns.containsKey(playerUUID) || currentTime - itemCooldowns.get(playerUUID) >= COOLDOWN_TIME) {

                // Apply the effect
                int duration = 200;
                playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, duration, 1));
                itemCooldowns.put(playerUUID, currentTime);
                LOGGER.info("Item used");
                return TypedActionResult.success(playerEntity.getStackInHand(hand));
            } else {
                LOGGER.info("Item still on cooldown");
            }
        }

        return TypedActionResult.fail(playerEntity.getStackInHand(hand));

    }

//    public static void removeExpiredEffects(PlayerEntity player) {
//        if (player.world.isClient) {
//            return;
//        }
//        if (player instanceof ServerPlayerEntity) {
//            for (StatusEffectInstance effect : player.getStatusEffects()) {
//                if (effect.getDuration() <= 0) {
//                    player.removeStatusEffect(effect.getEffectType());
//                    System.out.println("Meow");
//
//                }
//
//                    System.out.println("Meow");
//                    ServerPlayerEntity serverPlayer = (ServerPlayerEntity) player;
//                    int duration = effect.getDuration();
//                    //EnderGauntletPacket.sendEffectUpdate(serverPlayer, StatusEffects.REGENERATION, duration);
//            }
//        }
//    }
//
//    @Override
//    public void onStoppedUsing(ItemStack stack, World world, PlayerEntity player) {
//        int cooldown = getRemainingCooldown(stack);
//
//        if (cooldown > 0) {
//            // The player stopped using the item, but the cooldown is not over yet
//            // You can add a message or other behavior here
//        }
//    }
//
//    // Helper methods to get and set the cooldown in item NBT
//    private int getRemainingCooldown(ItemStack stack) {
//        CompoundTag tag = stack.getOrCreateTag();
//        return tag.contains(COOLDOWN_TAG) ? tag.getInt(COOLDOWN_TAG) : 0;
//    }
//
//    private void setCooldown(ItemStack stack, int ticks) {
//        CompoundTag tag = stack.getOrCreateTag();
//        tag.putInt(COOLDOWN_TAG, ticks);
//    }
}
