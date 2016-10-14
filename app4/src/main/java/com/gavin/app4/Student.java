package com.gavin.app4;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Student extends BaseObservable {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.gavin.app4.BR.name);
    }
}
