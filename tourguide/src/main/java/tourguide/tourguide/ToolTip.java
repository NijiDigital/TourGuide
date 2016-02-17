package tourguide.tourguide;

import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;

/**
 * Created by tanjunrong on 6/17/15.
 */
public class ToolTip {
    public View mTooltipView;
    public Animation mEnterAnimation;
    public boolean mShadow;
    public int mGravity;
    public View.OnClickListener mOnClickListener;

    public ToolTip(View tooltipView) {
        mTooltipView = tooltipView;
        mShadow = true;
        mGravity = Gravity.CENTER;
    }

    /**
     * Set enter animation
     *
     * @param enterAnimation
     * @return return ToolTip instance for chaining purpose
     */
    public ToolTip setEnterAnimation(Animation enterAnimation) {
        mEnterAnimation = enterAnimation;
        return this;
    }
    /**
     * Set exit animation
     * @param exitAnimation
     * @return return ToolTip instance for chaining purpose
     */
//    TODO:
//    public ToolTip setExitAnimation(Animation exitAnimation){
//        mExitAnimation = exitAnimation;
//        return this;
//    }

    /**
     * Set the gravity, the setGravity is centered relative to the targeted button
     *
     * @param gravity Gravity.CENTER, Gravity.TOP, Gravity.BOTTOM, etc
     * @return return ToolTip instance for chaining purpose
     */
    public ToolTip setGravity(int gravity) {
        mGravity = gravity;
        return this;
    }

    /**
     * Set if you want to have setShadow
     *
     * @param shadow
     * @return return ToolTip instance for chaining purpose
     */
    public ToolTip setShadow(boolean shadow) {
        mShadow = shadow;
        return this;
    }

    public ToolTip setOnClickListener(View.OnClickListener onClickListener) {
        mOnClickListener = onClickListener;
        return this;
    }
}
