package com.izelozarslan.homework2.service;

import com.izelozarslan.homework2.general.BaseEntityService;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserService extends BaseEntityService {
    public UserService(JpaRepository repository) {
        super(repository);
    }
}
