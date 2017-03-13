package com.brianestrada.boilerplate.models.states;

import android.os.Parcel;

public class MainActivityState extends BaseState {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public MainActivityState() {
    }

    protected MainActivityState(Parcel in) {
    }

    public static final Creator<MainActivityState> CREATOR = new Creator<MainActivityState>() {
        @Override
        public MainActivityState createFromParcel(Parcel source) {
            return new MainActivityState(source);
        }

        @Override
        public MainActivityState[] newArray(int size) {
            return new MainActivityState[size];
        }
    };
}
