package com.chan.mulan.view;

import android.view.View;
import android.widget.TextView;

import com.chan.mulan.data.Data;
import com.chan.mulan.data.UnorderedListItemData;

/**
 * Created by chan on 2017/9/21.
 */

public class UnorderedListItemView extends MarkdownView {

	private TextView mTextView;

	public UnorderedListItemView(View itemView) {
		super(itemView);
		mTextView = (TextView) itemView;
	}

	@Override
	public void render(Data data) {
		UnorderedListItemData itemData = (UnorderedListItemData) data;
		mTextView.setText(itemData.texture);
	}
}
