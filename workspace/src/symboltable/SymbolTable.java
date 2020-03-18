package symboltable;

import java.util.*;

import ast.Definition;

public class SymbolTable {

    private int scope = 0;
    // Lista de diccionarios, cada uno con clave y definición
    // Posición 0 scope 0, posición 1 scope 1,...
    private List<Map<String, Definition>> table;

    // Crear primera tabla y meterla en la lista
    public SymbolTable() {
        table = new ArrayList<>();
        table.add(new HashMap<String, Definition>());
    }

    // Añade un diccionario a la lista e incrementa el scope actual
    public void set() {
        scope++;
        table.add(new HashMap<String, Definition>());
    }

    // Elimina el último diccionario de la lista y decrementa el scope actual
    public void reset() {
        table.remove(scope);
        scope--;
    }

    // No hace falta pasar el nombre, lo lleva ya la definición
    // Scope de funciones siempre va a ser 0
    // True si la puede insertar (no estaba definida), false en caso contrario
    public boolean insert(Definition definition) {
        if (findInCurrentScope(definition.getName()) != null)
            return false;
        else {
            definition.setScope(scope);
            table.get(scope).put(definition.getName(), definition);
            return true;
        }
    }

    // Busca empezando por el scope más alto y va decrementando
    public Definition find(String id) {
        for (int i = scope; i >= 0; i--) {
            Definition def = table.get(i).get(id);
            if (def != null)
                return def;
        }
        return null;
    }

    public Definition findInCurrentScope(String id) {
        return table.get(scope).get(id);
    }
}
