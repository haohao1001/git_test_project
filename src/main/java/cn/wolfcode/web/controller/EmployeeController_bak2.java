package cn.wolfcode.web.controller;

import cn.wolfcode.domain.Employee;
import cn.wolfcode.util.JsonResult;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

// @RestController// @ResponseBody + @Controller
public class EmployeeController_bak2 {

    // 所有员工数据
    // @RequestMapping(value = "/employees",method = RequestMethod.GET)
    @GetMapping("/employees")
    public List<Employee> list() {
        return Arrays.asList(new Employee(1L,"小明",18),new Employee(2L,"小羊",20));
    }

    // 员工添加
    // @RequestMapping(value = "/employees",method = RequestMethod.POST)
    @PostMapping("/employees")
    public Employee save(Employee employee) {
        employee.setId(1L);
        return employee;
    }

    // 员工删除
    // @RequestMapping(value = "/employees/{id}",method = RequestMethod.DELETE)
    // {id} : 使用参数路径方式，将参数作为路径的一部分
    // @PathVariable : 参数取值，将URL中占位符参数绑定到控制器处理方法的入参中
    @DeleteMapping("/employees/{id}")
    public JsonResult delete(@PathVariable("id") Long id) {
        return JsonResult.success("删除的ID ：" + id);
    }

    // 员工修改
    // @RequestMapping(value = "/employees",method = RequestMethod.PUT)
    @PutMapping("/employees")
    public Employee update(Employee employee) {
        employee.setName(employee.getName() + "——update");
        return employee;
    }

    // 查询指定员工
    // @RequestMapping(value = "/employees/{id}",method = RequestMethod.GET)
    @GetMapping("/employees/{id}")
    public Employee get(@PathVariable("id") Long id) {
        return new Employee(id,"笑话",19);
    }

}
