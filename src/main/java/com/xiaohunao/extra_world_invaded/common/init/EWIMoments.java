package com.xiaohunao.extra_world_invaded.common.init;

import com.xiaohunao.heaven_destiny_moment.HeavenDestinyMoment;
import com.xiaohunao.heaven_destiny_moment.common.context.attachable.CommonAttachable;
import com.xiaohunao.heaven_destiny_moment.common.context.condition.PlayerCondition;
import com.xiaohunao.heaven_destiny_moment.common.context.condition.WorldUniqueMomentCondition;
import com.xiaohunao.heaven_destiny_moment.common.context.entity_info.EntityInfo;
import com.xiaohunao.heaven_destiny_moment.common.context.equippable_slot.VanillaEquippableSlot;
import com.xiaohunao.heaven_destiny_moment.common.init.HDMBarRenderTypes;
import com.xiaohunao.heaven_destiny_moment.common.init.HDMRegistries;
import com.xiaohunao.heaven_destiny_moment.common.moment.Moment;
import com.xiaohunao.heaven_destiny_moment.common.moment.moment.DefaultMoment;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Items;

public class EWIMoments {
    public static final ResourceKey<Moment> PIGLIN_LEGION = HeavenDestinyMoment.asResourceKey(HDMRegistries.Keys.MOMENT, "piglin_legion");


    public static void bootstrap(BootstrapContext<Moment> context) {
        context.register(PIGLIN_LEGION, new DefaultMoment()
                .setBarRenderType(HDMBarRenderTypes.DEFAULT.get()).setMomentData(momentData -> momentData
//                        .entitySpawnSettings(entitySpawnSettings -> entitySpawnSettings
//                                .entitySpawnList(
//                                        new EntityInfo.Builder(EntityType.PIGLIN).amount(4, 5).build()
//                                )
//                                .entitySpawnList(
//                                        new EntityInfo.Builder(EntityType.PIGLIN).amount(4, 5).build(),
//                                        new EntityInfo.Builder(EntityType.HOGLIN).amount(2, 3).build()
//                                )
//                                .entitySpawnList(
//                                        new EntityInfo.Builder(EntityType.PIGLIN).amount(4, 5).build(),
//                                        new EntityInfo.Builder(EntityType.HOGLIN).amount(1, 2).build(),
//                                        new EntityInfo.Builder(EntityType.MAGMA_CUBE).amount(1, 2).build()
//                                )
//                                .entitySpawnList(
//                                        new EntityInfo.Builder(EntityType.PIGLIN).amount(4, 5).build(),
//                                        new EntityInfo.Builder(EntityType.HOGLIN).amount(3, 4).build(),
//                                        new EntityInfo.Builder(EntityType.MAGMA_CUBE).amount(2, 3).build(),
//                                        new EntityInfo.Builder(EntityType.BLAZE).amount(1).build()
//                                )
//                                .entitySpawnList(
//                                        new EntityInfo.Builder(EntityType.PIGLIN).amount(5, 6).build(),
//                                        new EntityInfo.Builder(EntityType.HOGLIN).amount(4, 5).build(),
//                                        new EntityInfo.Builder(EntityType.MAGMA_CUBE).amount(3, 4).build(),
//                                        new EntityInfo.Builder(EntityType.BLAZE).amount(2, 3).build()
//                                )
//                                .entitySpawnList(
//                                        new EntityInfo.Builder(EntityType.PIGLIN).amount(5, 6)
//                                                .attachable(
//                                                        new CommonAttachable.Builder()
//                                                                .addEquipment(VanillaEquippableSlot.of(EquipmentSlot.HEAD), Items.DIAMOND_HELMET.getDefaultInstance())
//                                                                .build()
//                                                ).build(),
//                                        new EntityInfo.Builder(EntityType.HOGLIN).amount(4, 5).build(),
//                                        new EntityInfo.Builder(EntityType.MAGMA_CUBE).amount(3, 4).build(),
//                                        new EntityInfo.Builder(EntityType.BLAZE).amount(2, 3).build()
//                                )
//                        )
                        .conditionGroup(group -> group
                                .create(false, WorldUniqueMomentCondition.DEFAULT)
//                                        new PlayerCondition.Builder(PlayerCondition.Type.SINGLE)
//                                                .checkAdvancementDone(ResourceLocation.withDefaultNamespace("nether/loot_bastion"),true)
//                                                .build())
                                )
                )
        );
    }
}
