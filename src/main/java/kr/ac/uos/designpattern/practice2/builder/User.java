package kr.ac.uos.designpattern.practice2.builder;

public class User {
    private String name;
    private Integer age;

    private User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    static class UserBuilder {
        private String name;
        private Integer age;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(name, age);
        }
    }
}
