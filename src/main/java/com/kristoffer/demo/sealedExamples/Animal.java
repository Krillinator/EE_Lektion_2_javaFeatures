package com.kristoffer.demo.sealedExamples;

public sealed interface Animal permits Cat, Dog {

    void talk();

}
