package demo; // Đảm bảo package này trùng với thư mục demo của bạn

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {


    @GetMapping({"/", "/index"})
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @GetMapping("/contact")
    public String showContactPage() {
        return "contact";
    }

    @GetMapping("/vsr")
    public String showVsrPage() {
        return "vsr";
    }

    @PostMapping("/register")
    public String handleRegister() {

        System.out.println("VSR System: Đã nhận yêu cầu đăng ký tài khoản mới!");
        return "redirect:/login";
    }
    
    @PostMapping("/login")
    public String handleLogin() {
        System.out.println("VSR System: Đang thực hiện xác thực người dùng...");
        return "redirect:/";
    }

    @PostMapping("/contact")
    public String handleContact() {
        System.out.println("VSR System: Đã nhận thông tin liên hệ từ khách hàng!");
        return "redirect:/contact";
    }
}