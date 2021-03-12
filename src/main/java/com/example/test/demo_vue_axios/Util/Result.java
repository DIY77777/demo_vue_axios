package com.example.test.demo_vue_axios.Util;

public class Result {

    private int code;
    private String msg;
    private Object data;

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public static Result ok() {
        return new Result(200, "StatusCode.OK", "成功");
    }

    /**
     * 返回成功消息
     * @return Result
     */
    public static Result ok(Object data) {
        return new Result(200, "成功", data);
    }

    /**
     * 返回成功消息
     * @return Result
     */
    public static Result ok(String message, Object data) {
        return new Result( 200, message, data);
    }

    /**
     * 返回失败消息
     * @return Result
     */
    public static Result error(String message) {
        return new Result(500, "StatusCode.ERROR", message);
    }

    /**
     * 返回登录失败的消息：用户名或密码错误
     * @return Result
     */
    public static Result loginError() {
        return new Result(500, "StatusCode.LOGINERROR", "用户名或密码错误");
    }

    /**
     * 返回权限不足
     * @return Result
     */
    public static Result accessError() {
        return new Result(403, "StatusCode.ACCESSERROR", "权限不足");
    }

    /**
     * 返回远程调用失败
     * @return Result
     */
    public static Result remoteError() {
        return new Result(500, "StatusCode.REMOTEERROR", "远程调用失败");
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
