package junitdemo.forwor.com.junitdemo;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by Myy on 2019/3/19 20:12
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

    @Test
    public void onCreate() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        TextView tv = activity.findViewById(R.id.tv);
        tv.setText("哈哈");
    }
}