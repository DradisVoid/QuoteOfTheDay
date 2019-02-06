package edu.andrews.cptr252.arn.quoteoftheday;

/** Model for a quote */
public class Quote {
    /** Reference to quote text */
    private int mQuote;

    /** Reference to quote author */
    private int mAuthor;

    /** Reference to author's fact */
    private int mAuthorFact;

    /**
     * Create a new quote
     * @param quote     Resource id for quote text
     * @param author    Resource id for quote author
     * @param authorFact    Resource id for fact about author
     */
    public Quote(int quote, int author, int authorFact) {
        mQuote = quote;
        mAuthor = author;
        mAuthorFact = authorFact;
    }

    /** Getters and setters */
    public int getQuote() {
        return mQuote;
    }

    public void setQuote(int mQuote) {
        this.mQuote = mQuote;
    }

    public int getAuthor() {
        return mAuthor;
    }

    public void setAuthor(int mAuthor) {
        this.mAuthor = mAuthor;
    }

    public int getAuthorFact() {
        return mAuthorFact;
    }

    public void setAuthorFact(int mAuthorFact) {
        this.mAuthorFact = mAuthorFact;
    }
}
