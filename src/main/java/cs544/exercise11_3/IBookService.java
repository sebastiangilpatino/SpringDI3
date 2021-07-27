package cs544.exercise11_3;

import org.springframework.stereotype.Component;

@Component
public interface IBookService {
	public void buy(Book book);

	public void addSupplier(IBookSupplier supplier);
}
