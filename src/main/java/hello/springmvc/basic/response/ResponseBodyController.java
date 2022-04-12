package hello.springmvc.basic.response;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Controller
public class ResponseBodyController {

    @GetMapping("/response-body-string-v1")
    public void responseBodyV1(HttpServletResponse response) throws IOException {
        response.getWriter().write("ok");

    }//

    @ResponseBody
    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/response-body-string-v2")
    public String responseBodyV2(@RequestParam String tt) throws IOException {

        log.info("{}",tt);
        return tt;
    }

    @ResponseBody
    @GetMapping("/response-body-string-v3")
    public String responseBodyV3() throws IOException {
        return "ok";
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/response-body-string-v4")
    public String responseBodyV4Json() throws IOException {

        return "testJson";
    }




}
