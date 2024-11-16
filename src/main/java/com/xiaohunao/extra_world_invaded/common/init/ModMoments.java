package com.xiaohunao.extra_world_invaded.common.init;

import com.xiaohunao.heaven_destiny_moment.HeavenDestinyMoment;
import com.xiaohunao.heaven_destiny_moment.common.context.ClientSettingsContext;
import com.xiaohunao.heaven_destiny_moment.common.context.MomentDataContext;
import com.xiaohunao.heaven_destiny_moment.common.context.TipSettingsContext;
import com.xiaohunao.heaven_destiny_moment.common.context.attachable.CommonAttachable;
import com.xiaohunao.heaven_destiny_moment.common.context.entity_info.EntityInfoContext;
import com.xiaohunao.heaven_destiny_moment.common.context.equippable_slot.VanillaEquippableSlot;
import com.xiaohunao.heaven_destiny_moment.common.init.MomentRegistries;
import com.xiaohunao.heaven_destiny_moment.common.moment.Moment;
import com.xiaohunao.heaven_destiny_moment.common.moment.area.LocationArea;
import com.xiaohunao.heaven_destiny_moment.common.moment.moment.DefaultMoment;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Items;

public class ModMoments {
    public static final ResourceKey<Moment> PIGLIN_LEGION = HeavenDestinyMoment.asResourceKey(MomentRegistries.Keys.MOMENT, "piglin_legion");


    public static void bootstrap(BootstrapContext<Moment> context) {
        context.register(PIGLIN_LEGION,new DefaultMoment(
                HeavenDestinyMoment.asResource("default"),
                LocationArea.EMPTY,
                new MomentDataContext.Builder()
                        .addEntity(
                                new EntityInfoContext.Builder(EntityType.PIGLIN,4,5).build()
                        )
                        .addEntity(
                                new EntityInfoContext.Builder(EntityType.PIGLIN,4,5).build(),
                                new EntityInfoContext.Builder(EntityType.HOGLIN,2,3).build()
                        )
                        .addEntity(
                                new EntityInfoContext.Builder(EntityType.PIGLIN,4,5).build(),
                                new EntityInfoContext.Builder(EntityType.HOGLIN,1,2).build(),
                                new EntityInfoContext.Builder(EntityType.MAGMA_CUBE,1,2).build()
                        )
                        .addEntity(
                                new EntityInfoContext.Builder(EntityType.PIGLIN,4,5).build(),
                                new EntityInfoContext.Builder(EntityType.HOGLIN,3,4).build(),
                                new EntityInfoContext.Builder(EntityType.MAGMA_CUBE,2,3).build(),
                                new EntityInfoContext.Builder(EntityType.BLAZE,1).build()
                        )
                        .addEntity(
                                new EntityInfoContext.Builder(EntityType.PIGLIN,5,6).build(),
                                new EntityInfoContext.Builder(EntityType.HOGLIN,4,5).build(),
                                new EntityInfoContext.Builder(EntityType.MAGMA_CUBE,3,4).build(),
                                new EntityInfoContext.Builder(EntityType.BLAZE,2,3).build()
                        )
                        .addEntity(
                                new EntityInfoContext.Builder(EntityType.PIGLIN,5,6)
                                        .addAttachable(
                                                new CommonAttachable.Builder()
                                                    .addEquipment(VanillaEquippableSlot.of(EquipmentSlot.HEAD), Items.DIAMOND_HELMET.getDefaultInstance())
                                                    .build()
                                        ).build(),
                                new EntityInfoContext.Builder(EntityType.HOGLIN,4,5).build(),
                                new EntityInfoContext.Builder(EntityType.MAGMA_CUBE,3,4).build(),
                                new EntityInfoContext.Builder(EntityType.BLAZE,2,3).build()
                        )
                        .addEntity()
                        .build(),
                TipSettingsContext.EMPTY,
                ClientSettingsContext.EMPTY
        ));
    }
}
