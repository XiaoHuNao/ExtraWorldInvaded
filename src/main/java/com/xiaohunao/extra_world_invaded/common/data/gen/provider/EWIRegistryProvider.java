package com.xiaohunao.extra_world_invaded.common.data.gen.provider;

import com.xiaohunao.extra_world_invaded.ExtraWorldInvaded;
import com.xiaohunao.extra_world_invaded.common.init.EWIMoments;
import com.xiaohunao.extra_world_invaded.common.init.EWIStructureSets;
import com.xiaohunao.extra_world_invaded.common.init.EWIStructures;
import com.xiaohunao.heaven_destiny_moment.common.init.HDMRegistries;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class EWIRegistryProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder REGISTRY_SET_BUILDER = new RegistrySetBuilder()
            .add(HDMRegistries.Keys.MOMENT, EWIMoments::bootstrap);
//            .add(Registries.STRUCTURE, EWIStructures::bootstrap)
//            .add(Registries.STRUCTURE_SET, EWIStructureSets::bootstrap);

    public EWIRegistryProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, REGISTRY_SET_BUILDER, Set.of(ExtraWorldInvaded.MODID, "minecraft"));
    }
}
