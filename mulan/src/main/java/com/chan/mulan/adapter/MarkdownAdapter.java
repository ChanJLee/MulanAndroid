package com.chan.mulan.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.chan.mulan.data.Data;
import com.chan.mulan.view.MarkdownView;

import java.util.List;

/**
 * Created by chan on 2017/9/21.
 */

public class MarkdownAdapter extends RecyclerView.Adapter<MarkdownView> {
	private List<Data> mDataList;
	private Context mContext;

	public MarkdownAdapter(Context context, List<Data> dataList) {
		mContext = context;
		mDataList = dataList;
	}

	@Override
	public MarkdownView onCreateViewHolder(ViewGroup parent, int viewType) {
		return new MarkdownView.Builder()
				.context(mContext)
				.parent(parent)
				.type(viewType)
				.build();
	}

	@Override
	public int getItemViewType(int position) {
		return mDataList.get(position).type;
	}

	@Override
	public void onBindViewHolder(MarkdownView holder, int position) {
		holder.render(mDataList.get(position));
	}

	@Override
	public int getItemCount() {
		return mDataList.size();
	}
}
