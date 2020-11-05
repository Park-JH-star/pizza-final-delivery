
package pizza.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="grade", url="http://grade:8080")
//@FeignClient(name="grade", url="http://localhost:8086")
public interface GradeService {

    @RequestMapping(method= RequestMethod.POST, path="/grades")
    public void doGrade(@RequestBody Grade grade);

}