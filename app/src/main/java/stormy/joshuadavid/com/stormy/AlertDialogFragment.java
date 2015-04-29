package stormy.joshuadavid.com.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by joshuadavid on 4/29/15.
 */
public class AlertDialogFragment extends DialogFragment {

    // Overriding a method

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(context))
                .setTitle("Opps! Sorry!")
                .setMessage("There was an error. Please try again!")
                .setPositiveButton("OK", null);

        // Create Alert Dialog
        AlertDialog dialog = builder.create();
        return dialog;

        // String Resources

    }


}
