package com.bawei.zhujinru20200108.presenter;

import com.bawei.zhujinru20200108.base.BasePresenter;
import com.bawei.zhujinru20200108.contract.HomeContract;
import com.bawei.zhujinru20200108.model.HomeModel;
import com.bawei.zhujinru20200108.model.bean.XqBean;

public class HomePresenter extends BasePresenter<HomeContract.IView> implements HomeContract.IPresenter {

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    @Override
    public void getHomeData() {
      homeModel.getHomeData(new HomeContract.IModel.IModelCallBack() {
          @Override
          public void HomeSuccess(XqBean xqBean) {
              view.HomeSuccess(xqBean);
          }

          @Override
          public void HomeFailure(Throwable throwable) {
             view.HomeFailure(throwable);
          }
      });
    }
}
