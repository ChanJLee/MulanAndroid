package com.chan.mulan.view;

import android.view.View;
import android.widget.TextView;

import com.chan.mulan.data.Data;
import com.chan.mulan.data.OrderedListItemData;

/**
 * Created by chan on 2017/9/21.
 */

public class OrderedListItemView extends MarkdownView {

	private TextView mTextView;

	public OrderedListItemView(View itemView) {
		super(itemView);
		mTextView = (TextView) itemView;
	}

	@Override
	public void render(Data data) {
		OrderedListItemData itemData = (OrderedListItemData) data;
		mTextView.setText(itemData.texture);
	}
}
