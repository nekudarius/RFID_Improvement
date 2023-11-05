package com.rubic.rfidimprovement.base.util.listener;

import android.view.View;

import androidx.fragment.app.DialogFragment;

public abstract class OnDialogButtonClick {
    public abstract void onRightButtonClick(DialogFragment dialog, View view);
    public abstract void onLeftButtonClick(DialogFragment dialog, View view);
}
