import com.NetworkUtils;
import org.junit.Test;

public class NetworkUtilsTest {
    @Test (timeout = 1000)
    public void getConnectionShouldReturnFasterThatOneSecond(){
        NetworkUtils.getConnection();
    }
}
