
@RestController
public class EventController{

@Autowired
private EventService service;



@PostMapping("/api/events")
public Event saveEvent(@RequestBody Event event){

return service.saveEvent(event);
}
}