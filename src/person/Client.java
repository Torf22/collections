package person;

import java.util.List;
import java.util.Objects;

public class Client {
    private Person person;
    private Auth auth;

    public Client() {
    }

    public Client(Person person) {
        this.person = person;
    }

    public Client(Person person, Auth auth) {
        this.person = person;
        this.auth = auth;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(person, client.person) &&
                Objects.equals(auth, client.auth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, auth);
    }

    @Override
    public String toString() {
        return "Client{" +
                "person=" + person +
                ", auth=" + auth +
                '}';
    }

//    public void method(List<Person> people, List<Auth> auths){
//        for (Object person : people) {
//            for (Auth auth : auths) {
//                if (person.getClass().);
//            }
//        }
//    }
}
