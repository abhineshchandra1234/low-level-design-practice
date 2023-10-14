package model.account;

@Getter
@Setter
public abstract class Account {
    private String id;
    private String email;
    private String userName;
    private String password;
    private LocalDateTime lastAccessed;
    private Contact contact;
}
