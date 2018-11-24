package qmw.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qmw.Hello.Hello;
import qmw.Services.HelloService;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/get/{id}")
    @ApiOperation(value ="查询信息" )
    public Hello getHello(@ApiParam(value = "信息id") @PathVariable int id)
    {
        Hello hello = helloService.getId(id);
        return hello;
    }

    @GetMapping("/del/{id}")
    public String delHello(@PathVariable int id){
        helloService.delId(id);
        return "删除成功";
    }
    @PostMapping("/del")
    @ApiOperation(value = "删除操作")
    public String addHello(@RequestBody Hello hello){
        helloService.addId(hello);
        return hello+"添加成功";
    }
    @PostMapping("/update/{id}")
    public Hello updateHello(@PathVariable int id,@RequestBody Hello hello){
        helloService.delId(id);
        return hello;
    }

}
