package ast;

import visitor.Visitor;

import java.util.List;

public class Record extends AbstractType {
    private List<RecordField> recordFields;

    public Record(int line, int column, List<RecordField> recordFields) {
        super(line, column);
        this.recordFields = recordFields;
    }

    public List<RecordField> getRecordFields() {
        return recordFields;
    }

    @Override
    public Object accept(Visitor v, Object p){
        return v.visit(this, p);
    }
}
