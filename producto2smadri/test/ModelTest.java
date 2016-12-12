import java.util.*;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import static play.test.Helpers.*;

import models.*;

import com.avaje.ebean.*;

public class ModelTest {
    
    private String formatted(Date date) {
        return new java.text.SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    @Test
    public void findById() {
        running(fakeApplication(), new Runnable() {
           public void run() {
               menu macintosh = menu.find.byId(21L);
               assertThat(macintosh.name, equalTo("Macintosh"));
               assertThat(formatted(macintosh.introduced), equalTo("1984-01-24"));
           }
        });
    }
    
    @Test
    public void pagination() {
        running(fakeApplication(inMemoryDatabase()), new Runnable() {
           public void run() {
               PagedList<menu> computers = menu.page(1, 20, "name", "ASC", "");
               assertThat(computers.getTotalRowCount(), equalTo(574));
               assertThat(computers.getList().size(), equalTo(20));
           }
        });
    }
    
}
