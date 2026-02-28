package src.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import src.Entity.TrafficSign;
import src.Service.TrafficSignService;

import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
@RequiredArgsConstructor
public class TrafficApiController {
    private final TrafficSignService trafficSignService;
    @PostMapping("/traffic-data")
    public void receive(@RequestBody Map<String, Object> data) {
        Integer signId = (Integer) data.get("signId");
        trafficSignService.handle(signId);
    }

    @GetMapping("/current-sign")
    public ResponseEntity<?> current() {
        TrafficSign sign = trafficSignService.getLatest();

        if (sign == null) {
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.ok(sign);
    }
}