package com.bawei.zhujinru20200108.model;

import com.bawei.zhujinru20200108.contract.HomeContract;
import com.bawei.zhujinru20200108.contract.ZContract2;
import com.bawei.zhujinru20200108.model.bean.DzBean;
import com.bawei.zhujinru20200108.util.NetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HomeModel2 implements ZContract2.IModel2 {


    @Override
    public void zgetHomeData2(ZIModelCallBack2 ziModelCallBack2) {
        NetUtil.getInstance().getApi().dizhi("13108","157853091125613108").subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DzBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(DzBean dzBean) {
                       ziModelCallBack2.ZHomeSuccess2(dzBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                     ziModelCallBack2.ZHomeFailure2(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
