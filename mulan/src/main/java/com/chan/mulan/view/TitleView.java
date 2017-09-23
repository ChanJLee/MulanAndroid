package com.chan.mulan.view;

import android.view.View;
import android.widget.TextView;

import com.chan.mulan.data.Data;
import com.chan.mulan.data.TitleData;

/**
 * Created by chan on 2017/9/23.
 */

public class TitleView extends MarkdownView {

	TextView mTextView;

	public TitleView(View itemView) {
		super(itemView);
		mTextView = (TextView) itemView;
	}

	@Override
	public void render(Data data) {
		TitleData titleData = (TitleData) data;
		mTextView.setText(titleData.texture);
	}
}
