package java.org.myproject.boot.application.admin.db.converter;

import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;
import org.myproject.boot.application.admin.db.pojo.SysRoleVo;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 23:16
 */
@Mapper(componentModel = "spring")
public interface SysRoleConverter {
    SysRole voToPo(SysRoleVo sysRoleVo);

    SysRoleQuery convert(org.myproject.boot.application.admin.pojo.SysRoleQuery query);

    PageInfo<org.myproject.boot.application.admin.pojo.SysRole> convert(PageInfo<SysRole> pageInfo);

    List<org.myproject.boot.application.admin.pojo.SysRole> convert(List<SysRole> selectByQuery);

    org.myproject.boot.application.admin.pojo.SysRole convert(SysRole selectByPrimaryKey);

    SysRole convert(org.myproject.boot.application.admin.pojo.SysRoleVo sysRoleVo);
}
