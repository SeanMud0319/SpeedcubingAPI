package com.nontage;

public class MlgRush {
    private final int mlgrush_stick;
    private final int mlgrush_pickaxe;
    private final int mlgrush_block;
    private final int mlgrush_stickskin;
    private final int mlgrush_blockskin;
    private final int mlgrush_autoreset;
    private final int mlgrush_hitdelay;
    private final int mlgrush_falldamage;
    private final int mlgrush_autoremove;
    private final int mlgrush_oldkb;

    public MlgRush(int mlgrushStick, int mlgrushPickaxe, int mlgrushBlock, int mlgrushStickskin, int mlgrushBlockskin, int mlgrushAutoreset, int mlgrushHitdelay, int mlgrushFalldamage, int mlgrushAutoremove, int mlgrushOldkb) {
        mlgrush_stick = mlgrushStick;
        mlgrush_pickaxe = mlgrushPickaxe;
        mlgrush_block = mlgrushBlock;
        mlgrush_stickskin = mlgrushStickskin;
        mlgrush_blockskin = mlgrushBlockskin;
        mlgrush_autoreset = mlgrushAutoreset;
        mlgrush_hitdelay = mlgrushHitdelay;
        mlgrush_falldamage = mlgrushFalldamage;
        mlgrush_autoremove = mlgrushAutoremove;
        mlgrush_oldkb = mlgrushOldkb;
    }

    public boolean isMlgrush_autoremove() {
        return mlgrush_autoremove == 1;
    }

    public boolean isMlgrush_autoreset() {
        return mlgrush_autoreset == 1;
    }

    public boolean isMlgrush_falldamage() {
        return mlgrush_falldamage == 1;
    }

    public boolean isMlgrush_oldkb() {
        return mlgrush_oldkb == 1;
    }

    public int getMlgrush_block() {
        return mlgrush_block;
    }

    public int getMlgrush_blockskin() {
        return mlgrush_blockskin;
    }

    public int getMlgrush_hitdelay() {
        return mlgrush_hitdelay;
    }

    public int getMlgrush_pickaxe() {
        return mlgrush_pickaxe;
    }

    public int getMlgrush_stick() {
        return mlgrush_stick;
    }

    public int getMlgrush_stickskin() {
        return mlgrush_stickskin;
    }
}
