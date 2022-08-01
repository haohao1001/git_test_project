package cn.wolfcode.web.controller;

import cn.wolfcode.domain.Employee;
import cn.wolfcode.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class Test1Controller {

    @RequestMapping(value = "/students",method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> list() {
        return Arrays.asList(new Employee(66L,"小小",12),new Employee(33L,"大大",88));
    }

    @RequestMapping(value = "/students",method = RequestMethod.POST)
    @ResponseBody
    public Employee save(Employee employee) {
        employee.setId(77L);
        return employee;
    }

    @RequestMapping(value = "/students/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public JsonResult delete(@PathVariable("id") Long id) {
        return JsonResult.success("删除id:" + id);
    }

    @RequestMapping(value = "/students",method = RequestMethod.PUT)
    @ResponseBody
    public Employee update(Employee employee) {
        employee.setName(employee.getName() + "——update");
        return employee;
    }

    @RequestMapping(value = "/students/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Employee get(@PathVariable("id") Long id) {
        return new Employee(id,"小狗",5);
    }

}
