package com.chan.mulan.data;

import android.support.annotation.IntDef;

/**
 * Created by chan on 2017/9/21.
 */

public abstract class Data {

	public static final int TYPE_IMAGE = 0;
	public static final int TYPE_ORDERED_LIST_ITEM = 2;
	public static final int TYPE_UNORDERED_LIST_ITEM = 3;
	public static final int TYPE_REFERENCE = 4;
	public static final int TYPE_TITLE = 5;
	public static final int TYPE_TEXTURE = 6;
	public static final int TYPE_NEW_LINE = 7;

	@IntDef({TYPE_IMAGE,
			TYPE_ORDERED_LIST_ITEM,
			TYPE_UNORDERED_LIST_ITEM,
			TYPE_REFERENCE,
			TYPE_TEXTURE,
			TYPE_TITLE,
			TYPE_NEW_LINE})
	public @interface DataType {
	}

	public final int type;

	public Data(@DataType int type) {
		this.type = type;
	}
}
