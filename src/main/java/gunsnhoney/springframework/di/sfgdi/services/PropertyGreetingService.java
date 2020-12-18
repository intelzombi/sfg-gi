package gunsnhoney.springframework.di.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Property Hallo Welt";
    }
}
