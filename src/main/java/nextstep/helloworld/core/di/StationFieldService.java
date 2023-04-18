package nextstep.helloworld.core.di;

import org.springframework.stereotype.Service;

@Service
public class StationFieldService {
    private StationRepository stationRepository;

    public StationFieldService() {
        this.stationRepository = new StationRepository();
    }

    public String sayHi() {
        return stationRepository.sayHi();
    }
}
