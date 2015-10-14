package info.suwahayato.travissample;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import org.junit.Test;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testActivityExists() {

        MainActivity activity = getActivity();
        assertNotNull(activity);
    }

    @Test
    public void testMessageText() {

        MainActivity activity = getActivity();
        TextView textView = (TextView) activity.findViewById(R.id.text);
        String actualMessage = textView.getText().toString();
        assertEquals("Hello TDD!", actualMessage);
    }
}
