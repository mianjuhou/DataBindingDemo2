package com.fs.db;

import android.view.View;

import com.fs.db.databinding.ActivityMainBinding;

/**
 * Created by fangdean on 2016/3/30.
 */
public class Handlers {
    private ActivityMainBinding binding;
    private User user;

    public Handlers(ActivityMainBinding binding) {
        this.binding = binding;
        user = new User();
        binding.setUser(user);
    }

    public void initUser(View view) {
        user.setName("zhanglisong");
        user.setAge(26);
        user.setGender("man");
        user.setAddr("beijing");
    }

    public void changeUser(View view) {
        user.setName("zhanglisong");
    }

    public void clearUser(View view) {
        user.setName(null);
    }
}
