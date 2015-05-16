package stormy.joshuadavid.com.stormy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import stormy.joshuadavid.com.stormy.R;
import stormy.joshuadavid.com.stormy.weather.Day;

/**
 * Created by joshuadavid on 5/15/15.
 */
public class DayAdapter extends BaseAdapter {

    private Context mContext;
    private Day[] mDays;

    // creating a constructor that allows us to add Context and Day
    public DayAdapter(Context context, Day[] days)
    {
        // setting the member variables
        mContext = context;
        mDays = days;
    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int position) {
        return mDays[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null)
        {
            // brand new and need to create everything
            convertView = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);
            // initialize the Holder variable
            holder = new ViewHolder();
            holder.iconImageView = (ImageView) convertView.findViewById(R.id.iconImageView);
            holder.temperatureLabel = (TextView) convertView.findViewById(R.id.temperatureLabel);
            holder.dayLabel = (TextView) convertView.findViewById(R.id.dayNameLabel);

            convertView.setTag(holder);
        }

        else
        {
            holder  = (ViewHolder) convertView.getTag();
        }

        Day day = mDays[position];

        // Setting the data

        holder.iconImageView.setImageResource(day.getIconId());
        holder.temperatureLabel.setText(day.getTemperatureMax() + "");
        holder.dayLabel.setText(day.getDayOfTheWeek);

        return null;
    }

    private static class ViewHolder {
        ImageView iconImageView;
        TextView temperatureLabel;
        TextView dayLabel;
    }
}
