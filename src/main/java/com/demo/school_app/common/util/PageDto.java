package com.demo.school_app.common.util;
 

import io.swagger.annotations.ApiModelProperty;

public class PageDto {
	@ApiModelProperty("总记录数")
    private Integer total;

    @ApiModelProperty("总页数")
    private Integer totalPage;

    @ApiModelProperty("每页记录数")
    private Integer pageSize;

    @ApiModelProperty("当前页数")
    private Integer current; 

    public PageDto() {
    }
  
    public void setTotal(int total, Integer current, Integer pageSize) {
        this.current = current;
        this.pageSize = pageSize;
        this.total = total;
        this.totalPage = (total / pageSize) + 1;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }
}
