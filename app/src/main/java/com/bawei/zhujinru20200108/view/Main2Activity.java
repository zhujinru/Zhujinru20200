package com.bawei.zhujinru20200108.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bawei.zhujinru20200108.R;
import com.bawei.zhujinru20200108.base.BaseActivity;
import com.bawei.zhujinru20200108.base.BasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends BaseActivity {

    @BindView(R.id.shdz)
    TextView shdz;

    @Override
    protected BasePresenter providerPresenter() {
        return null;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
       shdz.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,Main3Activity.class));
           }
       });
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main2;
    }

}
