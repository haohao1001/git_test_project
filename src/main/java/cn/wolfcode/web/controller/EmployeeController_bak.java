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

// @Controller
public class EmployeeController_bak {

    // 所有员工数据
    @RequestMapping(value = "/employees",method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> list() {
        return Arrays.asList(new Employee(1L,"小明",18),new Employee(2L,"小羊",20));
    }

    // 员工添加
    @RequestMapping(value = "/employees",method = RequestMethod.POST)
    @ResponseBody
    public Employee save(Employee employee) {
        employee.setId(1L);
        return employee;
    }

    // 员工删除
    @RequestMapping(value = "/employees/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public JsonResult delete(@PathVariable("id") Long id) {
        return JsonResult.success();
    }

    // 员工修改
    @RequestMapping(value = "/employees",method = RequestMethod.PUT)
    @ResponseBody
    public Employee update(Employee employee) {
        employee.setName(employee.getName() + "——update");
        return employee;
    }

    // 查询指定员工
    @RequestMapping(value = "/employees/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Employee get(@PathVariable("id") Long id) {
        return new Employee(id,"笑话",19);
    }

}
