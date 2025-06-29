import org.example.WeatherApiClient;
import org.example.WeatherService;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
public class WeatherServiceTest {

    @Test
    public void testweather(){
        WeatherApiClient mockApi = mock(WeatherApiClient.class);
        when(mockApi.getWeather("Jaipur")).thenReturn("Cloudy");

        // Act: inject mock into service
        WeatherService service = new WeatherService(mockApi);
        String result = service.getweatherReport("Jaipur");

        // Assert: verify output
        assertEquals("The weather in Jaipur is Cloudy", result);
    }
}
