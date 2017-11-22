package club.towr5291.towr5291scoutingviewer2017_2018;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import club.towr5291.towr5291scoutingviewer2017_2018.R;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		layout1 = (ConstraintLayout) findViewById(R.id.layout_test);
	}

	int buttons = 0;

	ConstraintLayout layout1;

	public void onClick (View view) {

		ConstraintSet set = new ConstraintSet();
		set.clone(layout1);

		//Button 1:
		Button button = new Button(this);
		button.setText("Button" + buttons);
		button.setId(buttons);
		layout1.addView(button);
		if (buttons == 0) {
			set.connect(button.getId(), ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 0);
		}
		set.connect(button.getId(),ConstraintSet.RIGHT,ConstraintSet.PARENT_ID,ConstraintSet.RIGHT,0);
		set.connect(button.getId(),ConstraintSet.LEFT,ConstraintSet.PARENT_ID,ConstraintSet.LEFT,0);

		set.constrainHeight(button.getId(), 200);
		set.applyTo(layout1);

	}


	public String toString(int variable) {
		return String.valueOf(variable);
	}
	public int toInt (boolean variable) {
		if (variable) {
			return 1;
		} else  {
			return 0;
		}
	}
}
