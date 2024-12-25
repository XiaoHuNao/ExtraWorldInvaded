package com.xiaohunao.extra_world_invaded;

import com.mojang.logging.LogUtils;
import com.xiaohunao.extra_world_invaded.common.init.EWIStructurePieceTypes;
import com.xiaohunao.extra_world_invaded.common.init.EWIStructureTypes;
import com.xiaohunao.heaven_destiny_moment.HeavenDestinyMoment;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

@Mod(ExtraWorldInvaded.MODID)
public class ExtraWorldInvaded {
    public static final String MODID = "extra_world_invaded";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ExtraWorldInvaded(IEventBus modEventBus, ModContainer modContainer) {
//        NeoForge.EVENT_BUS.register(this);

        EWIStructureTypes.STRUCTURE_TYPE.register(modEventBus);
        EWIStructurePieceTypes.STRUCTURE_PIECE.register(modEventBus);
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    public static String asDescriptionId(String path) {
        return MODID + "." + path;
    }

    public static <T> ResourceKey<T> asResourceKey(ResourceKey<? extends Registry<T>> registryKey, String path) {
        return ResourceKey.create(registryKey, HeavenDestinyMoment.asResource(path));
    }

    public static <T> ResourceKey<Registry<T>> asResourceKey(String path) {
        return ResourceKey.createRegistryKey(HeavenDestinyMoment.asResource(path));
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
