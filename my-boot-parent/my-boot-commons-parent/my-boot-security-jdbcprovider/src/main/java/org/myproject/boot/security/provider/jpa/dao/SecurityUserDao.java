package org.myproject.boot.security.provider.jpa.dao;

import org.myproject.boot.security.provider.jpa.pojo.SecurityUser;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-09 21:17
 */
@Repository
public interface SecurityUserDao extends JpaRepositoryImplementation<SecurityUser, Long> {
}
