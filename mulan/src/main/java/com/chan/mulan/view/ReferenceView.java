package com.chan.mulan.view;

import android.view.View;
import android.widget.TextView;

import com.chan.mulan.data.Data;
import com.chan.mulan.data.TextureData;

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
		TextureData textureData = (TextureData) data;
		mTextView.setText(textureData.texture);
	}
}
