package mybatis.params;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lp
 * @date 2020/9/1 14:45
 */
public class AbstractRestConstants {
    //rest接口返回结果代码  命名规则 RESPONSE_CODE + "_" + 错误码类型
    public final static Integer RESPONSE_CODE_SUCCESS = 1;								//接口访问成功
    public final static Integer RESPONSE_CODE_FAILED = 0;								//接口访问失败

    //rest接口异常
    //接口公共错代码  命名规则 ERROR_CODE + "_" + 错误码类型
    public final static Integer ERROR_CODE_SERVICE_ERROR = 10000;						//服务异常错误
    public final static Integer ERROR_CODE_SYSTEM_ERROR = 10001;						//系统异常错误
    public final static Integer ERROR_CODE_SGIN_ERROR = 10002;							//参数签名验证错误
    public final static Integer ERROR_CODE_PARAM_ERROR = 10003;							//参数验证错误
    public final static Integer ERROR_CODE_TOKEN_LOGOUT = 10004;						//登录失效,请重新登陆
    public final static Integer ERROR_CODE_USER_NOT_FIND = 10005;						//用户不存在
    public final static Integer ERROR_CODE_TOKEN_EXPIRE = 10006;						//token过期
    public final static Integer ERROR_CODE_TOKEN_FAIL = 10007;							//token验证失败
    public final static Integer ERROR_CODE_NOT_LOGIN = 10008;							//未登录
    public final static Integer ERROR_CODE_AUTHORIZATION_INEXISTENCE = 10009;							//授权信息不存在

    public final static Integer ERROR_CODE_NULL_OBJ = 11000;    //空对象

    public static Map<Integer, String> commonErrorCodeMap = new HashMap<Integer, String>();

    static {
        initCommonErrorCodeMap(commonErrorCodeMap);
    }

    public static void initCommonErrorCodeMap(Map<Integer, String> commonErrorCodeMap) {
        //接口公共错代码
        commonErrorCodeMap.put(ERROR_CODE_SERVICE_ERROR, "服务异常错误");
        commonErrorCodeMap.put(ERROR_CODE_SYSTEM_ERROR, "系统异常错误");
        commonErrorCodeMap.put(ERROR_CODE_SGIN_ERROR, "签名验证错误");
        commonErrorCodeMap.put(ERROR_CODE_PARAM_ERROR, "参数验证错误");
        commonErrorCodeMap.put(ERROR_CODE_TOKEN_LOGOUT, "登录失效,请重新登录");
        commonErrorCodeMap.put(ERROR_CODE_USER_NOT_FIND, "用户不存在");
        commonErrorCodeMap.put(ERROR_CODE_TOKEN_EXPIRE, "登录过期,请重新登录");
        commonErrorCodeMap.put(ERROR_CODE_TOKEN_FAIL, "身份验证失败");
        commonErrorCodeMap.put(ERROR_CODE_NOT_LOGIN, "请先登录");
        commonErrorCodeMap.put(ERROR_CODE_NULL_OBJ, "空对象");
    }

    public static String getMessage(Integer errorCode) {
        return commonErrorCodeMap.get(errorCode);
    }

}
