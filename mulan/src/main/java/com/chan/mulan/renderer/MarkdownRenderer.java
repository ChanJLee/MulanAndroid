package com.chan.mulan.renderer;

import android.content.Context;
import android.support.annotation.IntDef;
import android.support.annotation.Keep;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;

import com.chan.mulan.R;
import com.chan.mulan.adapter.MarkdownAdapter;
import com.chan.mulan.data.Data;
import com.chan.mulan.data.ImageData;
import com.chan.mulan.data.NewLineData;
import com.chan.mulan.data.OrderedListItemData;
import com.chan.mulan.data.ReferenceData;
import com.chan.mulan.data.TextureData;
import com.chan.mulan.data.TitleData;
import com.chan.mulan.data.UnorderedListItemData;
import com.chan.mulan.misc.SpannableBuilder;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chan on 2017/9/21.
 */

@Keep
public class MarkdownRenderer {

	public static final int TITLE_SIZE_1 = 0;
	public static final int TITLE_SIZE_2 = 1;
	public static final int TITLE_SIZE_3 = 2;
	public static final int TITLE_SIZE_4 = 3;
	public static final int TITLE_SIZE_5 = 4;

	public static final int TYPEFACE_BOLD = 5;
	public static final int TYPEFACE_ITALIC = 6;

	@Retention(RetentionPolicy.SOURCE)
	@IntDef({TITLE_SIZE_1, TITLE_SIZE_2, TITLE_SIZE_3, TITLE_SIZE_4, TITLE_SIZE_5})
	public @interface TitleSize {

	}

	@Retention(RetentionPolicy.SOURCE)
	@IntDef({TYPEFACE_BOLD, TYPEFACE_ITALIC})
	public @interface Typeface {

	}

	private static final String TAG = "MarkdownRenderer";
	private MarkdownAdapter mAdapter;
	private List<Data> mDataList = new ArrayList<>();
	private Context mContext;

	public MarkdownRenderer(RecyclerView recyclerView) {
		mContext = recyclerView.getContext();
		recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
		mAdapter = new MarkdownAdapter(recyclerView.getContext(), mDataList);
		recyclerView.setAdapter(mAdapter);
	}

	public void begin() {
		d("begin");
		mDataList.clear();
	}

	public void end() {
		d("end");
		mAdapter.notifyDataSetChanged();
	}

	public void renderTitle(@TitleSize int titleSize, String title) {
		d("renderTitle titleSize: " + titleSize + " texture " + title);
		TitleData titleData = new TitleData();
		float textSize = 0;
		if (titleSize == TITLE_SIZE_1) {
			textSize = mContext.getResources().getDimension(R.dimen.title_1);
		} else if (titleSize == TITLE_SIZE_2) {
			textSize = mContext.getResources().getDimension(R.dimen.title_2);
		} else if (titleSize == TITLE_SIZE_3) {
			textSize = mContext.getResources().getDimension(R.dimen.title_3);
		} else if (titleSize == TITLE_SIZE_4) {
			textSize = mContext.getResources().getDimension(R.dimen.title_4);
		} else {
			textSize = mContext.getResources().getDimension(R.dimen.title_5);
		}

		titleData.texture = new SpannableBuilder(title)
				.setTextSize((int) textSize)
				.setTypeface(android.graphics.Typeface.BOLD)
				.finish();

		mDataList.add(titleData);
	}

	public void renderTexture(String text) {
		d("renderTexture: " + text);
		TextureData textureData = new TextureData();
		textureData.texture = new SpannableBuilder(text)
				.finish();
		mDataList.add(textureData);
	}

	public void renderTypeface(@Typeface int typeface, String text) {
		d("renderTypeface typeface: " + typeface + " text " + text);
		TextureData lastTextureData = null;
		if (!mDataList.isEmpty() && mDataList.get(mDataList.size() - 1) instanceof TextureData) {
			lastTextureData = (TextureData) mDataList.get(mDataList.size() - 1);
		}

		if (lastTextureData != null) {
			lastTextureData.texture = new SpannableBuilder(lastTextureData.texture)
					.nextSpannable(" ")
					.nextSpannable(text)
					.setTypeface(typeface == TYPEFACE_BOLD ? android.graphics.Typeface.BOLD : android.graphics.Typeface.ITALIC)
					.nextSpannable(" ")
					.finish();
			return;
		}

		lastTextureData = new TextureData();
		lastTextureData.texture = new SpannableBuilder(text)
				.setTypeface(typeface == TYPEFACE_BOLD ? android.graphics.Typeface.BOLD : android.graphics.Typeface.ITALIC)
				.nextSpannable(" ")
				.finish();
		mDataList.add(lastTextureData);
	}

	public void renderOrderedList(String orderNum, String content) {
		d("renderOrderedList order num: " + orderNum + " content " + content);
		OrderedListItemData itemData = new OrderedListItemData();
		itemData.texture = new SpannableBuilder(orderNum)
				.setTypeface(android.graphics.Typeface.BOLD)
				.nextSpannable(". ")
				.setTypeface(android.graphics.Typeface.BOLD)
				.nextSpannable(content)
				.finish();
		mDataList.add(itemData);
	}

	public void renderUnorderedList(String content) {
		d("renderUnorderedList " + content);
		UnorderedListItemData itemData = new UnorderedListItemData();
		itemData.texture = new SpannableBuilder("• ")
				.setTypeface(android.graphics.Typeface.BOLD)
				.nextSpannable(content)
				.finish();
		mDataList.add(itemData);
	}

	public void renderNewLine() {
		d("renderNewLine");
		mDataList.add(new NewLineData());
	}

	public void renderImage(String label, String url) {
		d("renderImage label: " + label + " url " + url);
		ImageData imageData = new ImageData();
		imageData.image = url;
		imageData.label = label;
		mDataList.add(imageData);
	}

	public void renderLink(String label, final String url) {
		d("renderLink label: " + label + " url " + url);
		TextureData lastTextureData = null;
		if (!mDataList.isEmpty() && mDataList.get(mDataList.size() - 1) instanceof TextureData) {
			lastTextureData = (TextureData) mDataList.get(mDataList.size() - 1);
		}

		if (lastTextureData != null) {
			lastTextureData.texture = new SpannableBuilder(lastTextureData.texture)
					.nextSpannable(" ")
					.nextSpannable(label)
					.setClickable(new ClickableSpan() {
						@Override
						public void onClick(View view) {
							d("clicked" + url);
						}
					})
					.nextSpannable(" ")
					.finish();
			return;
		}

		lastTextureData = new TextureData();
		lastTextureData.texture = new SpannableBuilder(label)
				.setClickable(new ClickableSpan() {
					@Override
					public void onClick(View view) {
						d("clicked" + url);
					}
				})
				.nextSpannable(" ")
				.finish();
		mDataList.add(lastTextureData);
	}

	public void renderReference(String content) {
		d("renderReference " + content);
		ReferenceData referenceData = new ReferenceData();
		referenceData.texture = content;
		mDataList.add(referenceData);
	}

	private static void d(String message) {
		Log.d(TAG, message);
	}
}
