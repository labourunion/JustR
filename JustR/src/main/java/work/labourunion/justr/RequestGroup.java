package work.labourunion.justr;

public class RequestGroup {
    public RequestGroup then(RequestGetter adder) {
        return this;
    }

    public RequestGroup thenIf(Comparator comparator, RequestGetter requestsIf, RequestGetter requestsElse) {
        return this;
    }

    public void start() {
        
    }

    public interface RequestGetter {
        Request[] get(Responses responses);
    }

    public interface Responses {
        <T> T get(int index);
    }

    public interface Comparator {
        boolean is(Responses responses);
    }
}
