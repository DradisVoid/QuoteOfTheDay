package edu.andrews.cptr252.arn.quoteoftheday;

/** Model for a quote */
public class Quote {
    /** Reference to quote text */
    private int mQuote;
    /** Reference to quote author */
    private int mAuthor;
    /** Reference to author's fact */
    private int mAuthorFact;
    /** Reference to inspirational picture */
    private int mImage;

    /**
     * Create a new quote
     * @param quote     Resource id for quote text
     * @param author    Resource id for quote author
     * @param authorFact    Resource id for fact about author
     * @param image     Resource id for inspirational image
     */
    public Quote(int quote, int author, int authorFact, int image) {
        mQuote = quote;
        mAuthor = author;
        mAuthorFact = authorFact;
        mImage = image;
    }

    /**
     * Return quote resource value
     * @return Quote resource value
     */
    public int getQuote() {
        return mQuote;
    }

    /**
     * Set a new quote resource value
     * @param mQuote New resource value
     */
    public void setQuote(int mQuote) {
        this.mQuote = mQuote;
    }

    /**
     * Return the resource value for a quote's author
     * @return Resource value for author
     */
    public int getAuthor() {
        return mAuthor;
    }

    /**
     * Set the author's resource value
     * @param mAuthor New author resource value
     */
    public void setAuthor(int mAuthor) {
        this.mAuthor = mAuthor;
    }

    /**
     * Return resource value for author fact
     * @return Resource value for author fact
     */
    public int getAuthorFact() {
        return mAuthorFact;
    }

    /**
     * Set the resource value for the author fact
     * @param mAuthorFact New resource value
     */
    public void setAuthorFact(int mAuthorFact) {
        this.mAuthorFact = mAuthorFact;
    }

    /**
     * Return the resource value for the associated image
     * @return Resource value for image
     */
    public int getImage() {
        return mImage;
    }

    /**
     * Set a new resoure value for the image
     * @param mImage New resource value
     */
    public void setImage(int mImage) {
        this.mImage = mImage;
    }
}
