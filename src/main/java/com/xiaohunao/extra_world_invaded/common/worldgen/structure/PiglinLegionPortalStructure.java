package com.xiaohunao.extra_world_invaded.common.worldgen.structure;

import com.mojang.serialization.MapCodec;
import com.xiaohunao.extra_world_invaded.ExtraWorldInvaded;
import com.xiaohunao.extra_world_invaded.common.init.EWIStructureTypes;
import com.xiaohunao.extra_world_invaded.common.worldgen.structure.piece.PiglinLegionPortalPiece;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class PiglinLegionPortalStructure extends Structure {
    public static final MapCodec<PiglinLegionPortalStructure> CODEC = simpleCodec(PiglinLegionPortalStructure::new);

    public PiglinLegionPortalStructure(StructureSettings settings) {
        super(settings);
    }

    @Override
    @NotNull
    protected Optional<GenerationStub> findGenerationPoint(@NotNull GenerationContext context) {
        return onTopOfChunkCenter(context, Heightmap.Types.WORLD_SURFACE_WG, (pieces) -> {
            ChunkPos chunk = context.chunkPos();
            WorldgenRandom rand = context.random();
            int x = chunk.getMinBlockX();
            int z = chunk.getMinBlockZ();
            int y = context.chunkGenerator().getFirstOccupiedHeight(
                    x, z, Heightmap.Types.WORLD_SURFACE_WG,
                    context.heightAccessor(), context.randomState());
            BlockPos pos = new BlockPos(x, y, z);
            Rotation rotation = Rotation.getRandom(rand);
            pieces.addPiece(new PiglinLegionPortalPiece(context.structureTemplateManager(),ExtraWorldInvaded.asResource("piglin_legion_portal"), rotation, pos));
        });
    }

    @Override
    @NotNull
    public StructureType<?> type() {
        return EWIStructureTypes.PIGLIN_LEGION_PORTAL.get();
    }
}
