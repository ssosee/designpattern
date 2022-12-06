package kr.ac.uos.reflection;

import javax.tools.Tool;

public class ReflectionTest {
    private String name;
    private String gender;
    private Tool use;

    public enum Tool {
        INTELLIJ, ECLIPSE
    }

    public ReflectionTest() {

    }

    private ReflectionTest(Tool use) {
        setUse(use);
        System.out.println("Tool = " + getUse());
    }

    private void setNameAndUse(String name, Tool use) {
        setName(name);
        setUse(use);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setUse(Tool use) {
        this.use = use;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Tool getUse() {
        return use;
    }
}
