package com.bawei.zhujinru20200108.view;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.zhujinru20200108.R;
import com.bawei.zhujinru20200108.base.BaseActivity;
import com.bawei.zhujinru20200108.contract.HomeContract;
import com.bawei.zhujinru20200108.model.bean.XqBean;
import com.bawei.zhujinru20200108.presenter.HomePresenter;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<HomePresenter> implements HomeContract.IView {

    @BindView(R.id.image1)
    ImageView image1;
    @BindView(R.id.textname)
    TextView textname;
    @BindView(R.id.textprice)
    TextView textprice;

    @Override
    protected HomePresenter providerPresenter() {
        return new HomePresenter();
    }

    @Override
    protected void initData() {
        mPresenter.getHomeData();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void HomeSuccess(XqBean xqBean) {
        String s = new Gson().toJson(xqBean);
        List<XqBean.ResultBean> result = xqBean.getResult();

        XqBean.ResultBean resultBean = result.get(0);
        String categoryName = resultBean.getCategoryName();
        XqBean.ResultBean.ShoppingCartListBean shoppingCartListBean = resultBean.getShoppingCartList().get(0);
        String commodityName = shoppingCartListBean.getCommodityName();
        int price = shoppingCartListBean.getPrice();
        String pic = shoppingCartListBean.getPic();
        Glide.with(image1).load(pic).into(image1);
        textname.setText(commodityName);
        textprice.setText(price+"");

    }

    @Override
    public void HomeFailure(Throwable throwable) {

    }

}
