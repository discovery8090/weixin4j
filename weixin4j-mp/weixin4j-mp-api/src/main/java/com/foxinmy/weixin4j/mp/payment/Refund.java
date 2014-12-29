package com.foxinmy.weixin4j.mp.payment;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 退款记录
 * 
 * @className Refund
 * @author jy
 * @date 2014年11月1日
 * @since JDK 1.7
 * @see com.foxinmy.weixin4j.mp.payment.RefundDetail
 */
@XStreamAlias("xml")
public class Refund extends ApiResult {

	private static final long serialVersionUID = -2971132874939642721L;

	@XStreamAlias("transaction_id")
	private String transactionId;// 微信订单号
	@XStreamAlias("out_trade_no")
	private String orderNo;// 商户订单号
	@XStreamAlias("sub_mch_id")
	private String subMchId; //
	@XStreamAlias("refund_count")
	private int count;// 退款笔数
	private String partner; // 商户号V2
	private List<RefundDetail> details;

	public String getTransactionId() {
		return transactionId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public String getSubMchId() {
		return subMchId;
	}

	public int getCount() {
		return count;
	}

	public String getPartner() {
		return partner;
	}

	public List<RefundDetail> getDetails() {
		return details;
	}

	public void setDetails(List<RefundDetail> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Refund [transactionId=" + transactionId + ", orderNo="
				+ orderNo + ", subMchId=" + subMchId + ", count=" + count
				+ ", partner=" + partner + ", details=" + details
				+ ", " + super.toString() + "]";
	}
}