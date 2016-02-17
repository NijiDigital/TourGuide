package tourguide.tourguide;

import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;

/**
 * Created by tanjunrong on 6/17/15.
 */
public class ToolTip {
    @StringRes public int mDescription;
    @DrawableRes public int mLeftDrawableRes, mRightDrawableRes;
    @DrawableRes public int mBackgroundColor;
    @ColorRes public int mTextColor;
    public String mTypeface;
    public Animation mEnterAnimation, mExitAnimation;
    public boolean mShadow;
    public int mGravity;
    public View.OnClickListener mOnClickListener;

    public ToolTip() {
        /* default values */
        mTextColor = android.R.color.white;
        mBackgroundColor = android.R.color.transparent;
        mEnterAnimation = new AlphaAnimation(0f, 1f);
        mEnterAnimation.setDuration(1000);
        mEnterAnimation.setFillAfter(true);
        mEnterAnimation.setInterpolator(new BounceInterpolator());
        mShadow = true;

        // TODO: exit animation
        mGravity = Gravity.CENTER;
    }

    /**
     * Set description text
     *
     * @param description
     * @return return ToolTip instance for chaining purpose
     */
    public ToolTip setDescription(@StringRes int description) {
        mDescription = description;
        return this;
    }

    /**
     * Set background color
     *
     * @param backgroundColor
     * @return return ToolTip instance for chaining purpose
     */
    public ToolTip setBackgroundColor(int backgroundColor) {
        mBackgroundColor = backgroundColor;
        return this;
    }

    /**
     * Set left drawable
     *
     * @param leftDrawable
     * @return return ToolTip instance for chaining purpose
     */

    public ToolTip setLeftDrawable(@DrawableRes int leftDrawable) {
        mLeftDrawableRes = leftDrawable;
        return this;
    }

    /**
     * Set right drawable
     *
     * @param rightDrawable
     * @return return ToolTip instance for chaining purpose
     */

    public ToolTip setRightDrawable(@DrawableRes int rightDrawable) {
        mRightDrawableRes = rightDrawable;
        return this;
    }

    public ToolTip setTypeface(final String typeface) {
        mTypeface = typeface;
        return this;
    }

    /**
     * Set text color
     *
     * @param textColor
     * @return return ToolTip instance for chaining purpose
     */
    public ToolTip setTextColor(int textColor) {
        mTextColor = textColor;
        return this;
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
