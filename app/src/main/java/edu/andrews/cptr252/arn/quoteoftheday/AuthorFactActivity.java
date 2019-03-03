package edu.andrews.cptr252.arn.quoteoftheday;

import android.support.v4.app.Fragment;

/**
 * Activity for displaying an author fact
 */
public class AuthorFactActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new AuthorFactFragment();
    }
}
