package mybatis.test.exception;

/**
 * @author lp
 * @date 2020/8/29 11:26
 */
public class ResourceNotFoundException extends RuntimeException{
    private String message;

    public ResourceNotFoundException(){
        super();
    }

    public ResourceNotFoundException(String message){
        super(message);
        this.message=message;
    }

    @Override
    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message=message;
    }
}
