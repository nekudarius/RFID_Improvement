package com.rubic.rfidimprovement.feature.common.dialog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.rubic.rfidimprovement.base.util.listener.OnDialogOneButtonClick;
import com.rubic.rfidimprovement.databinding.DialogConfirmationOneButtonBinding;

import java.util.Objects;

public class ConfirmationDialogOneButton extends DialogFragment {

    public OnDialogOneButtonClick onDialogOneButtonClick;
    DialogConfirmationOneButtonBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setStyle(STYLE_NO_TITLE, 0);

        Objects.requireNonNull(getDialog()).getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        getDialog().setCanceledOnTouchOutside(false);
        getDialog().setCancelable(false);
        getDialog().getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        try {
            getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        } catch (Exception e) {
            e.printStackTrace();
        }

        binding = DialogConfirmationOneButtonBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.tvTitle.setText(title);
        binding.description.setText(description);
        binding.btDialogLogoutYes.setText(rightButtonText);
        binding.btDialogLogoutYes.setOnClickListener(v -> {
            onDialogOneButtonClick.onButtonClick(ConfirmationDialogOneButton.this, this.getView());
            dismiss();
        });
    }

    public static ConfirmationDialogOneButton newInstance(String title, String description, String rightButtonText) {
        return new ConfirmationDialogOneButton(title, description, rightButtonText);
    }

    private ConfirmationDialogOneButton(String title, String description, String rightButtonText) {
        this.title = title;
        this.description = description;
        this.rightButtonText = rightButtonText;
    }

    private final String title;
    private final String description;
    private final String rightButtonText;
}
