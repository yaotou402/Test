package com.model;

//import com.iec.scf.sdk.model.BaseEntity;

/**
 * 流动资金贷款信息
 * @author  chenshiyao
 * @date:  2017年7月10日 上午10:57:23
 */
public class LiquidityLoanInfo /*extends BaseEntity*/ {

	/*生成序列号*/

	/**
	 * 融资协议编号
	 */
	private String serno;
	/**
	 * 客户名称
	 */
	private String customerName;
	/**
	 * 客户身份
	 */
	private String customerType;
	/**
	 * 资金账号
	 */
	private String accountNo;
	/**
	 * 授信额度
	 */
	private Double lmtAmount ;
	/**
	 * 贷款金额
	 */
	private Double loadAmount ;
	/**
	 * 贷款日
	 */
	private String releaseDate;
	/**
	 * 贷款到期日
	 */
	private String loadDueDate;
	/**
	 * 贷款利率
	 */
	private Double loadRate;
	/**
	 * 贷款期限
	 */
	private String loadTerm;
	/**
	 * 已还金额
	 */
	private Double paidAmount;
	/**
	 * 待还本金
	 */
	private Double debtPrincipal;
	/**
	 * 待还利息
	 */
	private Double debtInterest;
	/**
	 * 客户号
	 */
	private String cusId;
	/**
	 * 贷款状态
	 */
	private String loadState;
	public String getSerno() {
		return serno;
	}
	public void setSerno(String serno) {
		this.serno = serno;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Double getLmtAmount() {
		return lmtAmount;
	}
	public void setLmtAmount(Double lmtAmount) {
		this.lmtAmount = lmtAmount;
	}
	public Double getLoadAmount() {
		return loadAmount;
	}
	public void setLoadAmount(Double loadAmount) {
		this.loadAmount = loadAmount;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getLoadDueDate() {
		return loadDueDate;
	}
	public void setLoadDueDate(String loadDueDate) {
		this.loadDueDate = loadDueDate;
	}
	public Double getLoadRate() {
		return loadRate;
	}
	public void setLoadRate(Double loadRate) {
		this.loadRate = loadRate;
	}
	public String getLoadTerm() {
		return loadTerm;
	}
	public void setLoadTerm(String loadTerm) {
		this.loadTerm = loadTerm;
	}
	public Double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(Double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public Double getDebtPrincipal() {
		return debtPrincipal;
	}
	public void setDebtPrincipal(Double debtPrincipal) {
		this.debtPrincipal = debtPrincipal;
	}
	public Double getDebtInterest() {
		return debtInterest;
	}
	public void setDebtInterest(Double debtInterest) {
		this.debtInterest = debtInterest;
	}
	public String getCusId() {
		return cusId;
	}
	public void setCusId(String cusId) {
		this.cusId = cusId;
	}
	public String getLoadState() {
		return loadState;
	}
	public void setLoadState(String loadState) {
		this.loadState = loadState;
	}
	
	
}
