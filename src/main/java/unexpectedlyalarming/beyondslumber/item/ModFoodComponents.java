package unexpectedlyalarming.beyondslumber.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {

    public static final FoodComponent SHEPHERDS_PIE = new FoodComponent.Builder().hunger(10).saturationModifier(0.9F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 1), 1.0F).build();
}
