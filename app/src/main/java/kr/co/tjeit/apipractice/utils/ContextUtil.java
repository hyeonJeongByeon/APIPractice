package kr.co.tjeit.apipractice.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class ContextUtil {

    private static final String prefName = "PracticePref";

    private static final String TOKEN = "TOKEN";

    public static void setToken(Context context , String serverToken) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

        pref.edit().putString(TOKEN, serverToken).apply();

    }

    public static String getToken(Context context) {

        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

        return pref.getString(TOKEN, "");


    }

}
