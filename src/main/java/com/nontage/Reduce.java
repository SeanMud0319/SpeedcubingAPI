package com.nontage;

public class Reduce {
    private final int reduce_stick;
    private final int reduce_setting;
    private final int reduce_reach;
    private final int reduce_ver;
    private final int reduce_hor;
    private final int reduce_vanilla_reach;
    private final int reduce_vanilla_hor;
    private final int reduce_block;
    private final int reduce_stickskin;
    private final int reduce_blockskin;
    private final int reduce_npcstick;
    private final int reduce_spec;
    private final int reduce_allowspec;
    private final int reduce_npccolor;
    private final int reduce_npcsound;
    private final int reduce_npcswing;
    private final int reduce_vanilla;

    public Reduce(int reduceStick, int reduceSetting, int reduceReach, int reduceVer, int reduceHor, int reduceVanillaReach, int reduceVanillaHor, int reduceBlock, int reduceStickskin, int reduceBlockskin, int reduceNpcstick, int reduceSpec, int reduceAllowspec, int reduceNpccolor, int reduceNpcsound, int reduceNpcswing, int reduceVanilla) {
        reduce_stick = reduceStick;
        reduce_setting = reduceSetting;
        reduce_reach = reduceReach;
        reduce_ver = reduceVer;
        reduce_hor = reduceHor;
        reduce_vanilla_reach = reduceVanillaReach;
        reduce_vanilla_hor = reduceVanillaHor;
        reduce_block = reduceBlock;
        reduce_stickskin = reduceStickskin;
        reduce_blockskin = reduceBlockskin;
        reduce_npcstick = reduceNpcstick;
        reduce_spec = reduceSpec;
        reduce_allowspec = reduceAllowspec;
        reduce_npccolor = reduceNpccolor;
        reduce_npcsound = reduceNpcsound;
        reduce_npcswing = reduceNpcswing;
        reduce_vanilla = reduceVanilla;
    }

    public boolean isReduce_allowspec() {
        return reduce_allowspec == 1;
    }

    public boolean isReduce_npccolor() {
        return reduce_npccolor == 1;
    }

    public boolean isReduce_npcsound() {
        return reduce_npcsound == 1;
    }

    public boolean isReduce_npcswing() {
        return reduce_npcswing == 1;
    }

    public boolean isReduce_vanilla() {
        return reduce_vanilla == 1;
    }

    public int getReduce_block() {
        return reduce_block;
    }

    public int getReduce_blockskin() {
        return reduce_blockskin;
    }

    public int getReduce_hor() {
        return reduce_hor;
    }

    public int getReduce_npcstick() {
        return reduce_npcstick;
    }

    public int getReduce_reach() {
        return reduce_reach;
    }

    public int getReduce_setting() {
        return reduce_setting;
    }

    public int getReduce_spec() {
        return reduce_spec;
    }

    public int getReduce_stick() {
        return reduce_stick;
    }

    public int getReduce_stickskin() {
        return reduce_stickskin;
    }

    public int getReduce_vanilla_hor() {
        return reduce_vanilla_hor;
    }

    public int getReduce_vanilla_reach() {
        return reduce_vanilla_reach;
    }

    public int getReduce_ver() {
        return reduce_ver;
    }
}
