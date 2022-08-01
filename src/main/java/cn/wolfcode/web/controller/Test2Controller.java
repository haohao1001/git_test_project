package cn.wolfcode.web.controller;

import cn.wolfcode.domain.Employee;
import cn.wolfcode.util.JsonResult;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/departments")
public class Test2Controller {

    @GetMapping
    public List<Employee> list() {
        return Arrays.asList(new Employee(1L,"aaa",12),new Employee(2L,"sss",22));
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable("id") Long id) {
        return new Employee(id,"22",22);
    }

    @PostMapping
    public Employee save(Employee employee) {
        employee.setId(99L);
        return employee;
    }

    @DeleteMapping("/{id}")
    public JsonResult delete(@PathVariable Long id) {
        return JsonResult.success(id);
    }

    @PutMapping
    public Employee update(Employee employee) {
        employee.setName(employee.getName() + "_update");
        return employee;
    }

}
