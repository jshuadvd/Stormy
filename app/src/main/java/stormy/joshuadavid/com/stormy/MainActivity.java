package stormy.joshuadavid.com.stormy;

import android.app.FragmentManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.nfc.Tag;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;


public class MainActivity extends ActionBarActivity {

    // Defining the "TAG" to Log the exception
    public static final String TAG = MainActivity.class.getSimpleName();

    // Declaring the new Data Model Object
    private CurrentWeather mCurrentWeather;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String apiKey = "d4582e37a190726ee8741a4f27a81e3c";
        double latitude = 37.8267;
        double longitude = -122.423;
        String forecastUrl = "https://api.forecast.io/forecast/" + apiKey + "/" + latitude +  "," + longitude;


        if (isNetworkAvailable()) {


            // Main client object
            OkHttpClient client = new OkHttpClient();

            // Request for client to send to the server
            Request request = new Request.Builder()
                    .url(forecastUrl)
                    .build();

            Call call = client.newCall(request);
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Request request, IOException e) {

                }

                @Override
                public void onResponse(Response response) throws IOException {
                    try {
                        // Check if the request is successful

                        Log.v(TAG, response.body().string());

                        if (response.isSuccessful()) {

                        } else {
                            alertUserAboutError();
                        }
                    } catch (IOException e) {
                        Log.e(TAG, "Exception caught: ", e);
                    }
                }
            });
        }
        else {
            Toast.makeText(this, getString(R.string.network_unavailable_message), Toast.LENGTH_LONG).show();

        }
        Log.d(TAG, "Main UI code is running!");
    }

    private boolean isNetworkAvailable() {

        ConnectivityManager manager = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        // Instantiate a Network Info Object
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        boolean isAvailable = false;
        if (networkInfo != null && networkInfo.isConnected()) {

            isAvailable = true;

        }

        return isAvailable;

    }

    private void alertUserAboutError() {
        // Using the AlertDialog Object I created in the AlertDialog Fragment Class
        AlertDialogFragment dialog = new AlertDialogFragment();
        dialog.show(getFragmentManager(), "error_dialog");
    }

}
