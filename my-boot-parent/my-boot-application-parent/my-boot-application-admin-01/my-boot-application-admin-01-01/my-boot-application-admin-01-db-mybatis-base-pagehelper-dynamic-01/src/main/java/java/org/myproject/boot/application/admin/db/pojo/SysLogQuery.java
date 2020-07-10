package java.org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysLogQuery extends BaseEntity implements Serializable, MybatisExample<SysLogExample> {
    private static final long serialVersionUID = 1L;
    private String url;
    private String method;
    private String params;
}