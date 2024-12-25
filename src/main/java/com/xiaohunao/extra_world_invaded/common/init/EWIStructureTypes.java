package com.xiaohunao.extra_world_invaded.common.init;

import com.xiaohunao.extra_world_invaded.ExtraWorldInvaded;
import com.xiaohunao.extra_world_invaded.common.worldgen.structure.PiglinLegionPortalStructure;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EWIStructureTypes {
    public static final DeferredRegister<StructureType<?>> STRUCTURE_TYPE = DeferredRegister.create(Registries.STRUCTURE_TYPE, ExtraWorldInvaded.MODID);

    public static final DeferredHolder<StructureType<?>, StructureType<PiglinLegionPortalStructure>> PIGLIN_LEGION_PORTAL = STRUCTURE_TYPE.register("piglin_legion_portal", () -> () -> PiglinLegionPortalStructure.CODEC);
}
