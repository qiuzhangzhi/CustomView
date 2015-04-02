package com.grasp.customview;

import com.grasp.customview.activitys.LableViewActivity;
import com.grasp.customview.activitys.RoundProgressBarActivity;
import com.grasp.customview.activitys.TimerButtonActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    /** Called when the activity is first created. */
    public static final String[] options = { "LableView", "RoundProgress","TimerButton"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent;

        switch (position) {
            default:
            case 0:
                intent = new Intent(this, LableViewActivity.class);
                break;
            case 1:
                intent = new Intent(this, RoundProgressBarActivity.class);
                break;
            case 2:
            	intent = new Intent(this, TimerButtonActivity.class);
            	break;
        }

        startActivity(intent);
    }
}
