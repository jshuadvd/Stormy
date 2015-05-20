package stormy.joshuadavid.com.stormy.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import stormy.joshuadavid.com.stormy.R;

/**
 * Created by joshuadavid on 5/19/15.
 */
public class HourAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HourViewHolder extends RecyclerView.ViewHolder<HourViewHolder> {

        public TextView mTimeLabel;
        public TextView mSummaryLabel;
        public TextView mTemperatureLabel;
        public ImageView mIconImageView;

        public HourViewHolder(View itemView) {
            super(itemView);

            mTimeLabel (TextView) itemView.findViewById(R.id.timeLabel);
            mSummaryLabel (TextView) itemView.findViewById(R.id.summaryLabel);
            mTemperatureLabel (TextView) itemView.findViewById(R.id.temperatureLabel);
            mIconImageView (ImageView) itemView.findViewById((R.id.iconImageView));
        }
    }

}
