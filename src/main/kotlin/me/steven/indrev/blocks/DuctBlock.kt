package me.steven.indrev.blocks

import net.minecraft.block.BlockState
import net.minecraft.block.ShapeContext
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView

class DuctBlock(settings: Settings) : HorizontalFacingBlock(settings) {
    override fun getOutlineShape(
        state: BlockState,
        world: BlockView?,
        pos: BlockPos?,
        context: ShapeContext?
    ): VoxelShape = when (state[FACING]) {
        Direction.NORTH -> FACING_NORTH
        Direction.SOUTH -> FACING_SOUTH
        Direction.WEST -> FACING_WEST
        Direction.EAST -> FACING_EAST
        else -> FACING_NORTH
    }
    companion object {
        val FACING_SOUTH = createCuboidShape(2.0, 0.0, 0.0, 14.0, 14.0, 14.0)
        val FACING_NORTH = createCuboidShape(2.0, 0.0, 2.0, 14.0, 14.0, 16.0)
        val FACING_EAST = createCuboidShape(0.0, 0.0, 2.0, 14.0, 14.0, 14.0)
        val FACING_WEST = createCuboidShape(2.0, 0.0, 2.0, 16.0, 14.0, 14.0)
    }
}