package com.bawei.zhujinru20200108.model.bean;

import java.util.List;

public class DzBean {
    /**
     * result : [{"address":"北京 海淀区 八维","createTime":1578518684000,"id":38223,"phone":"15254221062","realName":"小猪猪","userId":13108,"whetherDefault":1,"zipCode":"410922"},{"address":"北京 海淀区 八维","createTime":1578581344000,"id":38378,"phone":"15254221062","realName":"小猪猪","userId":13108,"whetherDefault":2,"zipCode":"410922"},{"address":"北京 海淀区 八维","createTime":1578581360000,"id":38379,"phone":"15254221062","realName":"旺仔","userId":13108,"whetherDefault":2,"zipCode":"410922"}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * address : 北京 海淀区 八维
         * createTime : 1578518684000
         * id : 38223
         * phone : 15254221062
         * realName : 小猪猪
         * userId : 13108
         * whetherDefault : 1
         * zipCode : 410922
         */

        private String address;
        private long createTime;
        private int id;
        private String phone;
        private String realName;
        private int userId;
        private int whetherDefault;
        private String zipCode;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getWhetherDefault() {
            return whetherDefault;
        }

        public void setWhetherDefault(int whetherDefault) {
            this.whetherDefault = whetherDefault;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }
    }
}
