package map;

import android.os.Bundle;
import org.apache.cordova.*;

public class app extends CordovaActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        //super.loadUrl(Config.getStartUrl());

       // super.setIntegerProperty("splashscreen", R.drawable.splashscr);
        super.loadUrl("file:///android_asset/www/index.html", 5000);
        ///.......,...sddkkkkld
    }
}

