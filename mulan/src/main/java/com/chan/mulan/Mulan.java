package com.chan.mulan;

import android.support.v7.widget.RecyclerView;

import com.chan.mulan.renderer.MarkdownRenderer;

/**
 * Created by chan on 2017/9/21.
 */

public class Mulan {

	static {
		System.loadLibrary("mulan.so");
	}

	public static void render(String markdown, RecyclerView recyclerView) {
		render(markdown, new MarkdownRenderer(recyclerView));
	}

	private static native void render(String markdown, MarkdownRenderer renderer);
}
