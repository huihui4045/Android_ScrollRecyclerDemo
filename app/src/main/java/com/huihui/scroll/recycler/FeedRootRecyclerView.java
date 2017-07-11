package com.huihui.scroll.recycler;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by gavin
 * Time 2017/7/11  14:57
 * Email:molu_clown@163.com
 */

public class FeedRootRecyclerView extends RecyclerView {
    public FeedRootRecyclerView(Context context) {
        this(context,null);
    }

    public FeedRootRecyclerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FeedRootRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    //这个接口的作用是不允许父类打断这个onTouch 事件，
    //那么我设置一个空的函数，override 父类的方法，就可以达到相反的效果
    @Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }
}
