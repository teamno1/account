package com.clz.modules.sys.domain.beans;

import com.clz.modules.sys.domain.entity.SysLog;

public class SysLogWithBLOBs extends SysLog {
    private String params;

    private String exception;

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }
}