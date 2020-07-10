package java.org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbCustomerLog extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long customerId;
    private String customerName;
    private String content;
}