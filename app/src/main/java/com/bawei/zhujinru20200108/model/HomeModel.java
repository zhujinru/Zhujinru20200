package com.bawei.zhujinru20200108.model;

import com.bawei.zhujinru20200108.contract.HomeContract;
import com.bawei.zhujinru20200108.model.bean.XqBean;
import com.bawei.zhujinru20200108.util.NetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HomeModel implements HomeContract.IModel {

    @Override
    public void getHomeData(IModelCallBack iModelCallBack) {
        NetUtil.getInstance().getApi().xiangqing("13108","157844424209413108").subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<XqBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(XqBean xqBean) {
                       iModelCallBack.HomeSuccess(xqBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iModelCallBack.HomeFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
