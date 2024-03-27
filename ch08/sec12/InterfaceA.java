package ch08.sec12;

public sealed interface InterfaceA permits InterfaceB {
    void methodA();
}
