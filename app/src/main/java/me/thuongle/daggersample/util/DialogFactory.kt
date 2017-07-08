package me.thuongle.daggersample.util

import android.app.Dialog
import android.content.Context
import android.support.annotation.StringRes
import android.support.v7.app.AlertDialog

import me.thuongle.daggersample.R

object DialogFactory {

    fun createSimpleNoTitleDialog(context: Context, message: String): Dialog {
        val alertDialog = AlertDialog.Builder(context)
                .setMessage(message)
                .setPositiveButton(R.string.dialog_action_ok, null)
        return alertDialog.create()
    }

    fun createSimpleOkErrorDialog(context: Context, title: String, message: String): Dialog {
        val alertDialog = AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(R.string.dialog_action_ok, null)
        return alertDialog.create()
    }

    fun createSimpleOkErrorDialog(context: Context,
                                  @StringRes titleResource: Int,
                                  @StringRes messageResource: Int): Dialog {
        return createSimpleOkErrorDialog(context,
                context.getString(titleResource),
                context.getString(messageResource))
    }

    fun createGenericErrorDialog(context: Context, message: String): Dialog {
        val alertDialog = AlertDialog.Builder(context)
                .setMessage(message)
                .setPositiveButton(R.string.dialog_action_ok, null)
        return alertDialog.create()
    }

    fun createGenericErrorDialog(context: Context, @StringRes messageResource: Int): Dialog {
        return createGenericErrorDialog(context, context.getString(messageResource))
    }

    //    public static AlertDialog createProgressDialog(Context context) {
    //        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
    //        alertDialog.setView(LayoutInflater.from(context).inflate(R.layout.dialog_progress, null));
    //        AlertDialog dialog = alertDialog.create();
    //        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(context.getResources().getColor(android.R.color.transparent)));
    //        return dialog;
    //    }
}