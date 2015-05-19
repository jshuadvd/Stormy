package stormy.joshuadavid.com.stormy.ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import stormy.joshuadavid.com.stormy.R;
import stormy.joshuadavid.com.stormy.weather.Hour;

public class HourlyForecastActivity extends ActionBarActivity {

    private Hour[] mHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);
    }

}
