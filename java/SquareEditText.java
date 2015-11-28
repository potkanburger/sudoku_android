package com.potkanburger.sudoku_durif_genoux_hu;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.EditText;

public class SquareEditText extends EditText {
    public SquareEditText(Context context) {
        super(context);
    }

    public SquareEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SquareEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    int convertDpToPx(int value){
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int res = Math.round(value*(displayMetrics.xdpi/DisplayMetrics.DENSITY_DEFAULT));
        return res;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int taille = Math.max(widthMeasureSpec, heightMeasureSpec);
        super.onMeasure(taille, taille);
        /*DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int size_screen_width = Math.round(displayMetrics.widthPixels / displayMetrics.density);
        int size_screen_height = Math.round(displayMetrics.heightPixels/ displayMetrics.density);
        int taille = (int)(Math.min(size_screen_height, size_screen_width)*0.9);
        taille = taille/9;
        setMeasuredDimension(convertDpToPx(40), convertDpToPx(40));*/
    }
}
