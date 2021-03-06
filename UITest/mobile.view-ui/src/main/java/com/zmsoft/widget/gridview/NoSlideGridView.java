package com.zmsoft.widget.gridview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;

public class NoSlideGridView extends GridView {
	public NoSlideGridView(Context context) {

        super(context);

  }
	

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
      int heightSpec;

      if (getLayoutParams().height == LayoutParams.WRAP_CONTENT) {
          heightSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
      }
      else {
          heightSpec = heightMeasureSpec;
      }

      super.onMeasure(widthMeasureSpec, heightSpec);
  }


  public NoSlideGridView(Context context, AttributeSet attrs) {

        super(context, attrs);

  }

  public NoSlideGridView(Context context, AttributeSet attrs, int  defStyle) {

       super(context, attrs, defStyle);

  }
  public boolean dispatchTouchEvent(MotionEvent ev) {

      if (ev.getAction() == MotionEvent.ACTION_MOVE) {

           return true;  //禁止GridView滑动

      }
      return super.dispatchTouchEvent(ev);

  }
}
