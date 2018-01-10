package com.example.merxu.tdialog.listener;

import android.view.View;

import com.example.merxu.tdialog.TDialog;
import com.example.merxu.tdialog.base.BindViewHolder;


public interface OnViewClickListener {
    void onViewClick(BindViewHolder viewHolder, View view, TDialog tDialog);
}
