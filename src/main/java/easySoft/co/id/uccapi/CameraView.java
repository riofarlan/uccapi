package easySoft.co.id.uccapi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

import easySoft.co.id.CLM.UCX.CLMCameraView;

/**
 * Created by Rio on 9/12/2018.
 */
public final class CameraView extends TextureView {

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    static CLMCameraView clmCameraView;


    @Override
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        clmCameraView.setForeground(background);

    }

    public final void setForeground(Drawable background) {
        super.setBackground((Drawable)null);
        clmCameraView.setForeground(background);
    }

    @Override
    public void setBackground(Drawable background) {
        super.setBackground(background);
        clmCameraView.setForeground(background);
    }

    public CameraView(Context context) {
        super(context);
        clmCameraView = new CLMCameraView(context);
        addOnAttachStateChangeListener(new OnAttachStateChangeListener() {

            @Override
            public void onViewAttachedToWindow(View v) {
                clmCameraView = new CLMCameraView(context);
                ((ViewGroup) v.getParent()).addView(clmCameraView, v.getLayoutParams());
            }

            @Override
            public void onViewDetachedFromWindow(View v) {
            }
        });
    }

    public CameraView(Context context, AttributeSet attrs) {
        super(context, attrs);
        clmCameraView = new CLMCameraView(context, attrs);
        addOnAttachStateChangeListener(new OnAttachStateChangeListener() {

            @Override
            public void onViewAttachedToWindow(View v) {
                clmCameraView = new CLMCameraView(context, attrs);
                ((ViewGroup) v.getParent()).addView(clmCameraView, v.getLayoutParams());
            }

            @Override
            public void onViewDetachedFromWindow(View v) {
            }
        });
    }

    public CameraView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        addOnAttachStateChangeListener(new OnAttachStateChangeListener() {

            @Override
            public void onViewAttachedToWindow(View v) {
                clmCameraView = new CLMCameraView(context, attrs, defStyleAttr);
                ((ViewGroup) v.getParent()).addView(clmCameraView, v.getLayoutParams());
            }

            @Override
            public void onViewDetachedFromWindow(View v) {
            }
        });
    }

    public CameraView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        clmCameraView = new CLMCameraView(context, attrs, defStyleAttr, defStyleRes);
        addOnAttachStateChangeListener(new OnAttachStateChangeListener() {

            @Override
            public void onViewAttachedToWindow(View v) {
                clmCameraView = new CLMCameraView(context, attrs, defStyleAttr, defStyleRes);
                ((ViewGroup) v.getParent()).addView(clmCameraView, v.getLayoutParams());
            }

            @Override
            public void onViewDetachedFromWindow(View v) {
            }
        });
    }

    static CLMCameraView getCLMCameraView(){
        return clmCameraView;
    }

}
