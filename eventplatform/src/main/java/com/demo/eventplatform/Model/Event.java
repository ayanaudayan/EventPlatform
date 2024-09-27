

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event{

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String type;
private String data;
private Date timestamp;



}