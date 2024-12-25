package com.xiaohunao.extra_world_invaded.common.worldgen.structure.piece;

import com.mojang.serialization.Dynamic;
import com.xiaohunao.extra_world_invaded.common.init.EWIStructurePieceTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.structures.RuinedPortalPiece;
import net.minecraft.world.level.levelgen.structure.templatesystem.*;

import java.util.function.Function;

public class PiglinLegionPortalPiece extends TemplateStructurePiece {
    public PiglinLegionPortalPiece(StructureTemplateManager manager, ResourceLocation location, Rotation rotation, BlockPos blockPos) {
        super(EWIStructurePieceTypes.PIGLIN_LEGION_PORTAL.get(), 0, manager, location, location.toString(), makeSettings(),blockPos);
    }

    public PiglinLegionPortalPiece(StructureTemplateManager templateManagerIn, CompoundTag tag) {
        super(EWIStructurePieceTypes.PIGLIN_LEGION_PORTAL.get(), tag, templateManagerIn, (location) -> makeSettings());
    }

    public PiglinLegionPortalPiece(StructurePieceSerializationContext context, CompoundTag tag) {
        this(context.structureTemplateManager(), tag);
    }


    @Override
    protected void handleDataMarker(String name, BlockPos blockPos, ServerLevelAccessor serverLevelAccessor, RandomSource randomSource, BoundingBox boundingBox) {

    }

    private static StructurePlaceSettings makeSettings() {
        return (new StructurePlaceSettings());
    }

}
