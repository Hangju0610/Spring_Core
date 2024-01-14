package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();

    // 조회 시
    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자를 private로 외부에서 생성하는 것을 막을 수 있다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
