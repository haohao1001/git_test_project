package cn.wolfcode.web.controller;

import cn.wolfcode.domain.Employee;
import cn.wolfcode.util.JsonResult;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController// @ResponseBody + @Controller
@RequestMapping("/employees")
public class EmployeeController {

    // 所有员工数据
    @GetMapping
    public List<Employee> list() {
        return Arrays.asList(new Employee(1L,"小明",99),new Employee(2L,"小羊",88));
    }

    // 员工添加
    @PostMapping
    public Employee save(Employee employee) {
        employee.setId(1L);
        return employee;
    }

    // 员工删除
    @DeleteMapping("/{id}")
    public JsonResult delete(@PathVariable("id") Long id) {
        return JsonResult.success("删除的ID ：" + id);
    }

    // 员工修改
    @PutMapping
    public Employee update(Employee employee) {
        employee.setName(employee.getName() + "——update");
        return employee;
    }

    @GetMapping(value = "/{id}",headers = "content-type=application/xml")
    public Employee get(@PathVariable("id") Long id) {
        return new Employee(id,"笑话",19);
    }

}
