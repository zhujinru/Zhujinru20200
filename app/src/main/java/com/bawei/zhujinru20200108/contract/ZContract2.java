package com.bawei.zhujinru20200108.contract;

import com.bawei.zhujinru20200108.model.bean.DzBean;
import com.bawei.zhujinru20200108.model.bean.XqBean;

public interface ZContract2 {
    interface ZIView2{
        void ZHomeSuccess2(DzBean dzBean);
        void ZHomeFailure2(Throwable throwable);
    }
    interface ZIPresenter2{
        void zgetHomeData2();
    }
    interface IModel2{
        void zgetHomeData2(ZIModelCallBack2 ziModelCallBack2);
        interface ZIModelCallBack2{
            void ZHomeSuccess2(DzBean dzBean);
            void ZHomeFailure2(Throwable throwable);
        }
    }
}
