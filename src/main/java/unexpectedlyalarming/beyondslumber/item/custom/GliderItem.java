package unexpectedlyalarming.beyondslumber.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class GliderItem extends Item {



    public GliderItem(Settings settings) {

        super(settings);




    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {



        return TypedActionResult.success(user.getStackInHand(hand));
    }


    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        if (!world.isClient) {
            if (selected && entity instanceof PlayerEntity) {
                performGlide(world, (PlayerEntity) entity);
            }
        }
    }

    private boolean isOnGround(World world, PlayerEntity player) {
        BlockPos downPos = player.getBlockPos().down();
        BlockState blockState = world.getBlockState(downPos);

        return blockState.isSolidBlock(world, downPos);
    }

    private void performGlide(World world, PlayerEntity user) {

        boolean isGoingDownwards = user.getVelocity().y < -0.05;
        boolean willBeGoingUpwards = user.getVelocity().y + 0.05 > 0;
        boolean isGliding = isGoingDownwards && !user.isSneaking() && !user.isTouchingWater() && !isOnGround(world, user) && !willBeGoingUpwards;



        if (isGliding) {
            user.addVelocity(0, .05, 0);
            user.velocityModified = true;


        }

    }
}
