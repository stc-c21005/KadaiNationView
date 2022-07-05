package jp.suntech.c21005.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView nationList = findViewById(R.id.nation_list);
        nationList.setOnItemClickListener(new ListItemClickListener());
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent,View view,int position,long id){
//            String item = (String)parent.getItemAtPosition(position);
            TextView output = findViewById(R.id.textView);
            TextView tvText = (TextView)view;
            String item = tvText.getText().toString();
            String show = item;
            output.setText(item);


            Toast.makeText(MainActivity.this,show,Toast.LENGTH_LONG).show();
        }
    }
}