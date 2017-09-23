package com.chan.mulan.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chan.mulan.R;
import com.chan.mulan.data.Data;

/**
 * Created by chan on 2017/9/21.
 */

public abstract class MarkdownView extends RecyclerView.ViewHolder {

	public MarkdownView(View itemView) {
		super(itemView);
	}

	public abstract void render(Data data);

	public static class Builder {
		private int type = Data.TYPE_TITLE;
		private ViewGroup parent;
		private Context context;

		public Builder type(int type) {
			this.type = type;
			return this;
		}

		public Builder parent(ViewGroup parent) {
			this.parent = parent;
			return this;
		}

		public Builder context(Context context) {
			this.context = context;
			return this;
		}

		public MarkdownView build() {
			if (parent == null) {
				throw new IllegalArgumentException("parent must not be null");
			}

			if (context == null) {
				throw new IllegalArgumentException("context must not be null");
			}

			LayoutInflater layoutInflater = LayoutInflater.from(context);
			if (type == Data.TYPE_TITLE) {
				return new TitleView(layoutInflater.inflate(R.layout.texture, parent, false));
			}

			if (type == Data.TYPE_ORDERED_LIST_ITEM) {
				return new OrderedListItemView(layoutInflater.inflate(R.layout.texture, parent, false));
			}

			if (type == Data.TYPE_UNORDERED_LIST_ITEM) {
				return new UnorderedListItemView(layoutInflater.inflate(R.layout.texture, parent, false));
			}

			if (type == Data.TYPE_REFERENCE) {
				return new ReferenceView(layoutInflater.inflate(R.layout.reference, parent, false));
			}

			if (type == Data.TYPE_TEXTURE) {
				return new TextureView(layoutInflater.inflate(R.layout.texture, parent, false));
			}

			if (type == Data.TYPE_NEW_LINE) {
				return new NewLineView(layoutInflater.inflate(R.layout.new_line, parent, false));
			}

			return new ImageView(layoutInflater.inflate(R.layout.image, parent, false));
		}
	}
}
