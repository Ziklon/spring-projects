package com.darkbit.appfarquisa.util;

public class Pagination {

	private Integer start;
	private Integer limit = Constant.PAGINATION_SIZE;
	private Long totalCount;

	public Pagination() {
		start = 0;
		totalCount=0L;
	}

	public Pagination(Integer start, Integer limit) {
		this.limit = limit;
		this.start = start;
		this.totalCount=0L;
	}

	public Pagination(Integer start) {
		this.totalCount=0L;
		this.start = start;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	

}
