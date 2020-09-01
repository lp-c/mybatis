package mybatis.params;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * @author lp
 * @date 2020/9/1 14:43
 */
public class RestResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer code;						//1成功，其他失败

    private String message;						//提示信息		失败信息

    //public String errorCode;					//如失败，错误类型代码

    @SuppressWarnings("deprecation")
    @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private T data;						//返回数据

    public RestResult() {

    }

    public RestResult(Integer code) {
        this.code = code;
    }

    public RestResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public RestResult(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public RestResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

	/*public RestRequestResult(Integer code, String message, String errorCode) {
		this.code = code;
		this.message = message;
		this.errorCode = errorCode;
	}

	public RestRequestResult(Integer code, String message, String errorCode, Object data) {
		this.code = code;
		this.message = message;
		this.errorCode = errorCode;
		this.data = data;
	}*/

    public Integer getCode() {
        return code==null?0:code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message == null?"":message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	/*public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}*/

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> RestResult<T> wrapResponse(Integer code, String msg, T data){
        return new RestResult<T>(code, msg, data);
    }

    public static <T> RestResult<T> wrapSuccessResponse(){
        return new RestResult<T>(AbstractRestConstants.RESPONSE_CODE_SUCCESS);
    }

    public static <T> RestResult<T> wrapSuccessResponse(T data){
        return new RestResult<T>(AbstractRestConstants.RESPONSE_CODE_SUCCESS, data);
    }

    public static <T> RestResult<T> wrapErrorResponse(String msg){
        return new RestResult<T>(AbstractRestConstants.RESPONSE_CODE_FAILED, msg);
    }

    public static <T> RestResult<T> wrapErrorResponse(Integer code, String msg){
        return new RestResult<T>(code, msg);
    }
}
