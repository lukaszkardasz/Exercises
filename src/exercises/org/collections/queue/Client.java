package exercises.org.collections.queue;

/**
 * @author n2god on 15/07/2019
 * @project Exercises
 */
public class Client {
    private String nickname;

    public Client(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return nickname;
    }
}
