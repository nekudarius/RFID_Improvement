package com.rubic.rfidimprovement.feature.common.dialog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.rubic.rfidimprovement.base.util.listener.OnDialogButtonClick;
import com.rubic.rfidimprovement.databinding.DialogConfirmationBinding;

import java.util.Objects;

public class ConfirmationDialog extends DialogFragment {

    public OnDialogButtonClick onDialogButtonClick;
    DialogConfirmationBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setStyle(STYLE_NO_TITLE, 0);

        Objects.requireNonNull(getDialog()).getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        getDialog().setCanceledOnTouchOutside(false);
        getDialog().setCancelable(false);
        try {
            getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        } catch (Exception e) {
            e.printStackTrace();
        }

        binding = DialogConfirmationBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.tvTitle.setText(title);
        binding.description.setText(description);
        binding.btDialogLogoutYes.setText(rightButtonText);
        binding.btDialogLogoutNo.setText(leftButtonText);
        binding.btDialogLogoutYes.setOnClickListener(v -> {
            onDialogButtonClick.onRightButtonClick(ConfirmationDialog.this, this.getView());
            dismiss();
        });
        binding.btDialogLogoutNo.setOnClickListener(v -> {
            onDialogButtonClick.onLeftButtonClick(ConfirmationDialog.this, this.getView());
            dismiss();
        });
    }

    public static ConfirmationDialog newInstance(String title, String description, String rightButtonText, String leftButtonText) {
        return new ConfirmationDialog(title, description, rightButtonText, leftButtonText);
    }

    private ConfirmationDialog(String title, String description, String rightButtonText, String leftButtonString) {
        this.title = title;
        this.description = description;
        this.rightButtonText = rightButtonText;
        this.leftButtonText = leftButtonString;
    }

    private final String title;
    private final String description;
    private final String rightButtonText;
    private final String leftButtonText;
}
