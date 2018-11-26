package com.emptypocket.repo;

import com.emptypocket.bean.JpaBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<JpaBean, Integer> {
    Page<JpaBean> findAll(Pageable pageable);
}
