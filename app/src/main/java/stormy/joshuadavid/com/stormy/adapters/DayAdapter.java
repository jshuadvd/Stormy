package stormy.joshuadavid.com.stormy.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

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
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
