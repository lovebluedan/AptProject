package com.mzs.aptpro;

import android.util.Log;

/**
 * Create by ldr
 * on 2019/12/10 15:08.
 * 低配电脑
 */
public class LowConfigurationComputer implements Computer {
    private static final String TAG = "LowComputer";
    @Override
    public void screen() {
        System.out.println("低配置电脑 -- 屏幕");
    }

    @Override
    public void memoryBank() {
        System.out.println("低配置电脑 -- 内存条");
    }

    @Override
    public void mainBoard() {
        System.out.println("低配置电脑 -- 主板");
    }

    @Override
    public void graphicsCard() {
        System.out.println("低配置电脑 -- 显卡");
    }
}
