package com.springcloud.user.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcloud.user.service.entiry.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long> {

}
