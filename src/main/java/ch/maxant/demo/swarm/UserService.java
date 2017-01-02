package ch.maxant.demo.swarm;

import ch.maxant.demo.swarm.data.User;
import ch.maxant.demo.swarm.data.UserRepository;
import ch.maxant.demo.swarm.framework.cdi.Audited;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
@Audited //works on cdi bean too
public class UserService {

    @Inject
    UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }
}