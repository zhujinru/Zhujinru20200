package com.bawei.zhujinru20200108;

import com.bawei.zhujinru20200108.model.bean.DzBean;
import com.bawei.zhujinru20200108.model.bean.XqBean;

import org.greenrobot.eventbus.Subscribe;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface API {
    @GET("small/order/verify/v1/findShoppingCart")
    Observable<XqBean> xiangqing (@Header("userId") String userId , @Header("sessionId") String sessionId );
    @GET("small/user/verify/v1/receiveAddressList?userId=13108")
    Observable<DzBean> dizhi(@Header("userId") String userId , @Header("sessionId") String sessionId);
}
