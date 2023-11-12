package unexpectedlyalarming.beyondslumber.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import unexpectedlyalarming.beyondslumber.BeyondSlumber;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> SLEEPIUM_ORE_PLACED_KEY = registerKey("sleepium_ore_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, SLEEPIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SLEEPIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(50))));

    }





    public static RegistryKey<PlacedFeature> registerKey (String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BeyondSlumber.MOD_ID, name));
    }
    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<? , ?>> configuration , List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
