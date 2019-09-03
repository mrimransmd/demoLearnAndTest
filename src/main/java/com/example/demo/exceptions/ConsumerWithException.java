package com.example.demo.exceptions;

@FunctionalInterface
public interface ConsumerWithException<T, E extends CustomDemoException> {

    void apply(T t) throws E;
}