package com.example.merxu.dialogfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.merxu.dialogfragment.ui.DialogEncapActivity;
import com.example.merxu.dialogfragment.ui.DiffentDialogActivity;
import com.example.merxu.dialogfragment.ui.NormalDFActivity;
import com.example.merxu.dialogfragment.ui.SystemDialog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 系统Dialog使用
     *
     * @param view
     */
    public void systemDialog(View view) {
        startActivity(new Intent(this, SystemDialog.class));
    }

    /**
     * DialogFragment的使用
     *
     * @param view
     */
    public void NormalDF(View view) {
        startActivity(new Intent(this, NormalDFActivity.class));
    }

    /**
     * DialogFragment封装
     *
     * @param view
     */
    public void DialogEncap(View view) {
        startActivity(new Intent(this, DialogEncapActivity.class));
    }

    /**
     * 常用的各种Dialog
     *
     * @param view
     */
    public void diffentDialog(View view) {
        startActivity(new Intent(this, DiffentDialogActivity.class));
    }
}
