package com.chan.mulan.span;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;

/**
 * Created by chan on 2017/9/24.
 */

public class LinkSpan extends ClickableSpan {
	private String mUri;

	public LinkSpan(String mUri) {
		this.mUri = mUri;
	}

	@Override
	public void onClick(View view) {
		try {
			Intent intent = new Intent();
			intent.setAction(Intent.ACTION_VIEW);
			Uri uri = Uri.parse(mUri);
			intent.setData(uri);
			view.getContext().startActivity(Intent.createChooser(intent, "选择打开方式"));
		} catch (Exception e) {
			if (!TextUtils.isEmpty(e.getMessage())) {
				Toast.makeText(view.getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
			}
		}
	}
}
