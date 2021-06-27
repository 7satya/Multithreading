package Constructor;

public class ConstructorPackage {
    public int x;
    public int y;
    public String a;
    private String b;

    public ConstructorPackage() {
        this.x = 4;
        this.y = 5;
        this.a = "satya";
        this.b = "prakash";
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    public void CallPrivate() {
        getY();
    }

    public int returnAdd(int x, int y) {
        return x+y;
    }

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    private String addString(String a, String b) {
        return a+b;
    }

}
