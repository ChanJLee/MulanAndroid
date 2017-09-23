package com.chan.mulan.view;

import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.chan.mulan.R;
import com.chan.mulan.data.Data;
import com.chan.mulan.data.ImageData;

/**
 * Created by chan on 2017/9/23.
 */

public class ImageView extends MarkdownView {

	private android.widget.ImageView mImageView;
	private TextView mTextView;
	private RequestManager mRequestManager;

	public ImageView(View itemView) {
		super(itemView);
		mImageView = itemView.findViewById(R.id.cover);
		mTextView = itemView.findViewById(R.id.label);
		mRequestManager = Glide.with(itemView.getContext());
	}

	@Override
	public void render(Data data) {
		ImageData imageData = (ImageData) data;
		mRequestManager.load(imageData.image).into(mImageView);
		mTextView.setText(imageData.label);
	}
}
