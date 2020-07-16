package org.person.dy.business.domain._do;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/3/28 22:47
 */


public enum ServiceCode {
    SUCCESS                 ("0000", "success"),
    ERROR                   ("0001", "server error"),
    AUTHENTICATED_FAILED    ("0002", "authenticated failed"),
    PERMISSION_LIMITED       ("0003", "permission limited");

    private String code;
    private String msg;

    private ServiceCode(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
