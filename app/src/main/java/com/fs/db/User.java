package com.fs.db;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by fangdean on 2016/3/30.
 */
public class User extends BaseObservable {
    private String name;
    private Integer age;
    private String gender;
    private String addr;

    public User() {
    }

    public User(String name, int age, String gender, String addr) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addr = addr;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.fs.db.BR.name);
    }

    @Bindable
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
        notifyPropertyChanged(com.fs.db.BR.age);
    }

    @Bindable
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        notifyPropertyChanged(com.fs.db.BR.gender);
    }

    @Bindable
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
        notifyPropertyChanged(com.fs.db.BR.addr);
    }
}
