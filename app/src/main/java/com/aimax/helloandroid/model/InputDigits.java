package com.aimax.helloandroid.model;

/**
 * Created by maximize on 9/25/2016 AD.
 */

public class InputDigits {

    private String mText;

    public InputDigits(String digits) {
        this.mText = digits;
    }

    public void add(String digits){
        mText += digits;
    }

    public void clear() {
        mText = "";
    }

    public String get() {
        return mText;
    }

    public void set(String mText) {
        this.mText = mText;
    }
}
