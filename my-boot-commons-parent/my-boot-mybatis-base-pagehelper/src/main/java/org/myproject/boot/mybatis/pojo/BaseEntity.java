package org.myproject.boot.mybatis.pojo;

import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.myproject.boot.mybatis.annotation.Identify;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 02:18
 */
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {
    @Identify
    @AndEqualTo
    private Long id;
}