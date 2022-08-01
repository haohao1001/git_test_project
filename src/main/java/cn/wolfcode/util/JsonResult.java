package cn.wolfcode.util;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JsonResult {

    private int code;

    private String msg;

    private Object data;

    public JsonResult() {
    }

    public JsonResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static JsonResult success() {
         return new JsonResult(200,"操作成功",null);
    }

    public static JsonResult success(Object data) {
        return new JsonResult(200,"操作成功",data);
    }

    public static JsonResult error(String msg) {
        return new JsonResult(500,msg,null);
    }

    public static JsonResult error() {
        return new JsonResult(500,"操作失败",null);
    }

    public static JsonResult error(Object data) {
        return new JsonResult(500,"操作失败",data);
    }

}
