package stormy.joshuadavid.com.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import stormy.joshuadavid.com.stormy.R;

/**
 * Created by joshuadavid on 4/29/15.
 */
public class AlertDialogFragment extends DialogFragment {

    // Overriding a method

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.error_title))
                .setMessage(context.getString(R.string.error_message))
                .setPositiveButton(context.getString(R.string.error_ok_button_text), null);

        // Create Alert Dialog
        AlertDialog dialog = builder.create();
        return dialog;

        // String Resources

    }




}
