import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface EmployeeMapper {

    @Select("SELECT * FROM employees WHERE id = #{id}")
    Employee getEmployeeById(@Param("id") int id);

    @Select("SELECT id, name, age, salary FROM employees")
    List<Employee> getAllEmployees();

    @Select("SELECT id, name, age, salary FROM employees WHERE name = #{name}")
    Employee getEmployeeByName(@Param("name") String name);

    @Select("SELECT id, name, age, salary FROM employees WHERE age > #{age}")
    List<Employee> getEmployeesOlderThan(@Param("age") int age);
}
