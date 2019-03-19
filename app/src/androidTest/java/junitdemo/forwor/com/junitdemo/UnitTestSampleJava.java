package junitdemo.forwor.com.junitdemo;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


/**
 * Created by Myy on 2019/3/19 14:54
 */
//如果测试套件依赖于JUnit3和JUnit4库的混合，请@RunWith(AndroidJUnit4::class) 在测试类定义的开头添加注释。
@RunWith(AndroidJUnit4.class)
@LargeTest
public class UnitTestSampleJava {
    private static final String FAKE_STRING = "HELLO_WORLD";
    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);
    @Test
    public void readStringFromContext_LocalizedString() {

    }
}
