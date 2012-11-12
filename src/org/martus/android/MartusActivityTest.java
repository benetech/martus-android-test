package org.martus.android;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class org.martus.android.MartusActivityTest \
 * org.martus.android.tests/android.test.InstrumentationTestRunner
 */
public class MartusActivityTest extends ActivityInstrumentationTestCase2<MartusActivity> {

    public MartusActivityTest() {
        super("org.martus.android", MartusActivity.class);
    }

}
