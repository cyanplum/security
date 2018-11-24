package qmw.Services;

import qmw.Hello.Hello;

public interface HelloService {
    Hello getId(Integer id);

    Hello delId(Integer id);

    int addId(Hello hello);

    int updateId(Integer id, Hello hello);

}
