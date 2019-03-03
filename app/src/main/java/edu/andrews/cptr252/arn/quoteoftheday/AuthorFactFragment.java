package edu.andrews.cptr252.arn.quoteoftheday;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Fragment that displays a fact about the author of a quote.
 */
public class AuthorFactFragment extends Fragment {

    /** Reference to TextView for displaying an author fact */
    private TextView mAuthorFactTextView;

    public AuthorFactFragment() {
        // Required empty public constructor
    }

    /**
     * Inflate layout. Display the fact sent by QuoteActivity
     * @param savedInstanceState Bundle object used to save activity state.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_author_fact, container, false);

        // get reference to TextView for the fact
        mAuthorFactTextView = v.findViewById(R.id.authorFactTextView);

        // Extract the resource id for the fact from the intent
        // If none is provided, display "fact missing" message
        int authorFact = getActivity().getIntent().getIntExtra(QuoteFragment.EXTRA_AUTHOR_FACT, R.string.fact_error);

        // put the fact string in the fact TextView
        mAuthorFactTextView.setText(authorFact);

        return v;
    }

}
