package com.bitstudio.admin.param;

public class PageParam {
    private int beginLine; //起始行
    private Integer pageSize = 3;
    private Integer currentPage = 1; //当前页

    /**
     * 自动计算起始行
     * @return 起始行
     */
    public int getBeginLine() {
        return pageSize * (currentPage - 1);
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
