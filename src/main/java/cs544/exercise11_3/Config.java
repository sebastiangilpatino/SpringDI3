package cs544.exercise11_3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public List<IBookSupplier> suppliers() {
		List<IBookSupplier> suppliers = new ArrayList<>();

		suppliers.add(new Amazon());
		suppliers.add(new EBooks());
		suppliers.add(new BarnesAndNoble());
		suppliers.add(new Borders());

		return suppliers;
	}

}
