package vo;

public class ResultVo {
    private Integer code;
    private String msg;
    private Object data;

    public ResultVo() {
    }

    public ResultVo(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultVo success(Object data) {
        return success(200, "ok", data);
    }
    public static ResultVo success(Integer code, String msg, Object data) {
        return new ResultVo(code, msg, data);
    }

    public static ResultVo fail(String msg, Object data) {
        return fail(500, msg, data);
    }

    public static ResultVo fail(Integer code, String msg, Object data) {
        return new ResultVo(code, msg, data);
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
