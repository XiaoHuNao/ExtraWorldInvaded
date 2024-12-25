package com.xiaohunao.extra_world_invaded.common.init;

import com.xiaohunao.extra_world_invaded.ExtraWorldInvaded;
import com.xiaohunao.extra_world_invaded.common.worldgen.structure.PiglinLegionPortalStructure;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.TerrainAdjustment;

import java.util.Map;

public class EWIStructures {
    public static final ResourceKey<Structure> PIGLIN_LEGION_PORTAL = ExtraWorldInvaded.asResourceKey(Registries.STRUCTURE,"piglin_legion_portal");

    public static void bootstrap(BootstrapContext<Structure> context) {

        context.register(PIGLIN_LEGION_PORTAL, new PiglinLegionPortalStructure(new Structure.StructureSettings(
                context.lookup(Registries.BIOME).getOrThrow(BiomeTags.ALLOWS_SURFACE_SLIME_SPAWNS), Map.of(),
                GenerationStep.Decoration.SURFACE_STRUCTURES, TerrainAdjustment.NONE))
        );
    }
}
