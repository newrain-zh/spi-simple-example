import com.example.spi.LoggerService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LoggerService service = LoggerService.getService();

        service.info("Hello SPI");
        service.debug("Hello SPI");

    }
}