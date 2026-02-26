package src.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import src.Entity.TrafficSign;

public interface TrafficSignRepos extends JpaRepository<TrafficSign, Integer> {
}
