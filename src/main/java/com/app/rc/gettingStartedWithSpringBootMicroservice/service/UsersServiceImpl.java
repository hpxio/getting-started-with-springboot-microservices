package com.app.rc.gettingStartedWithSpringBootMicroservice.service;

import com.app.rc.gettingStartedWithSpringBootMicroservice.data.entity.UsersEntity;
import com.app.rc.gettingStartedWithSpringBootMicroservice.data.repository.UsersRepository;
import com.app.rc.gettingStartedWithSpringBootMicroservice.exception.UserNotFoundException;
import com.app.rc.gettingStartedWithSpringBootMicroservice.shared.dto.UsersDTO;
import com.app.rc.gettingStartedWithSpringBootMicroservice.shared.utils.RandomPlainTextKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UsersServiceImpl implements UsersService {

    final
    UsersRepository repository;

    @Autowired
    public UsersServiceImpl(UsersRepository repository) {
        this.repository = repository;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public UsersDTO getUserById(int id) {
        UsersDTO response = new UsersDTO();
        UsersEntity entity = repository.getUsersById(id);

        if (entity == null)
            throw new UserNotFoundException("User for ID: " + id + " does not exist!");

        BeanUtils.copyProperties(entity, response);
        return response;
    }

    /**
     * @param usersDto
     * @return
     */
    @Override
    public UsersDTO createUser(UsersDTO usersDto) {
        UsersDTO response = new UsersDTO();
        UsersEntity entity = new UsersEntity();

        BeanUtils.copyProperties(usersDto, entity);
        entity.setAccessKey(RandomPlainTextKeyGenerator.getString());
        entity.setStatus(true);

        UsersEntity result = repository.save(entity);

        BeanUtils.copyProperties(result, response);
        return response;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public int deleteUser(long id) {
        try {
            repository.deleteById(id);
        } catch (Exception ex) {
            throw new UserNotFoundException(ex.getMessage());
        }
        return 0;
    }
}
