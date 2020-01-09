package com.bawei.zhujinru20200108.contract;

import com.bawei.zhujinru20200108.model.bean.XqBean;

public interface HomeContract {
    interface IView{
        void HomeSuccess(XqBean xqBean);
        void HomeFailure(Throwable throwable);
    }
    interface IPresenter{
        void getHomeData();
    }
    interface IModel{
        void getHomeData(IModelCallBack iModelCallBack);
        interface IModelCallBack{
            void HomeSuccess(XqBean xqBean);
            void HomeFailure(Throwable throwable);
        }
    }
}
