package stormy.joshuadavid.com.stormy;

import android.nfc.Tag;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;


public class MainActivity extends ActionBarActivity {

    // Defining the "TAG" to Log the exception
    public static final String TAG = MainActivity.class.getSimpleName();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String apiKey = "d4582e37a190726ee8741a4f27a81e3c";
        double latitude = 37.8267;
        double longitude = -122.423;
        String forecastUrl = "https://api.forecast.io/forecast/" + apiKey + "/" + latitude +  "," + longitude;


        // Main client object
        OkHttpClient client = new OkHttpClient();

        // Request for client to send to the server
        Request request = new Request.Builder()
                .url(forecastUrl)
                .build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();

            // Check if the request is successful
            if (response.isSuccessful()) {
                Log.v(TAG, response.body().string());
            }
        } catch (IOException e) {
            Log.e(TAG, "Exception caught: ", e);
        }
    }

}
