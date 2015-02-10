package com.zj.example.createdrawablestate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


/**
 *
 * @author zj
 * @2015年1月14日21:05:49
 */
public class MyActivity extends Activity {

    private CellView mCellView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mCellView = (CellView) findViewById(R.id.cellview);

        findViewById(R.id.bt1).setOnClickListener(onClickListener);
        findViewById(R.id.bt2).setOnClickListener(onClickListener);
        findViewById(R.id.bt3).setOnClickListener(onClickListener);
        findViewById(R.id.bt4).setOnClickListener(onClickListener);
    }


    private View.OnClickListener onClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.bt1:
                    mCellView.setCurrent(true);
                    break;
                case R.id.bt2:
                    mCellView.setCurrent(false);
                    break;
                case R.id.bt3:
                    mCellView.setBlue(true);
                    break;
                case R.id.bt4:
                    mCellView.setBlue(false);
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
