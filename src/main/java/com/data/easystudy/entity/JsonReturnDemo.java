package com.data.easystudy.entity;

import java.util.List;

/** @author Baijl
 * 2020/8/10 
 * 14:06 
 * @description json转化为java类
 */
public class JsonReturnDemo {
    /**
     * authUserId : 17463
     * name : 望断和
     * licensePlate :
     * vehicleType : 0
     * vehicleSweepType : 1
     * pushStatus : 0
     * makeBokTime : 2020-07-23 14:59:59
     * expireTime : 2020-07-24 18:19:14
     * suitcaseAddress : {"address":"测试外港港区","latitude":"30.324406","region":"1","longitude":"120.200667","addressId":"1"}
     * gateAddress : {"address":"杭州市富阳区********东桥","gateId":"4535","latitude":"30.054723","longitude":"119.966554"}
     * returnAddress : {"address":"外港","latitude":"30.308304","region":"1","longitude":"120.092406","addressId":"4"}
     * orderNo : 202007140000008-6
     * orders : [{"makeBokTime":"2020-07-25 10:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007140000008-25","containerSize":"40GP","containerType":2,"cargoWeight":10,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"测试用门点地址长城街22号\",\"gateId\":\"5482\",\"latitude\":\"30.339150215942\",\"longitude\":\"120.185080393564\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"2923\",\"rest_time\":\"0\",\"time\":\"619\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"4941\",\"rest_time\":\"0\",\"time\":\"639\"}","pushRules":"","expectGetTime":"2020-07-25 05:22:36","expectGetHours":"4.62"},{"makeBokTime":"2020-07-25 10:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007160000046-1","containerSize":"40GP","containerType":2,"cargoWeight":16,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"测试用门点地址长城街22号\",\"gateId\":\"5482\",\"latitude\":\"30.339150215942\",\"longitude\":\"120.185080393564\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"2923\",\"rest_time\":\"0\",\"time\":\"619\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"4941\",\"rest_time\":\"0\",\"time\":\"639\"}","pushRules":"","expectGetTime":"2020-07-25 05:22:44","expectGetHours":"4.62"},{"makeBokTime":"2020-07-25 10:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007160000046-8","containerSize":"40GP","containerType":2,"cargoWeight":16,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"测试用门点地址长城街22号\",\"gateId\":\"5482\",\"latitude\":\"30.339150215942\",\"longitude\":\"120.185080393564\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"2923\",\"rest_time\":\"0\",\"time\":\"619\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"4941\",\"rest_time\":\"0\",\"time\":\"639\"}","pushRules":"","expectGetTime":"2020-07-25 05:22:36","expectGetHours":"4.62"},{"makeBokTime":"2020-07-30 00:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007030000001-1","containerSize":"20GP","containerType":2,"cargoWeight":1,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"西猫狗\",\"gateId\":\"5454\",\"latitude\":\"30.31830637083\",\"longitude\":\"120.195488220058\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"216\",\"rest_time\":\"0\",\"time\":\"67\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"1742\",\"rest_time\":\"0\",\"time\":\"323\"}","pushRules":"","expectGetTime":"2020-07-25 05:13:32","expectGetHours":"114.77"},{"makeBokTime":"2020-07-25 10:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007200000014-1","containerSize":"20GP","containerType":2,"cargoWeight":10,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"测试用门点地址长城街22号\",\"gateId\":\"5482\",\"latitude\":\"30.339150215942\",\"longitude\":\"120.185080393564\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"2923\",\"rest_time\":\"0\",\"time\":\"619\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"4941\",\"rest_time\":\"0\",\"time\":\"639\"}","pushRules":"","expectGetTime":"2020-07-25 05:22:44","expectGetHours":"4.62"},{"makeBokTime":"2020-07-25 10:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007150000004-4","containerSize":"20GP","containerType":1,"cargoWeight":10,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"测试用门点地址长城街22号\",\"gateId\":\"5482\",\"latitude\":\"30.339150215942\",\"longitude\":\"120.185080393564\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"2923\",\"rest_time\":\"0\",\"time\":\"619\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"4941\",\"rest_time\":\"0\",\"time\":\"639\"}","pushRules":"","expectGetTime":"2020-07-25 05:22:36","expectGetHours":"4.62"}]
     */

    private DataBean data;
    /**
     * data : {"authUserId":17463,"name":"望断和","licensePlate":"","vehicleType":"0","vehicleSweepType":"1","pushStatus":0,"makeBokTime":"2020-07-23 14:59:59","expireTime":"2020-07-24 18:19:14","suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.324406\",\"region\":\"1\",\"longitude\":\"120.200667\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"杭州市富阳区********东桥\",\"gateId\":\"4535\",\"latitude\":\"30.054723\",\"longitude\":\"119.966554\"}","returnAddress":"{\"address\":\"外港\",\"latitude\":\"30.308304\",\"region\":\"1\",\"longitude\":\"120.092406\",\"addressId\":\"4\"}","orderNo":"202007140000008-6","orders":[{"makeBokTime":"2020-07-25 10:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007140000008-25","containerSize":"40GP","containerType":2,"cargoWeight":10,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"测试用门点地址长城街22号\",\"gateId\":\"5482\",\"latitude\":\"30.339150215942\",\"longitude\":\"120.185080393564\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"2923\",\"rest_time\":\"0\",\"time\":\"619\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"4941\",\"rest_time\":\"0\",\"time\":\"639\"}","pushRules":"","expectGetTime":"2020-07-25 05:22:36","expectGetHours":"4.62"},{"makeBokTime":"2020-07-25 10:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007160000046-1","containerSize":"40GP","containerType":2,"cargoWeight":16,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"测试用门点地址长城街22号\",\"gateId\":\"5482\",\"latitude\":\"30.339150215942\",\"longitude\":\"120.185080393564\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"2923\",\"rest_time\":\"0\",\"time\":\"619\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"4941\",\"rest_time\":\"0\",\"time\":\"639\"}","pushRules":"","expectGetTime":"2020-07-25 05:22:44","expectGetHours":"4.62"},{"makeBokTime":"2020-07-25 10:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007160000046-8","containerSize":"40GP","containerType":2,"cargoWeight":16,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"测试用门点地址长城街22号\",\"gateId\":\"5482\",\"latitude\":\"30.339150215942\",\"longitude\":\"120.185080393564\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"2923\",\"rest_time\":\"0\",\"time\":\"619\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"4941\",\"rest_time\":\"0\",\"time\":\"639\"}","pushRules":"","expectGetTime":"2020-07-25 05:22:36","expectGetHours":"4.62"},{"makeBokTime":"2020-07-30 00:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007030000001-1","containerSize":"20GP","containerType":2,"cargoWeight":1,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"西猫狗\",\"gateId\":\"5454\",\"latitude\":\"30.31830637083\",\"longitude\":\"120.195488220058\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"216\",\"rest_time\":\"0\",\"time\":\"67\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"1742\",\"rest_time\":\"0\",\"time\":\"323\"}","pushRules":"","expectGetTime":"2020-07-25 05:13:32","expectGetHours":"114.77"},{"makeBokTime":"2020-07-25 10:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007200000014-1","containerSize":"20GP","containerType":2,"cargoWeight":10,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"测试用门点地址长城街22号\",\"gateId\":\"5482\",\"latitude\":\"30.339150215942\",\"longitude\":\"120.185080393564\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"2923\",\"rest_time\":\"0\",\"time\":\"619\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"4941\",\"rest_time\":\"0\",\"time\":\"639\"}","pushRules":"","expectGetTime":"2020-07-25 05:22:44","expectGetHours":"4.62"},{"makeBokTime":"2020-07-25 10:00:00","expireTime":"2020-07-24 18:19:14","orderNo":"202007150000004-4","containerSize":"20GP","containerType":1,"cargoWeight":10,"suitcaseAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","gateAddress":"{\"address\":\"测试用门点地址长城街22号\",\"gateId\":\"5482\",\"latitude\":\"30.339150215942\",\"longitude\":\"120.185080393564\"}","returnAddress":"{\"address\":\"测试外港港区\",\"latitude\":\"30.318676549024\",\"region\":\"1\",\"longitude\":\"120.194115859887\",\"addressId\":\"1\"}","suitcaseGateInfo":"{\"unit\":\"3\",\"distance\":\"2923\",\"rest_time\":\"0\",\"time\":\"619\"}","gateReturnInfo":"{\"unit\":\"3\",\"distance\":\"4941\",\"rest_time\":\"0\",\"time\":\"639\"}","pushRules":"","expectGetTime":"2020-07-25 05:22:36","expectGetHours":"4.62"}]}
     * code : success
     */

    private String code;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class DataBean {
        private int authUserId;
        private String name;
        private String licensePlate;
        private String vehicleType;
        private String vehicleSweepType;
        private int pushStatus;
        private String makeBokTime;
        private String expireTime;
        private String suitcaseAddress;
        private String gateAddress;
        private String returnAddress;
        private String orderNo;
        /**
         * makeBokTime : 2020-07-25 10:00:00
         * expireTime : 2020-07-24 18:19:14
         * orderNo : 202007140000008-25
         * containerSize : 40GP
         * containerType : 2
         * cargoWeight : 10.0
         * suitcaseAddress : {"address":"测试外港港区","latitude":"30.318676549024","region":"1","longitude":"120.194115859887","addressId":"1"}
         * gateAddress : {"address":"测试用门点地址长城街22号","gateId":"5482","latitude":"30.339150215942","longitude":"120.185080393564"}
         * returnAddress : {"address":"测试外港港区","latitude":"30.318676549024","region":"1","longitude":"120.194115859887","addressId":"1"}
         * suitcaseGateInfo : {"unit":"3","distance":"2923","rest_time":"0","time":"619"}
         * gateReturnInfo : {"unit":"3","distance":"4941","rest_time":"0","time":"639"}
         * pushRules :
         * expectGetTime : 2020-07-25 05:22:36
         * expectGetHours : 4.62
         */

        private List<OrdersBean> orders;

        public int getAuthUserId() {
            return authUserId;
        }

        public void setAuthUserId(int authUserId) {
            this.authUserId = authUserId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public String getVehicleType() {
            return vehicleType;
        }

        public void setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
        }

        public String getVehicleSweepType() {
            return vehicleSweepType;
        }

        public void setVehicleSweepType(String vehicleSweepType) {
            this.vehicleSweepType = vehicleSweepType;
        }

        public int getPushStatus() {
            return pushStatus;
        }

        public void setPushStatus(int pushStatus) {
            this.pushStatus = pushStatus;
        }

        public String getMakeBokTime() {
            return makeBokTime;
        }

        public void setMakeBokTime(String makeBokTime) {
            this.makeBokTime = makeBokTime;
        }

        public String getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }

        public String getSuitcaseAddress() {
            return suitcaseAddress;
        }

        public void setSuitcaseAddress(String suitcaseAddress) {
            this.suitcaseAddress = suitcaseAddress;
        }

        public String getGateAddress() {
            return gateAddress;
        }

        public void setGateAddress(String gateAddress) {
            this.gateAddress = gateAddress;
        }

        public String getReturnAddress() {
            return returnAddress;
        }

        public void setReturnAddress(String returnAddress) {
            this.returnAddress = returnAddress;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public List<OrdersBean> getOrders() {
            return orders;
        }

        public void setOrders(List<OrdersBean> orders) {
            this.orders = orders;
        }

        public static class OrdersBean {
            private String makeBokTime;
            private String expireTime;
            private String orderNo;
            private String containerSize;
            private int containerType;
            private double cargoWeight;
            private String suitcaseAddress;
            private String gateAddress;
            private String returnAddress;
            private String suitcaseGateInfo;
            private String gateReturnInfo;
            private String pushRules;
            private String expectGetTime;
            private String expectGetHours;

            public String getMakeBokTime() {
                return makeBokTime;
            }

            public void setMakeBokTime(String makeBokTime) {
                this.makeBokTime = makeBokTime;
            }

            public String getExpireTime() {
                return expireTime;
            }

            public void setExpireTime(String expireTime) {
                this.expireTime = expireTime;
            }

            public String getOrderNo() {
                return orderNo;
            }

            public void setOrderNo(String orderNo) {
                this.orderNo = orderNo;
            }

            public String getContainerSize() {
                return containerSize;
            }

            public void setContainerSize(String containerSize) {
                this.containerSize = containerSize;
            }

            public int getContainerType() {
                return containerType;
            }

            public void setContainerType(int containerType) {
                this.containerType = containerType;
            }

            public double getCargoWeight() {
                return cargoWeight;
            }

            public void setCargoWeight(double cargoWeight) {
                this.cargoWeight = cargoWeight;
            }

            public String getSuitcaseAddress() {
                return suitcaseAddress;
            }

            public void setSuitcaseAddress(String suitcaseAddress) {
                this.suitcaseAddress = suitcaseAddress;
            }

            public String getGateAddress() {
                return gateAddress;
            }

            public void setGateAddress(String gateAddress) {
                this.gateAddress = gateAddress;
            }

            public String getReturnAddress() {
                return returnAddress;
            }

            public void setReturnAddress(String returnAddress) {
                this.returnAddress = returnAddress;
            }

            public String getSuitcaseGateInfo() {
                return suitcaseGateInfo;
            }

            public void setSuitcaseGateInfo(String suitcaseGateInfo) {
                this.suitcaseGateInfo = suitcaseGateInfo;
            }

            public String getGateReturnInfo() {
                return gateReturnInfo;
            }

            public void setGateReturnInfo(String gateReturnInfo) {
                this.gateReturnInfo = gateReturnInfo;
            }

            public String getPushRules() {
                return pushRules;
            }

            public void setPushRules(String pushRules) {
                this.pushRules = pushRules;
            }

            public String getExpectGetTime() {
                return expectGetTime;
            }

            public void setExpectGetTime(String expectGetTime) {
                this.expectGetTime = expectGetTime;
            }

            public String getExpectGetHours() {
                return expectGetHours;
            }

            public void setExpectGetHours(String expectGetHours) {
                this.expectGetHours = expectGetHours;
            }
        }
    }
}
