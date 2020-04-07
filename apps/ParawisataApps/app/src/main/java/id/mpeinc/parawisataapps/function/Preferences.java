package id.mpeinc.parawisataapps.function;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {

    static final String KEY_USER_TEREGISTER = "username_ref";
    static final String KEY_PASS_TEREGISTER = "password_ref";

    static final String KEY_USERNAME_IS_LOGIN = "username_loggedin";
    static final String KEY_STATUS_IS_LOGIN = "status_username_loggedin";

    private static SharedPreferences getSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    // TODO 1: Preferensi untuk User Register
    public static void setRegisteredUser(Context context, String username) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(KEY_USER_TEREGISTER, username);
        editor.apply();
    }

    public static String getRegisteredUser(Context context) {
        return getSharedPreferences(context).getString(KEY_USER_TEREGISTER, "");
    }

    // TODO 2: Preferensi untuk Password user yang sudah Teregister
    public static void setRegisteredPass(Context context, String password) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(KEY_PASS_TEREGISTER, password);
        editor.apply();
    }

    public static String getRegisteredPass(Context context) {
        return getSharedPreferences(context).getString(KEY_PASS_TEREGISTER, "");
    }

    // TODO 3: Preferensi untuk Posisi User yang Sedang Login
    public static void setLoggedInUser(Context context, String username) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(KEY_USERNAME_IS_LOGIN, username);
        editor.apply();
    }

    public static String getLoggedInUser(Context context) {
        return getSharedPreferences(context).getString(KEY_USERNAME_IS_LOGIN, "");
    }

    // TODO 5: Preferensi untuk Status User yang Sedang Login
    public static void setLoggedInUserStatus(Context context, boolean status) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putBoolean(KEY_STATUS_IS_LOGIN, status);
        editor.apply();
    }

    public static boolean getLoggedInUserStatus(Context context) {
        return getSharedPreferences(context).getBoolean(KEY_STATUS_IS_LOGIN, false);
    }

    // TODO 6: Clear Preferensi Login (Logout)
    public static void clearLoggedInuser(Context context) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.remove(KEY_USERNAME_IS_LOGIN);
        editor.remove(KEY_STATUS_IS_LOGIN);
        editor.apply();
    }


}
