package unexpectedlyalarming.beyondslumber.item.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;


public class PogoStickItem extends Item {


    public PogoStickItem(Settings settings) {

        super(settings);




    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient()) {
            PlayerEntity player = context.getPlayer();
            Block block = context.getWorld().getBlockState(context.getBlockPos()).getBlock();

            if (!player.isTouchingWater() && player.groundCollision) {
                player.setVelocity(player.getVelocity().x, 1, player.getVelocity().z);
                player.velocityModified = true;




                context.getStack().damage(1, player, (p) -> {
                    p.sendToolBreakStatus(player.getActiveHand());
                });

                player.getItemCooldownManager().set(this, 100);




            }

        }
        return ActionResult.SUCCESS;
    }


}
