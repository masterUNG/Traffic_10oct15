package appewtc.masterung.traffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

        //Create ListView
        createListView();


    }   // Main Method

    private void createListView() {

        //Setup integer of Image
        final int[] intIcon = new int[20];
        intIcon[0] = R.drawable.traffic_01;
        intIcon[1] = R.drawable.traffic_02;
        intIcon[2] = R.drawable.traffic_03;
        intIcon[3] = R.drawable.traffic_04;
        intIcon[4] = R.drawable.traffic_05;
        intIcon[5] = R.drawable.traffic_06;
        intIcon[6] = R.drawable.traffic_07;
        intIcon[7] = R.drawable.traffic_08;
        intIcon[8] = R.drawable.traffic_09;
        intIcon[9] = R.drawable.traffic_10;
        intIcon[10] = R.drawable.traffic_11;
        intIcon[11] = R.drawable.traffic_12;
        intIcon[12] = R.drawable.traffic_12;
        intIcon[13] = R.drawable.traffic_14;
        intIcon[14] = R.drawable.traffic_15;
        intIcon[15] = R.drawable.traffic_16;
        intIcon[16] = R.drawable.traffic_17;
        intIcon[17] = R.drawable.traffic_18;
        intIcon[18] = R.drawable.traffic_19;
        intIcon[19] = R.drawable.traffic_20;

        //Setup Title
        final String[] strTitle = {"ป้ายภาพที่ 1", "ป้ายภาพที่ 2", "ป้ายภาพที่ 3",
                "ป้ายภาพที่ 4", "ป้ายภาพที่ 5", "ป้ายภาพที่ 6", "ป้ายภาพที่ 7",
                "ป้ายภาพที่ 8", "ป้ายภาพที่ 9", "ป้ายภาพที่ 10", "ป้ายภาพที่ 11",
                "ป้ายภาพที่ 12", "ป้ายภาพที่ 13", "ป้ายภาพที่ 14", "ป้ายภาพที่ 15",
                "ป้ายภาพที่ 16", "ป้ายภาพที่ 17", "ป้ายภาพที่ 18", "ป้ายภาพที่ 19", "ป้ายภาพที่ 20"};

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle);
        trafficListView.setAdapter(objMyAdapter);

        //Active onClick
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent objIntent = new Intent(MainActivity.this, DetailActivity.class);
                objIntent.putExtra("Title", strTitle[i]);
                objIntent.putExtra("Image", intIcon[i]);
                objIntent.putExtra("Index", i);
                startActivity(objIntent);


            }   // event
        });


    }   // createListView


    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.mosquito);
                buttonMediaPlayer.start();

                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/AFmWqLIqDZA"));
                startActivity(objIntent);

            }   // event
        });

    }

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }

}   // Main Class นี่คือ คลาสหลัก
