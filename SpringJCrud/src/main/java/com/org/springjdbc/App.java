package com.org.springjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.org.springjdbc.dao.StudentDao;
import com.org.springjdbc.dao.StudentDaoImpl;
import com.org.springjdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext cntx = new  AnnotationConfigApplicationContext(Config.class);
        
        StudentDao dao = cntx.getBean("dao",StudentDaoImpl.class);
        
        Student s = new Student(); 
        
//        for insert records
        
//        
//		/*
//		 * s.setId(1); s.setName("Ganesh"); s.setSal(25000);
//		 */
        
		/*
		 * int r = dao.insert(s); System.out.println(r+"Row Inserted====");
		 */
        
        
//        for update records 
        
        
		/*
		 * s.setId(1); s.setName("shubham"); int r= dao.update(s);
		 * System.out.println("Roe Updated   " +r );
		 */
        
        //for delete record
        
		/*
		 * int r = dao.delete(1); System.out.println("Row Deleted " +r);
		 */
    }
}
