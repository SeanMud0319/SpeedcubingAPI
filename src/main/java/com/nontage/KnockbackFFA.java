package com.nontage;

public class KnockbackFFA {
    private final int kbffa_inventory;
    private final int kbffa_kill;
    private final int kbffa_death;
    private final int kbffa_killstreak;
    private final int kbffa_dailykill;
    private final int kbffa_blockplace;
    private final int kbffa_blockbreak;

    public KnockbackFFA(int kbffaInventory, int kbffaKill, int kbffaDeath, int kbffaKillstreak, int kbffaDailykill, int kbffaBlockplace, int kbffaBlockbreak) {
        kbffa_inventory = kbffaInventory;
        kbffa_kill = kbffaKill;
        kbffa_death = kbffaDeath;
        kbffa_killstreak = kbffaKillstreak;
        kbffa_dailykill = kbffaDailykill;
        kbffa_blockplace = kbffaBlockplace;
        kbffa_blockbreak = kbffaBlockbreak;
    }

    public int getBlockBreak() {
        return kbffa_blockbreak;
    }

    public int getBlockPlace() {
        return kbffa_blockplace;
    }

    public int getDailyKill() {
        return kbffa_dailykill;
    }

    public int getDeath() {
        return kbffa_death;
    }

    public int getInventory() {
        return kbffa_inventory;
    }

    public int getKill() {
        return kbffa_kill;
    }

    public int getKillStreak() {
        return kbffa_killstreak;
    }
}
