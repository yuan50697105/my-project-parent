package org.myproject.app.db.commons.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-23 15:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class IPage<T> {
    private Long total;
    private List<T> list;
}