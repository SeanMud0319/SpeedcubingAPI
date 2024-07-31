package com.nontage;

public class General {
    private final String name;
    private final String guild;
    private final int avgping;
    private final long firstlogin;
    private final long lastlogin;
    private final String discord;
    private final String priority;
    private final int lang;
    private final long playtime;
    private final String profile_textures_value;
    private final String profile_textures_signature;

    public General(String name, String guild, int avgping, long firstlogin, long lastlogin, String discord, String priority, int lang, long playtime, String profileTexturesValue, String profileTexturesSignature) {
        this.name = name;
        this.guild = guild;
        this.avgping = avgping;
        this.firstlogin = firstlogin;
        this.lastlogin = lastlogin;
        this.discord = discord;
        this.priority = priority;
        this.lang = lang;
        this.playtime = playtime;
        profile_textures_value = profileTexturesValue;
        profile_textures_signature = profileTexturesSignature;
    }

    public String getName() {
        return name;
    }

    public String getGuild() {
        return guild;
    }

    public int getAvgping() {
        return avgping;
    }

    public long getFirstlogin() {
        return firstlogin;
    }

    public long getLastlogin() {
        return lastlogin;
    }

    public String getDiscord() {
        return discord;
    }

    public String getRank() {
        return priority;
    }

    public int getLang() {
        return lang;
    }

    public long getPlaytime() {
        return playtime;
    }

    public String getProfile_textures_value() {
        return profile_textures_value;
    }

    public String getProfile_textures_signature() {
        return profile_textures_signature;
    }
}
