package com.xiaohunao.extra_world_invaded.common.init;

import com.xiaohunao.extra_world_invaded.ExtraWorldInvaded;
import com.xiaohunao.extra_world_invaded.common.worldgen.structure.piece.PiglinLegionPortalPiece;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;



public class EWIStructurePieceTypes {
    public static final DeferredRegister<StructurePieceType> STRUCTURE_PIECE = DeferredRegister.create(Registries.STRUCTURE_PIECE, ExtraWorldInvaded.MODID);

    public static final DeferredHolder<StructurePieceType, StructurePieceType.StructureTemplateType> PIGLIN_LEGION_PORTAL = STRUCTURE_PIECE.register("piglin_legion_portal", () -> PiglinLegionPortalPiece::new);
}
