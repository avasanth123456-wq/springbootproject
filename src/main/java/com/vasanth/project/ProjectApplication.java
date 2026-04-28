package com.vasanth.project;

import com.vasanth.project.config.Component1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
/*public class ProjectApplication {

public static void main(String[] args) {
		var context = SpringApplication.run(ProjectApplication.class, args);
        Component1 component1 = context.getBean(Component1.class);
        component1.checking();

	}

}*/
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
