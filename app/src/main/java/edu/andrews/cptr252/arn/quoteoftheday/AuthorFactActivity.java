package edu.andrews.cptr252.arn.quoteoftheday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AuthorFactActivity extends AppCompatActivity {
    private TextView mAuthorFactTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author_fact);

        // get reference to TextView for the fact
        mAuthorFactTextView = findViewById(R.id.authorFactTextView);

        // Extract the resource id for the fact from the intent
        // If none is provided, display "fact missing" message
        int authorFact = getIntent().getIntExtra(QuoteActivity.EXTRA_AUTHOR_FACT, R.string.fact_error);

        // put the fact string in the fact TextView
        mAuthorFactTextView.setText(authorFact);
    }
}
