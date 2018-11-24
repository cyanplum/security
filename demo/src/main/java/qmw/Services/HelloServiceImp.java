package qmw.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qmw.Hello.Hello;
import qmw.dao.Mapper;


@Service
public class HelloServiceImp implements HelloService{

    @Autowired
    private Mapper mapper;


    @Override
    public Hello getId(Integer id) {
        return mapper.getHello(id);
    }

    @Override
    public Hello delId(Integer id) {
        return mapper.delHello(id);
    }

    @Override
    public int addId(Hello hello) {

        return mapper.addHello(hello);
    }

    @Override
    public int updateId(Integer id, Hello hello) {
        return mapper.updateGHello(id,hello);
    }
}
