package com.rubic.rfidimprovement.base.util;

import androidx.fragment.app.FragmentManager;

import com.rubic.rfidimprovement.base.util.listener.OnDialogButtonClick;
import com.rubic.rfidimprovement.base.util.listener.OnDialogOneButtonClick;
import com.rubic.rfidimprovement.feature.common.dialog.ConfirmationDialog;
import com.rubic.rfidimprovement.feature.common.dialog.ConfirmationDialogOneButton;

import java.util.ArrayList;

public class DialogHelper {

    public static void setConfirmationDialog(FragmentManager fm, String title, String description, String rightButtonText, String leftButtonText, OnDialogButtonClick onDialogButtonClick) {
        ConfirmationDialog confirmationDialog = ConfirmationDialog.newInstance(title, description, rightButtonText, leftButtonText);
        confirmationDialog.onDialogButtonClick = onDialogButtonClick;
        confirmationDialog.show(fm, "confirmationDialog");
    }

    public static void setConfirmationDialogOneButton(FragmentManager fm, String title, String description, String rightButtonText, OnDialogOneButtonClick onDialogOneButtonClick) {
        ConfirmationDialogOneButton confirmationDialog = ConfirmationDialogOneButton.newInstance(title, description, rightButtonText);
        confirmationDialog.onDialogOneButtonClick = onDialogOneButtonClick;
        confirmationDialog.show(fm, "confirmationDialogOneButton");
    }

//    public static void setConfirmationDialogWithTextfield(FragmentManager fm, String title, String hintText, String buttonText, OnDialogWithTextfieldClick onDialogWithTextfieldClick) {
//        ConfirmationDialogWithTextfield confirmationDialogWithTextfield = ConfirmationDialogWithTextfield.newInstance(title, hintText, buttonText);
//        confirmationDialogWithTextfield.onDialogButtonClick = onDialogWithTextfieldClick;
//        confirmationDialogWithTextfield.show(fm, "confirmationDialogWithTextfield");
//    }
//
//    public static void setConfirmationDialogTwoButton(FragmentManager fm, String title, String rightButtonText, String leftButtonText, OnDialogButtonClick onDialogButtonClick) {
//        ConfirmationDialogTwoButton confirmationDialog = ConfirmationDialogTwoButton.newInstance(title, rightButtonText, leftButtonText);
//        confirmationDialog.onDialogButtonClick = onDialogButtonClick;
//        confirmationDialog.show(fm, "confirmationDialogWithButton");
//    }
//
//    public static void setConfirmationDialogSuccess(FragmentManager fm, String serialNumber, OnDialogButtonClick onDialogButtonClick) {
//        ConfirmationDialogSuccess confirmationDialog = ConfirmationDialogSuccess.newInstance(serialNumber);
//        confirmationDialog.onDialogButtonClick = onDialogButtonClick;
//        confirmationDialog.show(fm, "confirmationDialogSuccess");
//    }
//
//    public static void setConfirmationDialogWithoutTitle(FragmentManager fm, String description, String rightButtonText, OnDialogButtonClick onDialogButtonClick) {
//        ConfirmationDialogWithoutTitle confirmationDialog = ConfirmationDialogWithoutTitle.newInstance(description, rightButtonText);
//        confirmationDialog.onDialogButtonClick = onDialogButtonClick;
//        confirmationDialog.show(fm, "confirmationDialogWithoutTitle");
//    }
//

//
//    public static void showPICPicker(FragmentManager fm, int picNumber, BottomSheetPICFragment.OnPICResult listener) {
//        BottomSheetPICFragment picPicker = BottomSheetPICFragment.newInstance(picNumber);
//        picPicker.listener = listener;
//        picPicker.show(fm, "pic_dialog");
//    }
//
//    public static void showConditionPrinter(FragmentManager fm, String condition, BottomSheetConditionFragment.OnConditionListener listener) {
//        BottomSheetConditionFragment conditionPicker = BottomSheetConditionFragment.newInstance(condition);
//        conditionPicker.listener = listener;
//        conditionPicker.show(fm, "condition_dialog");
//    }
//
//    public static void showConfirmationOffline(FragmentManager fm, BottomSheetConfirmModeFragment.OnNextListener listener) {
//        BottomSheetConfirmModeFragment conditionPicker = BottomSheetConfirmModeFragment.Companion.newInstance(
//                "There is fetching process when switch to Offline Mode.\nPlease stay in online mode first until process has been finished."
//        );
//        conditionPicker.listener = listener;
//        conditionPicker.show(fm, "confirm_mode_dialog");
//    }
//
//    public static void showConfirmationOnline(FragmentManager fm, BottomSheetConfirmModeFragment.OnNextListener listener) {
//        BottomSheetConfirmModeFragment conditionPicker = BottomSheetConfirmModeFragment.Companion.newInstance(
//                "This process will be deleted your stock taking list to upload to database. Process will be needed connection to database.\n" +
//                        "If there is no connection to database, the uploading process will be failed and your stock taking list offline mode keep in storage."
//        );
//        conditionPicker.listener = listener;
//        conditionPicker.show(fm, "confirm_mode_dialog");
//    }
//
//    public static void showConfirmationCommon(FragmentManager fm, String desc, BottomSheetConfirmModeFragment.OnNextListener listener) {
//        BottomSheetConfirmModeFragment conditionPicker = BottomSheetConfirmModeFragment.Companion.newInstance(desc);
//        conditionPicker.listener = listener;
//        conditionPicker.show(fm, "confirm_common_dialog");
//    }
//
//    public static void showImageOption(FragmentManager fm, boolean removeOption, BottomSheetImageOptionFragment.ImageOptionListener listener) {
//        BottomSheetImageOptionFragment imageOption = BottomSheetImageOptionFragment.Companion.newInstance(removeOption);
//        imageOption.listener = listener;
//        imageOption.show(fm, "image_option_dialog");
//    }
//
//    public static void filePreview(FragmentManager fm, String image) {
//        FilePreview imageOption = FilePreview.Companion.newInstance(image);
//        imageOption.show(fm);
//    }
//
//    public static void uploadImageProcess(FragmentManager fm, ArrayList<ImageEntity> imageList, boolean isLocal, UploadPhotoProgressFragment.SetUploadResultListener listener) {
//        UploadPhotoProgressFragment uploadImage = UploadPhotoProgressFragment.Companion.newInstance(imageList, isLocal);
//        uploadImage.setListener(listener);
//        uploadImage.show(fm);
//    }
}
