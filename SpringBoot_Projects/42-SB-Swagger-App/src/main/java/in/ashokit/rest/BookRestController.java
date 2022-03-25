package in.ashokit.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.Book;
import io.swagger.annotations.ApiOperation;

@RestController
public class BookRestController {

	@ApiOperation(value = "This operation is used to add book into database")
	@PostMapping(value = "/book", consumes = { "application/json" }, produces = { "text/plain" })
	public String addBook(@RequestBody Book book) {
		System.out.println(book);
		return "Success";
	}

}
