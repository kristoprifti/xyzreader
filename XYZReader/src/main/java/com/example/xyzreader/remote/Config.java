package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

class Config {
    static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://nspf.github.io/XYZReader/data.json");
        } catch (MalformedURLException ignored) {
            try {
                throw new MalformedURLException(ignored.getMessage());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        BASE_URL = url;
    }
}
