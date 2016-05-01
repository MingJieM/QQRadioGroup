package com.ming.qqradiogroup;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        group = (RadioGroup) findViewById(R.id.radioGroupButton);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.message:
                        Toast.makeText(MainActivity.this, "消息被点击", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.call_phone:
                        Toast.makeText(MainActivity.this, "电话被点击", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
