package vttp2023.batch3.ssf.frontcontroller.respositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import vttp2023.batch3.ssf.frontcontroller.model.Login;

@Repository
public class AuthenticationRepository {
    @Autowired 
    @Qualifier("username")
    private RedisTemplate<String, Object> template;

    public void save(Login l ){
        template.opsForValue()
            .set(l.getUsername(), l.getUsername()toJSON().toString());

    }

    }


