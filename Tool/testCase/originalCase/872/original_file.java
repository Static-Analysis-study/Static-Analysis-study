
public class Foo {
    void foo(int bar) {
        for (int i=0; i < 10; i++) {
            doSomethingWith(i);
            switch (foo(i++)) {
                case 1: doSomething();
            }
        }
    }
}
        