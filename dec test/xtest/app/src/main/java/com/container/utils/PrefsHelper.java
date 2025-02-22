package com.container.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class PrefsHelper {
    private static final String PREFS_NAME = "RedXPrefs";
    private static final String KEY_FIRST_RUN = "first_run";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_EXPIRY_TIME = "expiry_time";
    private static final String KEY_SELECTED_GAME = "selected_game";
    private static final String KEY_TOKEN = "token";
    private static final String KEY_AIMBOT = "aimbot";
    private static final String KEY_BULLET = "bullet";
    private static final String KEY_MEMORY = "memory";
    private static final String KEY_MOD_NAME = "mod_name";

    private static final String KEY_MOD_AUTO = "key_auto";
    private static final String KEY_MOD_YOUTUBE = "key_youtube";

    private final SharedPreferences prefs;

    public PrefsHelper(Context context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public boolean isFirstRun() {
        return prefs.getBoolean(KEY_FIRST_RUN, true);
    }

    public void setFirstRun(boolean isFirstRun) {
        prefs.edit().putBoolean(KEY_FIRST_RUN, isFirstRun).apply();
    }

    public String getUsername() {
        return prefs.getString(KEY_USERNAME, null);
    }

    public void setUsername(String username) {
        prefs.edit().putString(KEY_USERNAME, username).apply();
    }

    public long getExpiryTime() {
        return prefs.getLong(KEY_EXPIRY_TIME, 0);
    }

    public void setExpiryTime(long expiryTime) {
        prefs.edit().putLong(KEY_EXPIRY_TIME, expiryTime).apply();
    }

    public void setExpiryTime(String expiryTime) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long timestamp = sdf.parse(expiryTime).getTime();
            prefs.edit().putLong(KEY_EXPIRY_TIME, timestamp).apply();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean hasExpired() {
        long expiryTime = getExpiryTime();
        return expiryTime != 0 && System.currentTimeMillis() > expiryTime;
    }

    public long getRemainingTime() {
        long expiryTime = getExpiryTime();
        if (expiryTime == 0) return 0;
        return Math.max(0, expiryTime - System.currentTimeMillis());
    }

    public void setSelectedGame(String packageName) {
        prefs.edit().putString(KEY_SELECTED_GAME, packageName).apply();
    }

    public String getSelectedGame() {
        return prefs.getString(KEY_SELECTED_GAME, "");
    }
    public void setSelectedGameLib(String packageName) {
        prefs.edit().putString(KEY_SELECTED_GAME+"LIB", packageName).apply();
    }
    public String getSelectedGameLib() {
        return prefs.getString(KEY_SELECTED_GAME+"LIB", "");
    }
    public void setToken(String token) {
        prefs.edit().putString(KEY_TOKEN, token).apply();
    }

    public String getToken() {
        return prefs.getString(KEY_TOKEN, "");
    }

    public void setFeatures(boolean aimbot, boolean bullet, boolean memory) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(KEY_AIMBOT, aimbot);
        editor.putBoolean(KEY_BULLET, bullet);
        editor.putBoolean(KEY_MEMORY, memory);
        editor.apply();
    }

    public boolean isAimbotEnabled() {
        return prefs.getBoolean(KEY_AIMBOT, false);
    }

    public void setAimbotEnabled(boolean enabled) {
        prefs.edit().putBoolean(KEY_AIMBOT, enabled).apply();
    }

    public boolean isBulletEnabled() {
        return prefs.getBoolean(KEY_BULLET, false);
    }

    public void setBulletEnabled(boolean enabled) {
        prefs.edit().putBoolean(KEY_BULLET, enabled).apply();
    }

    public boolean isMemoryEnabled() {
        return prefs.getBoolean(KEY_MEMORY, false);
    }

    public void setMemoryEnabled(boolean enabled) {
        prefs.edit().putBoolean(KEY_MEMORY, enabled).apply();
    }

    public String getModName() {
        return prefs.getString(KEY_MOD_NAME, "");
    }

    public void setModName(String modName) {
        prefs.edit().putString(KEY_MOD_NAME, modName).apply();
    }

    public void setExpiry(String expiryTime) {
        setExpiryTime(expiryTime);
    }



    public Boolean Auto() {
        return prefs.getBoolean(KEY_MOD_AUTO, false);
    }

    public void AutoSet(Boolean x) {
        prefs.edit().putBoolean(KEY_MOD_AUTO, x).apply();
    }

    public boolean Youtube() {
        return prefs.getBoolean(KEY_MOD_YOUTUBE, false);
    }

    public void YoutubeSet(Boolean x) {
        prefs.edit().putBoolean(KEY_MOD_YOUTUBE, x).apply();
    }

}
