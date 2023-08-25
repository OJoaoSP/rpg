package rpg.api.controllers;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.data.repository.support.Repositories;

public class PersonagemRepository extends Repositories {
    public PersonagemRepository(ListableBeanFactory factory) {
        super(factory);
    }
}
