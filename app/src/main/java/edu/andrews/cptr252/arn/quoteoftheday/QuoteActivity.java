package edu.andrews.cptr252.arn.quoteoftheday;

import android.support.v4.app.Fragment;

/**
 * Activity for displaying a list of quotes
 */

public class QuoteActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new QuoteFragment();
    }
}
