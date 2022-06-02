package kz.ne.railways.asudkr.os.changeit.controller;

import com.google.gson.Gson;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("/servlet")
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class ServletController {
    private static final long serialVersionUID = 1L;
    private static final String TYPE = "type";

    private Gson gson = new Gson();

    @GetMapping
    @Operation(summary = "", description = "")
    public void somethingGet(@RequestParam(name = TYPE, required = true) String type) {

    }

    @PostMapping
    @Operation(summary = "", description = "")
    public void somethingPost(@RequestParam(name = TYPE, required = true) String type) {

    }
}
