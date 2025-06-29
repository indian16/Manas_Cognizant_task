import org.example.Notifier;
import org.example.Orderservice;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class OrderServiceTest {

    @Test
    public void check(){
        Notifier mocknotifier=mock(Notifier.class);

        Orderservice orderservice=new Orderservice(mocknotifier);

        orderservice.placeorder();
        verify(mocknotifier).sendNotification("Order placed successfully");
    }
}
