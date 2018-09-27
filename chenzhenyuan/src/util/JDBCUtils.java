package util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

public class JDBCUtils {

    private static DataSource dataSource;

    static{
        try {
            Properties properties = new Properties();
            properties.load(JDBCUtils.class.getResourceAsStream("/druid.properties"));
            dataSource= DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
}
