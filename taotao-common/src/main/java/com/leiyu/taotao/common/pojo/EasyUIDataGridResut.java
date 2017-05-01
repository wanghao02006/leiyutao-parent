package com.leiyu.taotao.common.pojo;

import java.util.List;

/**
 * Created by wh on 2017/4/23.
 */
public class EasyUIDataGridResut {

    private long total;
    private List<?> rows;

    public EasyUIDataGridResut(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public long getTotal() {

        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
