package mybatis.test.exception;

import lombok.Data;

/**
 * @author lp
 * @date 2020/8/29 11:22
 */

@Data
public class ErrorResponse {
    private String message;
    private String errorTypeName;

    public ErrorResponse(Exception e){
        this(e.getClass().getName(),e.getMessage());
    }

    public ErrorResponse(String errorTypeName, String message) {
        this.errorTypeName=errorTypeName;
        this.message=message;
    }
}
