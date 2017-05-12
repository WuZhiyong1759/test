import com.jnshu.model.Student;
import com.jnshu.util.MemcachedUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tom on 2017/5/6.
 */
public class test {
//    @Before
//    public void Before() {
//       new ClassPathXmlApplicationContext(new String[] {"spring-memcached.xml"});
//        new ClassPathXmlApplicationContext("spring-memcached.xml");
//
//    }//进行加载

    @Test
    public void test7(){
//        boolean flag = MemcachedUtils.set("name", "吴志勇", new Date(1000 * 30));//1000*20代表20秒
//        System.out.println(flag);
//        Object obj = MemcachedUtils.get("name");
//        System.out.println(obj.toString());

        Jedis jedis = new Jedis("localhost");


        System.out.println("====|"+jedis);
//        System.out.println("Connection to server sucessfully");
//        jedis.set("student_1","chengkai");
//        System.out.println("redis 中的student_1的值为："+jedis.get("student_1"));
//
//        Student student1=new Student();
//        student1.setId(1);
//        student1.setName("chengkai");
//        student1.setPassword("123456");
//        Student student2=new Student();
//        student2.setId(1);
//        student2.setName("chengkai");
//        student2.setPassword("123456");
//
//        Map<String,Object> userMap=new HashMap<String,Object>();
//        userMap.put("stuList",student1);
//        userMap.put("stuList",student2);




    }

}
