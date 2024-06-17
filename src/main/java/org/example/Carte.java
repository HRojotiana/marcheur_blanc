package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Carte {
    private final Set<Rue> rues;
}