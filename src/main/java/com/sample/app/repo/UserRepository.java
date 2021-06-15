package com.sample.app.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.app.entity.users;
@Repository
public interface UserRepository extends JpaRepository<users,Integer>{

}
