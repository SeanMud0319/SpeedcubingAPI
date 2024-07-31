package com.nontage;

public class Clutch {
    private final int clutch_blockskin;
    private final long clutch_normal_hits;
    private final long clutch_inclined_hits;
    private final int clutch_normal_ver;
    private final int clutch_inclined_ver;
    private final int clutch_normal_hitdelay;
    private final int clutch_inclined_hitdelay;

    public Clutch(int clutchBlockskin, long clutchNormalHits, long clutchInclinedHits, int clutchNormalVer, int clutchInclinedVer, int clutchNormalHitdelay, int clutchInclinedHitdelay) {
        clutch_blockskin = clutchBlockskin;
        clutch_normal_hits = clutchNormalHits;
        clutch_inclined_hits = clutchInclinedHits;
        clutch_normal_ver = clutchNormalVer;
        clutch_inclined_ver = clutchInclinedVer;
        clutch_normal_hitdelay = clutchNormalHitdelay;
        clutch_inclined_hitdelay = clutchInclinedHitdelay;
    }

    public int getClutch_blockskin() {
        return clutch_blockskin;
    }

    public int getClutch_inclined_hitdelay() {
        return clutch_inclined_hitdelay;
    }

    public int getClutch_inclined_ver() {
        return clutch_inclined_ver;
    }

    public int getClutch_normal_hitdelay() {
        return clutch_normal_hitdelay;
    }

    public int getClutch_normal_ver() {
        return clutch_normal_ver;
    }

    public long getClutch_inclined_hits() {
        return clutch_inclined_hits;
    }

    public long getClutch_normal_hits() {
        return clutch_normal_hits;
    }
}
