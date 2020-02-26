package ast;

import java.util.List;

public class Record implements Type {
    private List<VarDefinition> definitions;
    private List<RecordField> recordFields;

    public Record(List<VarDefinition> definitions, List<RecordField> recordFields) {
        this.definitions = definitions;
        this.recordFields = recordFields;
    }
}
