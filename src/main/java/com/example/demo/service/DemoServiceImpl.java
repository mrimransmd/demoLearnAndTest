package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.stereotype.Component;

import com.example.demo.exceptions.ConsumerWithException;
import com.example.demo.exceptions.CustomDemoException;
import com.example.demo.model.Employee;
import com.example.demo.model.Teacher;

@Component
public class DemoServiceImpl implements DemoService{

	@Override
	public String testRest() throws CustomDemoException{

		Employee em= new Employee("1002h", "Ename");
		
		List<Teacher> teacherList= new ArrayList<>();
		Teacher t1= new Teacher();
		Teacher t2= new Teacher();
		Teacher t3= new Teacher();
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		teacherList.stream().forEach(wrapper(t -> t.setTid(em.getEid())));
		return "From ServiceImpl";
		
	}

	
	private < R, E extends CustomDemoException>
    Consumer< R > wrapper(ConsumerWithException< R, E > fe) {
        return arg -> {
            try {
                fe.apply(arg);
            } catch (CustomDemoException e) {
                throw new CustomDemoException(e.getMessage());
            }
        };
}
}
