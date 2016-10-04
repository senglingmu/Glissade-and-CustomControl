package github.zhuoxin.com.customcontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 *    自定义控件
 */
public class TabView extends View{
    private Paint paint;
    public TabView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint=new Paint();//创建画笔
        paint.setColor(getResources().getColor(R.color.colorAccent));//画笔的颜色
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {//测量
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {//布局
        super.onLayout(changed, left, top, right, bottom);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF=new RectF(0,0,getWidth(),getHeight());//设置矩形的大小
//        canvas.drawArc(rectF,-90,90,true,paint);//在矩形里面画出一个园
        canvas.drawRect(rectF,paint);//画出一个矩形
        postInvalidate();
    }
}
