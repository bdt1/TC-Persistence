package io.zipcoder.persistenceapp;

/**
 * Created by O581051 on 8/31/2017.
 */
public class PersonService {
    private static final String SQL_INSERT_CAR =
            "insert into car (make, model, year) values (?, ?, ?)";

    @Autowired
    JdbcTemplate jdbcTemplate;
//some examples will use the superinterface JdbcOperations

    public void addCar(Car car){
        jdbcTemplate.update(SQL_INSERT_CAR,
                car.getMake(),
                car.getModel(),
                car.getYear());
    }
}
