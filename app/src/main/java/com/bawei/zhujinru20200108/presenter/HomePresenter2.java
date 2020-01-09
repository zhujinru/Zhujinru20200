package com.bawei.zhujinru20200108.presenter;

import com.bawei.zhujinru20200108.base.BasePresenter;
import com.bawei.zhujinru20200108.contract.ZContract2;
import com.bawei.zhujinru20200108.model.HomeModel2;
import com.bawei.zhujinru20200108.model.bean.DzBean;

public class HomePresenter2 extends BasePresenter<ZContract2.ZIView2>implements ZContract2.ZIPresenter2 {

    private HomeModel2 homeModel2;

    @Override
    protected void initModel() {
        homeModel2 = new HomeModel2();
    }

    @Override
    public void zgetHomeData2() {
      homeModel2.zgetHomeData2(new ZContract2.IModel2.ZIModelCallBack2() {
          @Override
          public void ZHomeSuccess2(DzBean dzBean) {
              view.ZHomeSuccess2(dzBean);
          }

          @Override
          public void ZHomeFailure2(Throwable throwable) {
             view.ZHomeFailure2(throwable);
          }
      });
    }
}
