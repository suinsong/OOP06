package com.bit.oop6.vo;

public class BookVO {

	private String strTitle;
	private String strAuthor;
	private int intPrice;

	// 슈퍼 생성자
	public BookVO() {
		super();

	}

	// 멤버 초기화 생성자
	public BookVO(String strTitle, String strAuthor, int intPrice) {
		super();
		this.strTitle = strTitle;
		this.strAuthor = strAuthor;
		this.intPrice = intPrice;
	}

	public String getStrTitle() {
		return strTitle;
	}

	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}

	public String getStrAuthor() {
		return strAuthor;
	}

	public void setStrAuthor(String strAuthor) {
		this.strAuthor = strAuthor;
	}

	public int getIntPrice() {
		return intPrice;
	}

	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}

	@Override
	public String toString() {
		return "BookVO [strTitle=" + strTitle + ", strAuthor=" + strAuthor + ", intPrice=" + intPrice + "]";
	}

}
