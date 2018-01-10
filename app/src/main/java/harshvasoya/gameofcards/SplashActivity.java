package harshvasoya.gameofcards;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity{

    private final int SPLASH_DISPLAY_LENGTH = 4000;
    private static boolean splashLoaded = false;

    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);

        if(!splashLoaded){
            setContentView(R.layout.activity_splash_screen);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                    SplashActivity.this.startActivity(mainIntent);
                    SplashActivity.this.finish();
                }
            }, SPLASH_DISPLAY_LENGTH);
            splashLoaded = true;
        }

        else{
            Intent goToMainActivity = new Intent(SplashActivity.this,MainActivity.class);
            goToMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(goToMainActivity);
            finish();
        }
    }
}
