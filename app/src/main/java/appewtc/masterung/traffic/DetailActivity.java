package appewtc.masterung.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    TextView titleTextView, detailTextView;
    ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        showView();

    } // onCreate

    private void showView() {

        //For Title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        //For Image
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

        //For Detail
        String[] strDetail = getResources().getStringArray(R.array.traffic_detail);
        int intIndex = getIntent().getIntExtra("Index", 0);
        detailTextView.setText(strDetail[intIndex]);


    }

    private void bindWidget() {

        titleTextView = (TextView) findViewById(R.id.txtDetailTitle);
        trafficImageView = (ImageView) findViewById(R.id.imvDetailImage);
        detailTextView = (TextView) findViewById(R.id.txtDetail);

    }

}   // Main Class
