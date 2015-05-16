package stormy.joshuadavid.com.stormy.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import stormy.joshuadavid.com.stormy.R;

/**
 * Created by joshuadavid on 5/1/15.
 */
public class Current {

    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimezone;


    // Getters and Setters

    public String getIcon() {

        return mIcon;
    }

    public void setIcon(String icon) {

        mIcon = icon;
    }

    public int getIconId() {

        return Forecast.getIconId(mIcon);
    }


    public long getTime() {

        return mTime;
    }

    public String getFormattedTime() {

        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);

        return timeString;
    }

    public void setTime(long time) {

        mTime = time;
    }

    public int getTemperature() {
        return (int)Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {

        mTemperature = temperature;
    }

    public double getHumidity() {
        return  mHumidity;
    }

    public void setHumidity(double humidity) {

        mHumidity = humidity;
    }

    public int getPrecipChance() {
        Double precipPercentage = mPrecipChance * 100;
        return (int)Math.round(precipPercentage);
    }

    public void setPrecipChance(double precipChance) {

        mPrecipChance = precipChance;
    }

    public String getSummary() {

        return mSummary;
    }

    public void setSummary(String summary) {

        mSummary = summary;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }
}
