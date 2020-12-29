package calculator;

import org.springframework.web.bind.annotation.*;

@RestController
class ArithmeticRestController {

    @GetMapping("/{operation}")
    public String calculate(@PathVariable String operation, @RequestParam int a, @RequestParam int b) {
        String response = "Unknown operation";
        int result;
        switch (operation) {
            case "add":
                result = a + b;
                Integer.Integer.toString(int)
                break;
            case "subtract":
                result = a - b;
                break;
            case "mult":
                result = a * b;
                break;
            default:
        }
        return response;
    }
}