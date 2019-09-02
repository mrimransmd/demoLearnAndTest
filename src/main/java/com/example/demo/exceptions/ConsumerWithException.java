package com.example.demo.exceptions;

@FunctionalInterface
public interface ConsumerWithException<T, E extends Exception> {

    void apply(T t) throws E;
}