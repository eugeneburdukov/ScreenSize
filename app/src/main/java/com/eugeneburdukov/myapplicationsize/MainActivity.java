package com.eugeneburdukov.myapplicationsize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView0, textView1, textView2, textView3;
    String resolution, densityScaled, densityNotScaled, yDpiValue;
    int width, height;
    float scaledDensity, densityDpi, density, xdpi, ydpi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        width = Resources.getSystem().getDisplayMetrics().widthPixels;
        height = Resources.getSystem().getDisplayMetrics().heightPixels;
        scaledDensity = Resources.getSystem().getDisplayMetrics().scaledDensity;
        densityDpi = Resources.getSystem().getDisplayMetrics().densityDpi;
        density = Resources.getSystem().getDisplayMetrics().density;
        xdpi = Resources.getSystem().getDisplayMetrics().xdpi;
        ydpi = Resources.getSystem().getDisplayMetrics().ydpi;

        resolution = width + " x " + height + "DensityDpi = " + densityDpi;
        densityScaled = "ScaledDensity = " + scaledDensity;
        densityNotScaled = "Density = " + density;
        yDpiValue = "xdpi" + " = " + xdpi + "; ydpi = " + ydpi;

        textView0 = findViewById(R.id.resolution);
        textView1 = findViewById(R.id.densityScaled);
        textView2 = findViewById(R.id.densityNotScaled);
        textView3 = findViewById(R.id.yDpiValue);

        textView0.setText(resolution);
        textView1.setText(densityScaled);
        textView2.setText(densityNotScaled);
        textView3.setText(yDpiValue);
    }
}