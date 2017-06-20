package com.example.xyzreader.remote;

import android.text.Html;
import android.text.Spanned;

/**
 * Created by k.prifti on 20.6.2017 г..
 */

public class Util {
    @SuppressWarnings("deprecation")
    public static Spanned fromHtml(String html) {
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}
