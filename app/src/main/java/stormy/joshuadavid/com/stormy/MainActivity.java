package stormy.joshuadavid.com.stormy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String apiKey = "d4582e37a190726ee8741a4f27a81e3c";
    double latitude = 37.8267;
    double longitude = -122.423;
    String forecastUrl = "https://api.forecast.io/forecast/" + apiKey + "/" + latitude +  "," + longitude;




}
