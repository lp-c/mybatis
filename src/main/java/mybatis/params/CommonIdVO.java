package mybatis.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lp
 * @date 2020/9/1 14:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonIdVO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private T id;

}
