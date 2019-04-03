package com.example.homework332changelanguage;

import android.app.Activity;
import android.content.Intent;

public class Utils
{
    private static int sTheme;
    public final static int THEME_GREEN = 0;
    public final static int THEME_BLACK = 1;
    public final static int THEME_BLUE = 2;
    public final static int THEME_BIG = 3;
    public final static int THEME_MEDIUM = 4;
    public final static int THEME_SMALL = 5;
    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }
    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case THEME_GREEN:
                activity.setTheme(R.style.FirstTheme);
                break;
            case THEME_BLACK:
                activity.setTheme(R.style.SecondTheme);
                break;
            case THEME_BLUE:
                activity.setTheme(R.style.ThirdTheme);
                break;
            case THEME_BIG:
                activity.setTheme(R.style.Margin1);
                break;
            case THEME_MEDIUM:
                activity.setTheme(R.style.Margin2);
                break;
            case THEME_SMALL:
                activity.setTheme(R.style.Margin3);
                break;
        }
    }
}
