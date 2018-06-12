package com.example.dsdatsme.musicplayerui.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SquareImageGenerator extends android.support.v7.widget.AppCompatImageView {

    public SquareImageGenerator(Context context) {
        super(context);
    }

    public SquareImageGenerator(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageGenerator(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMeasuredWidth();
        setMeasuredDimension(width, width);
    }
}
