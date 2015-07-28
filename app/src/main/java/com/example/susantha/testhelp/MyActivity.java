package com.example.susantha.testhelp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends Activity implements Html.ImageGetter {

  String code="\"<h4><font color=\\\"blue\\\" >Measurement</font></h4>\\n\" +\n" +
            "                \"    <p><b>01 Target Achievement</b></p>\\n\" +\n" +
            "                \"    <p>  RDBN Achievement</p>\\n\" +\n" +
            "                \"    <p> Monthly Achievement: 100%  =10 points </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    <p> Primary Target </p>\\n\" +\n" +
            "                \"    <p>  Monthly Achievement :>100%=10 points </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    <p> YTD RDBN Growth As per National Plan  </p>\\n\" +\n" +
            "                \"    <p>  YTD Achivement: in par with National = 10 points, if below National and having a plus growth = 3 points.  </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    <p> YTD Primary Growth As per National Plan  </p>\\n\" +\n" +
            "                \"    <p> YTD Achivement: in par with National = 5 points,  if below National and positive growth = 2.5 points </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    <p>Call Rate & Strike Rate  </p>\\n\" +\n" +
            "                \"    <p> Monthly Result: Strike Rate 80%  = 2.5 points, if above 70% points to be awarded on Prorate basis. NP Distributors 2.5 points to be awarded if strike rate is above 60% </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    <p><b>02 Finance</b></p>\\n\" +\n" +
            "                \"    <p>  Timely Payments</p>\\n\" +\n" +
            "                \"    <p> Monthly Achievement:For each payment postponements/No cash Order  (-2) points </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    <p>  Return Cheques</p>\\n\" +\n" +
            "                \"    <p> Monthly Achievement: For each return cheque (-10) points </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    <p> Bank Guarantee Availability</p>\\n\" +\n" +
            "                \"    <p> Monthly Result: if above or Equal 70%  = 15 points, If above 50% and below 70%  =  5 points, below 50% (0 )points </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"    <p> Bank Guarantee Availability</p>\\n\" +\n" +
            "                \"    <p> Monthly Result: if above or Equal 70%  = 15 points, If above 50% and below 70%  =  5 points, below 50% (0 )points </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"     <p><b>03 Quality of Sale</b></p>\\n\" +\n" +
            "                \"     <p> Last Week SKEW</p>\\n\" +\n" +
            "                \"     <p> Monthly Achievement: if Last week sales < 30%  =  5 points,  If Skewnes >30% = (-5) points </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"     <p><b>04 SDS</b></p>\\n\" +\n" +
            "                \"     <p>Month Closing</p>\\n\" +\n" +
            "                \"     <p> Monthly Result: if Closed within 1st working days = 2.5 points </p>\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"     <p>Daily Key in Synchronising</p>\\n\" +\n" +
            "                \"     <p> Monthly Result: Key in Completed by 2.30 p.m. Sync by 4.30 p.m. on daily basis  =  2.5 points</p>\"";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        TextView tv=(TextView)findViewById(R.id.view);
        Button bb= (Button) findViewById(R.id.button);
     //   Spanned sp = Html.fromHtml(code.replace("&lt;", "<").replace("&gt;", ">"));
       // textview.setText(sp);
        //String htmlString = Html.toHtml(code);
        // spanned spanned = Html.(code, this, null);
        // tv.setText(spanned);
      //  tv.setText(Html.fromHtml(code));

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyActivity.this, web.class);
                startActivity(intent);
            }
        });
      /*  tv.setText(Html.fromHtml(" <h4><font color=\"blue\" >Measurement</font></h4>\n" +
                "    <p><b>01 Target Achievement</b></p>\n" +
                "    <p>  RDBN Achievement</p>\n" +
                "    <p> Monthly Achievement: 100%  =10 points </p>\n" +
                "\n" +
                "    <p> Primary Target </p>\n" +
                "    <p>  Monthly Achievement :>100%=10 points </p>\n" +
                "\n" +
                "    <p> YTD RDBN Growth As per National Plan  </p>\n" +
                "    <p>  YTD Achivement: in par with National = 10 points, if below National and having a plus growth = 3 points.  </p>\n" +
                "\n" +
                "    <p> YTD Primary Growth As per National Plan  </p>\n" +
                "    <p> YTD Achivement: in par with National = 5 points,  if below National and positive growth = 2.5 points </p>\n" +
                "\n" +
                "    <p>Call Rate & Strike Rate  </p>\n" +
                "    <p> Monthly Result: Strike Rate 80%  = 2.5 points, if above 70% points to be awarded on Prorate basis. NP Distributors 2.5 points to be awarded if strike rate is above 60% </p>\n" +
                "\n" +
                "    <p><b>02 Finance</b></p>\n" +
                "    <p>  Timely Payments</p>\n" +
                "    <p> Monthly Achievement:For each payment postponements/No cash Order  (-2) points </p>\n" +
                "\n" +
                "    <p>  Return Cheques</p>\n" +
                "    <p> Monthly Achievement: For each return cheque (-10) points </p>\n" +
                "\n" +
                "    <p> Bank Guarantee Availability</p>\n" +
                "    <p> Monthly Result: if above or Equal 70%  = 15 points, If above 50% and below 70%  =  5 points, below 50% (0 )points </p>\n" +
                "\n" +
                "    <p> Bank Guarantee Availability</p>\n" +
                "    <p> Monthly Result: if above or Equal 70%  = 15 points, If above 50% and below 70%  =  5 points, below 50% (0 )points </p>\n" +
                "\n" +
                "     <p><b>03 Quality of Sale</b></p>\n" +
                "     <p> Last Week SKEW</p>\n" +
                "     <p> Monthly Achievement: if Last week sales < 30%  =  5 points,  If Skewnes >30% = (-5) points </p>\n" +
                "\n" +
                "     <p><b>04 SDS</b></p>\n" +
                "     <p>Month Closing</p>\n" +
                "     <p> Monthly Result: if Closed within 1st working days = 2.5 points </p>\n" +
                "\n" +
                "     <p>Daily Key in Synchronising</p>\n" +
                "     <p> Monthly Result: Key in Completed by 2.30 p.m. Sync by 4.30 p.m. on daily basis  =  2.5 points</p>"), TextView.BufferType.SPANNABLE);*/

    }


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

    @Override
    public Drawable getDrawable(String source) {
        return null;
    }
}
