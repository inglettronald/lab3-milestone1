package com.cs407.lab3_milestone1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder result = new AlertDialog.Builder(getActivity())
                .setTitle("Information")
                .setMessage("This is a Dialogue message.")
                .setPositiveButton("ok", (dialogInterface, i) -> {});
        return result.create();
    }
}
