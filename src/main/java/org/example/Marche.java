package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Marche {
    private List<Lieu> lieux;
}

