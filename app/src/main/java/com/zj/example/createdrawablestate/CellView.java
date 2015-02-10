package com.zj.example.createdrawablestate;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * create by zhengjiong
 * Date: 2015-01-13
 * Time: 21:18
 */
public class CellView extends TextView{

    private boolean isCurrent = false;
    private boolean isBlue = false;

    private int[] STATE_CURRENT = {
            R.attr.state_current
    };

    private int[] STATE_BLUE = {
            R.attr.state_blue
    };

    public CellView(Context context) {
        this(context, null);
    }

    public CellView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CellView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setCurrent(boolean isCurrent) {
        this.isCurrent = isCurrent;
        refreshDrawableState();
    }

    public void setBlue(boolean isBlue) {
        this.isBlue = isBlue;
        refreshDrawableState();
    }

    @Override
    protected int[] onCreateDrawableState(int extraSpace) {

        int[] drawableState = super.onCreateDrawableState(extraSpace + 2);

        if (isCurrent) {
            mergeDrawableStates(drawableState, STATE_CURRENT);
        }

        if (isBlue) {
            mergeDrawableStates(drawableState, STATE_BLUE);
        }

        return drawableState;
    }
}
