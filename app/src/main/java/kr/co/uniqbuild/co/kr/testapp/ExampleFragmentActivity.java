package kr.co.uniqbuild.co.kr.testapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class ExampleFragmentActivity extends AppCompatActivity {
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_fragment);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final DemoFragment[] fragments = new DemoFragment[] {
                        DemoFragment.newInstance(Color.BLUE),
                        DemoFragment.newInstance(Color.DKGRAY),
                        DemoFragment.newInstance(Color.CYAN)
                };
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.your_placeholder, fragments[index++%3]);
                ft.commit();
            }
        });
    }

}
