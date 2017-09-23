package com.chan.mulan.view;

import android.view.View;
import android.widget.TextView;

import com.chan.mulan.data.Data;
import com.chan.mulan.data.ReferenceData;

/**
 * Created by chan on 2017/9/21.
 */

public class ReferenceView extends MarkdownView {
	private TextView mTextView;

	public ReferenceView(View itemView) {
		super(itemView);
		mTextView = (TextView) itemView;
	}

	@Override
	public void render(Data data) {
		ReferenceData referenceData = (ReferenceData) data;
		mTextView.setText(referenceData.texture);
	}
}
