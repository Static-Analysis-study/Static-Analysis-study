
/** The class comment */
public class CommentRequired implements Serializable {
    /** My list */
    List next;
    static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("next", List.class)};
}
        