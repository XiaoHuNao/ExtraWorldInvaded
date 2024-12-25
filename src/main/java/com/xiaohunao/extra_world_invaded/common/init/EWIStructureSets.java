package com.xiaohunao.extra_world_invaded.common.init;

import com.xiaohunao.extra_world_invaded.ExtraWorldInvaded;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadStructurePlacement;
import net.minecraft.world.level.levelgen.structure.placement.RandomSpreadType;

public class EWIStructureSets {
    public static final ResourceKey<StructureSet> PIGLIN_LEGION_PORTAL = ExtraWorldInvaded.asResourceKey(Registries.STRUCTURE_SET,"piglin_legion_portal");

    public static void bootstrap(BootstrapContext<StructureSet> context) {
        context.register(PIGLIN_LEGION_PORTAL, new StructureSet(context.lookup(Registries.STRUCTURE).getOrThrow(EWIStructures.PIGLIN_LEGION_PORTAL),
                new RandomSpreadStructurePlacement(100, 40, RandomSpreadType.LINEAR, 1629143766)));

    }
}