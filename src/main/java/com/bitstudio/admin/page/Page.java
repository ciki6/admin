package com.bitstudio.admin.page;

import com.bitstudio.admin.param.PageParam;

import java.io.Serializable;
import java.util.List;

public class Page<E> implements Serializable {
    private static final long servalVersionUID = 3221336171072264769L;

    private int currentPage = 1;
    private long totalPage;
    private long totalNumber;
    private List list;

    public Page(PageParam pageParam, long totalNumber, List list){
        this.currentPage = pageParam.getCurrentPage();
        this.totalNumber = totalNumber;
        this.list = list;
        this.totalPage = (long) Math.ceil((double) totalNumber/pageParam.getPageSize());
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(long totalNumber) {
        this.totalNumber = totalNumber;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
