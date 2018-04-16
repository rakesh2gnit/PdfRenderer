package com.bizshare.pdfrenderer;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String FRAGMENT_PDF_READER = "pdf_reader";
    //private final static String URL = "http://unec.edu.az/application/uploads/2014/12/pdf-sample.pdf";
    private final static String URL = "http://gahp.net/wp-content/uploads/2017/09/sample.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }*/

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PdfReaderFragment(),
                            FRAGMENT_PDF_READER)
                    .commit();
        }
    }
}
