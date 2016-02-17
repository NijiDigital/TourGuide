package fr.ganfra.test;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import fr.ganfra.test.tourguide.R;
import tourguide.tourguide.Overlay;
import tourguide.tourguide.Sequence;
import tourguide.tourguide.ToolTip;
import tourguide.tourguide.TourGuide;

public class OverlaySequenceTourActivity extends ActionBarActivity {

    private Button mButton1, mButton2, mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_sequence);
        /* Get 3 buttons from layout */
        mButton1 = (Button) findViewById(R.id.button);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        buildTourGuide();
    }


    private void buildTourGuide() {
        // the return handler is used to manipulate the cleanup of all the tutorial elements
        final View view = LayoutInflater.from(this).inflate(R.layout.row, null);
        TourGuide tourGuide1 = TourGuide.init(this)
                .setToolTip(new ToolTip(view)
                                .setGravity(Gravity.BOTTOM)
                )
                        // note that there is not Overlay here, so the default one will be used
                .playLater(mButton1);


        TourGuide tourGuide2 = TourGuide.init(this)
                .setToolTip(new ToolTip(view)
                                .setGravity(Gravity.BOTTOM | Gravity.RIGHT)
                )
                .playLater(mButton2);


        TourGuide tourGuide3 = TourGuide.init(this)
                .setToolTip(new ToolTip(view)
                                .setGravity(Gravity.TOP | Gravity.RIGHT
                                )
                )
                .playLater(mButton3);


        Sequence sequence = new Sequence.SequenceBuilder()
                .add(tourGuide1, tourGuide2, tourGuide3)
                .setDefaultOverlay(new Overlay().setBackgroundColor(android.R.color.black))
                .setDefaultPointer(null)
                .setContinueMethod(Sequence.ContinueMethod.Overlay)
                .build();

        TourGuide.init(this).playInSequence(sequence);
    }


}