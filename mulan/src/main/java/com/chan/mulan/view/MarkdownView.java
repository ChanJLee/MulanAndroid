package com.chan.mulan.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chan.mulan.data.Data;

/**
 * Created by chan on 2017/9/21.
 */

public abstract class MarkdownView extends RecyclerView.ViewHolder {

	public MarkdownView(View itemView) {
		super(itemView);
	}

	public abstract void render(Data data);
}
