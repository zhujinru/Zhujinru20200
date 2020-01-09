package com.bawei.zhujinru20200108.view;

import android.os.Bundle;
import android.widget.TextView;

import com.bawei.zhujinru20200108.R;
import com.bawei.zhujinru20200108.base.BaseActivity;
import com.bawei.zhujinru20200108.contract.ZContract2;
import com.bawei.zhujinru20200108.model.bean.DzBean;
import com.bawei.zhujinru20200108.presenter.HomePresenter2;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main4Activity extends BaseActivity<HomePresenter2> implements ZContract2.ZIView2 {


    @BindView(R.id.sjr)
    TextView sjr;
    @BindView(R.id.sjhm)
    TextView sjhm;
    @BindView(R.id.szdq)
    TextView szdq;
    @BindView(R.id.xxdz)
    TextView xxdz;
    @BindView(R.id.yzbm)
    TextView yzbm;

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
        return R.layout.activity_main4;
    }

    @Override
    public void ZHomeSuccess2(DzBean dzBean) {
        DzBean.ResultBean resultBean = dzBean.getResult().get(0);
        sjr.setText(resultBean.getRealName());
        sjhm.setText(resultBean.getPhone()+"");
        xxdz.setText(resultBean.getAddress());
        yzbm.setText(resultBean.getZipCode()+"");
    }

    @Override
    public void ZHomeFailure2(Throwable throwable) {

    }
}
