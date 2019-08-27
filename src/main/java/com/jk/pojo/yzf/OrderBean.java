package com.jk.pojo.yzf;

import java.math.BigDecimal;

public class OrderBean {

    /**
     * 主键
     */
    private Long id;
    /**
     * 创建时间
     */
    private String gmtCreate;
    /**
     * 修改时间
     */
    private String gmtModified;
    /**
     * 讲师用户编号
     */
    private Long lecturerUserNo;
    /**
     * 讲师名称
     */
    private String lecturerName;
    /**
     * 用户编号
     */
    private Long userNo;
    /**
     * 用户电话
     */
    private String mobile;
    /**
     * 用户注册时间
     */
    private String registerTime;
    /**
     * 订单号
     */
    private Long orderNo;
    /**
     * 课程ID
     */
    private Long courseId;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 应付金额
     */
    private BigDecimal pricePayable;
    /**
     * 优惠金额
     */
    private BigDecimal priceDiscount;
    /**
     * 实付金额
     */
    private BigDecimal pricePaid;
    /**
     * 平台收入
     */
    private BigDecimal platformProfit;
    /**
     * 讲师收入
     */
    private BigDecimal lecturerProfit;
    /**
     * 交易类型：1线上支付，2线下支付
     */
    private Integer tradeType;
    /**
     * 支付方式：1微信支付，2支付宝支付，3积分支付，4手工录单
     */
    private Integer payType;
    /**
     * 购买渠道：1web，2pp，3微信，4手工绑定
     */
    private Integer channelType;
    /**
     * 订单状态：1待支付，2成功支付，3支付失败，4已关闭，5已退款，6订单解绑
     */
    private Integer orderStatus;
    /**
     * 是否显示给讲师(1是，0否)
     */
    private Integer isShowLecturer;
    /**
     * 是否显示给用户看(1是，0否)
     */
    private Integer isShowUser;
    /**
     * 客户备注
     */
    private String remarkCus;
    /**
     * 后台备注
     */
    private String remark;
    /**
     * 支付时间
     */
    private String payTime;
    private String beginPayTime;

    private String endPayTime;
    private BigDecimal beginPaidPrice;

    private BigDecimal endPaidPrice;
    /**
     * 开始时间
     */
    private String beginCreate;
    /**
     * 结束时间
     */
    private String endCreate;
    private BigDecimal lecturerIncome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getLecturerUserNo() {
        return lecturerUserNo;
    }

    public void setLecturerUserNo(Long lecturerUserNo) {
        this.lecturerUserNo = lecturerUserNo;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public BigDecimal getPricePayable() {
        return pricePayable;
    }

    public void setPricePayable(BigDecimal pricePayable) {
        this.pricePayable = pricePayable;
    }

    public BigDecimal getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(BigDecimal priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public BigDecimal getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(BigDecimal pricePaid) {
        this.pricePaid = pricePaid;
    }

    public BigDecimal getPlatformProfit() {
        return platformProfit;
    }

    public void setPlatformProfit(BigDecimal platformProfit) {
        this.platformProfit = platformProfit;
    }

    public BigDecimal getLecturerProfit() {
        return lecturerProfit;
    }

    public void setLecturerProfit(BigDecimal lecturerProfit) {
        this.lecturerProfit = lecturerProfit;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getIsShowLecturer() {
        return isShowLecturer;
    }

    public void setIsShowLecturer(Integer isShowLecturer) {
        this.isShowLecturer = isShowLecturer;
    }

    public Integer getIsShowUser() {
        return isShowUser;
    }

    public void setIsShowUser(Integer isShowUser) {
        this.isShowUser = isShowUser;
    }

    public String getRemarkCus() {
        return remarkCus;
    }

    public void setRemarkCus(String remarkCus) {
        this.remarkCus = remarkCus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getBeginPayTime() {
        return beginPayTime;
    }

    public void setBeginPayTime(String beginPayTime) {
        this.beginPayTime = beginPayTime;
    }

    public String getEndPayTime() {
        return endPayTime;
    }

    public void setEndPayTime(String endPayTime) {
        this.endPayTime = endPayTime;
    }

    public BigDecimal getBeginPaidPrice() {
        return beginPaidPrice;
    }

    public void setBeginPaidPrice(BigDecimal beginPaidPrice) {
        this.beginPaidPrice = beginPaidPrice;
    }

    public BigDecimal getEndPaidPrice() {
        return endPaidPrice;
    }

    public void setEndPaidPrice(BigDecimal endPaidPrice) {
        this.endPaidPrice = endPaidPrice;
    }

    public String getBeginCreate() {
        return beginCreate;
    }

    public void setBeginCreate(String beginCreate) {
        this.beginCreate = beginCreate;
    }

    public String getEndCreate() {
        return endCreate;
    }

    public void setEndCreate(String endCreate) {
        this.endCreate = endCreate;
    }

    public BigDecimal getLecturerIncome() {
        return lecturerIncome;
    }

    public void setLecturerIncome(BigDecimal lecturerIncome) {
        this.lecturerIncome = lecturerIncome;
    }
}
