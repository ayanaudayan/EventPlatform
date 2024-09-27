
@Service
public class EventServiceImpl implements EventService{

@Autowired
private EventRepository repository;

@Override
public Event saveEvent(Event event){

return repository.save(event);
}

}