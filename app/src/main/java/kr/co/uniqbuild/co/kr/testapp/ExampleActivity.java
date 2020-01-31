package kr.co.uniqbuild.co.kr.testapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class ExampleActivity extends ListActivity {
    protected void onCreate(Bundle saveState) {
        super.onCreate(saveState);
        setContentView(R.layout.activity_example);

        ListAdapter adapter = new ArrayAdapter<>(this, R.layout.list_item_example,
                R.id.text1, new String[] {"a", "b", "c"});
        ListView list = findViewById(android.R.id.list);
        list.setAdapter(adapter);
    }
}
