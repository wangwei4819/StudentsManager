import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import site.beifeng.dao.StudentDao;
import site.beifeng.entity.Student;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/**
 * 测试类
 *
 * @author admin
 * @date 2020年 02月27日 23:35:03
 */

@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestStudentDao {
    @Autowired
    private StudentDao studentDao;

    @Rollback(false)
    @Transactional
    @Test
    public void TestAddStudent(){
        Student s=new Student();
        //生成不重复学号

        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式yyyyMMddHHmmss
        StringBuilder newNo = new StringBuilder();
        //newNo.append(df.format(new Date()));
        long min = 1,max = 9;
        for (int i = 1; i < 6; i++) {
            min *= 10;
            max *= 10;
        }
        long rangeLong = (((long) (new Random().nextDouble() * (max - min)))) + min ;
        newNo.append(rangeLong);


        s.setStudent_id(Integer.parseInt(String.valueOf(newNo)));
        s.setName("李四");
        s.setSex("0");
        s.setAge(20);
        s.setBirthday(java.sql.Date.valueOf("1987-10-20"));
        studentDao.addStudent(s);
        System.out.println(studentDao.getTotal());

    }

}
