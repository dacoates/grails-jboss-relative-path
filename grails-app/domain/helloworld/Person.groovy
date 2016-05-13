package helloworld

class Person {

    String name

    static mapping = {
        id column:'person_key', generator:'sequence-identity', params:[sequence:'person_key_seq']
    }
}
