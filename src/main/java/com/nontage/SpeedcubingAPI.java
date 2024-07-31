package com.nontage;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SpeedcubingAPI {
    private final static String API_URL = "https://api.speedcubing.top/player?uuid=";
    private final String uuid;
    private boolean hasResponse = false;
    private General general;
    private MlgRush mlgRush;
    private Reduce reduce;
    private KnockbackFFA knockbackFFA;
    private FastBuilder fastBuilder;

    public SpeedcubingAPI(String uuid) {
        this.uuid = uuid;
        fetchData();
    }
    private void fetchData() {
        try {
            URL url = new URL(API_URL + uuid);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                hasResponse = true;
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                String json = response.toString();
                Gson gson = new Gson();
                ApiResponse apiResponse = gson.fromJson(json, ApiResponse.class);
                if (apiResponse.success) {
                    Result result = apiResponse.result;
                    general = new General(result.name, result.guild, result.avgping, result.firstlogin, result.lastlogin, result.discord, result.priority, result.lang, result.playtime, result.profile_textures_value, result.profile_textures_signature);
                    mlgRush = new MlgRush(result.mlgrush_stick, result.mlgrush_pickaxe, result.mlgrush_block, result.mlgrush_stickskin, result.mlgrush_blockskin, result.mlgrush_autoreset, result.mlgrush_hitdelay, result.mlgrush_falldamage, result.mlgrush_autoremove, result.mlgrush_oldkb);
                    reduce = new Reduce(result.reduce_stick, result.reduce_setting, result.reduce_reach, result.reduce_ver, result.reduce_hor, result.reduce_vanilla_reach, result.reduce_vanilla_hor, result.reduce_block, result.reduce_stickskin, result.reduce_blockskin, result.reduce_npcstick, result.reduce_spec, result.reduce_allowspec, result.reduce_npccolor, result.reduce_npcsound, result.reduce_npcswing, result.reduce_vanilla);
                    knockbackFFA = new KnockbackFFA(result.kbffa_invenotry, result.kbffa_kill, result.kbffa_death, result.kbffa_killstreak, result.kbffa_dailykill, result.kbffa_blockplace, result.kbffa_blockbreak);
                    fastBuilder = new FastBuilder(result.fb_0_pb, result.fb_1_pb, result.fb_2_pb, result.fb_3_pb, result.fb_4_pb, result.fb_5_pb, result.fb_6_pb, result.fb_blockplace, result.fastbuild_blockskin, result.fastbuild_falldelay, result.fastbuild_animation);
                } else {
                    System.out.println("Player not found");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean hasResponse() {
        return hasResponse;
    }

    public General getGeneral() {
        return general;
    }

    public MlgRush getMlgRush() {
        return mlgRush;
    }

    public Reduce getReduce() {
        return reduce;
    }

    public KnockbackFFA getKnockbackFFA() {
        return knockbackFFA;
    }

    public FastBuilder getFastBuilder() {
        return fastBuilder;
    }
}
