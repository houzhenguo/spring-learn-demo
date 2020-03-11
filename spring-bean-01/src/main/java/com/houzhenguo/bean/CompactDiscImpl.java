package com.houzhenguo.bean;

import org.springframework.stereotype.Component;

@Component // 定义成为组件
public class CompactDiscImpl implements CompactDisc {
    @Override
    public void play() {
        System.out.println("我是 CD子类，我开始播放");
    }
}
