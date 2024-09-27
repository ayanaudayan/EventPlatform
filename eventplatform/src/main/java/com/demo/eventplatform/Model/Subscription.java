@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscription{


@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String userId;
private String eventType;
}