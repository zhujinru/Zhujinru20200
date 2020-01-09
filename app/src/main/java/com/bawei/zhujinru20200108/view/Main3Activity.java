package com.bawei.zhujinru20200108.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.zhujinru20200108.R;
import com.bawei.zhujinru20200108.base.BaseActivity;
import com.bawei.zhujinru20200108.contract.ZContract2;
import com.bawei.zhujinru20200108.model.bean.DzBean;
import com.bawei.zhujinru20200108.presenter.HomePresenter2;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main3Activity extends BaseActivity<HomePresenter2> implements ZContract2.ZIView2 {

    @BindView(R.id.add)
    Button add;
    @BindView(R.id.rec)
    RecyclerView rec;
    @Override
    protected HomePresenter2 providerPresenter() {
        return new HomePresenter2();
    }

    @Override
    protected void initData() {
        mPresenter.zgetHomeData2();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main3;
    }

    @Override
    public void ZHomeSuccess2(DzBean dzBean) {
        List<DzBean.ResultBean> result = dzBean.getResult();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rec.setLayoutManager(linearLayoutManager);
        rec.setAdapter(new MyDZAdapter(result));
    }

    @Override
    public void ZHomeFailure2(Throwable throwable) {

    }


    @OnClick(R.id.add)
    public void onViewClicked() {
        startActivity(new Intent(Main3Activity.this,Main4Activity.class));
    }
}
